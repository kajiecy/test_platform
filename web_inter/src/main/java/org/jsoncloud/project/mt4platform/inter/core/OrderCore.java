package org.jsoncloud.project.mt4platform.inter.core;

import com.alibaba.fastjson.JSON;
import org.jsoncloud.framework.mybatis.MybatisDao;
import org.jsoncloud.framework.redis.RedisDao;
import org.jsoncloud.project.mt4_platform.soap.*;
import org.jsoncloud.project.mt4_platform.soap.holders.TradeRecordInfoHolder;
import org.jsoncloud.project.mt4platform.base.redis.UserRedis;
import org.jsoncloud.project.mt4platform.base.tableenum.OrderCommandEnum;
import org.jsoncloud.project.mt4platform.dao.OrderMapper;
import org.jsoncloud.project.mt4platform.dao.SymbolMapper;
import org.jsoncloud.project.mt4platform.po.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.xml.rpc.holders.IntHolder;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("ALL")
@Service
public class OrderCore {
    @Resource
    private MybatisDao mybatisDao;
    @Autowired
    private RedisDao redisDao;

    @Autowired
    private SymbolMapper symbolMapper;
    @Autowired
    private OrderMapper orderMapper;

    /**
     * 计算单个订单的 USD
     *
     * @param symbol    交易产品类型
     * @param command   交易类型
     * @param symbolMap map
     * @param subtract  现价与买入价的差价
     * @return
     */
    public BigDecimal getSingleOrderUSD(String symbol, int command, Map symbolMap, BigDecimal subtract,MTMServiceSoap_PortType mtmServiceSoap_portType,ManagerInfo managerInfo, BigDecimal storage) {
        Map args = new HashMap();
        args.put("symbol", symbol);
        List<Map<String, Object>> selectMapList = this.mybatisDao.selectMapList("SymbolMapper.selectFinalValueBySymbol", args);
        if (selectMapList != null && selectMapList.size() == 1) {
            Map<String, Object> stringObjectMap = selectMapList.get(0);
            Object final_value = stringObjectMap.get("final_value");
            if (final_value != null) {

                int finalValue = (Integer) final_value;
                int id_ = (Integer) stringObjectMap.get("id"); // 获取当前 symbol 的主键值
                if (finalValue > 0 && finalValue != 999999) {

                    BigDecimal nowRate = BigDecimal.ONE;
                    if (command == OrderCommandEnum.OP_BUY.getValue()) { // BUY
                        String bid = ((Map<String, String>) symbolMap.get(symbol)).get("bid");
                        nowRate = new BigDecimal(bid);
                    } else if (command == OrderCommandEnum.OP_SELL.getValue()) { // SELL
                        String ask = ((Map<String, String>) symbolMap.get(symbol)).get("ask");
                        nowRate = new BigDecimal(ask);
                    }
                    subtract = subtract.multiply(nowRate);
                } else if (finalValue < 0) {
                    finalValue = finalValue * -1;
                    BigDecimal nowRate = BigDecimal.ONE;
                    if (finalValue == id_) {
                        if (command == OrderCommandEnum.OP_SELL.getValue()) { // SELL
                            String ask = ((Map<String, String>) symbolMap.get(symbol)).get("ask");
                            nowRate = new BigDecimal(ask);
                        } else if (command == OrderCommandEnum.OP_BUY.getValue()) { //BUY
                            String bid = ((Map<String, String>) symbolMap.get(symbol)).get("bid");
                            nowRate = new BigDecimal(bid);
                        }
                    } else {
                        String symbol_ = this.symbolMapper.selectByPrimaryKey(finalValue).getSymbol(); //获取 final_value 所对应的 symbol
                        if (command == OrderCommandEnum.OP_SELL.getValue()) { // SELL
                            nowRate = new BigDecimal(((Map<String, String>) symbolMap.get(symbol_)).get("ask"));
                        } else if (command == OrderCommandEnum.OP_BUY.getValue()) { //BUY
                            nowRate = new BigDecimal(((Map<String, String>) symbolMap.get(symbol_)).get("bid"));
                        }
                    }
                    subtract = subtract.divide(nowRate, 16, BigDecimal.ROUND_HALF_UP);
                } else if (finalValue == 999999){ // = (开仓价格-当前价格)*报价值/报价量
                    SymbolInfo info = null;
                    Map<String,Object> infoMap;
                    double tick_value = 0.0;
                    double tick_size = 0.0;
                    try {
                        String symbolInfo = this.redisDao.getValue(symbol);
                        Object parse = JSON.parse(symbolInfo);
                        infoMap = (Map<String,Object>) parse;
                        tick_value = ((BigDecimal) infoMap.get("tick_value")).doubleValue();
                        tick_size = ((BigDecimal) infoMap.get("tick_size")).doubleValue();
                    } catch (Exception e) {
                        try {
                            //cymark get到之后把他存进去
                            info = mtmServiceSoap_portType.getSymbolInfo(symbol, managerInfo);
                        } catch (RemoteException re) {
                            re.printStackTrace();
                        }
                        tick_value = info.getTick_value(); //报价值
                        tick_size = info.getTick_size(); //报价量
                    }
                    subtract = BigDecimal.valueOf(subtract.doubleValue() * tick_value / tick_size);
                    Object remark = stringObjectMap.get("remark");
                    if (remark != null) {
                        String remarkStr = (String) remark;
                        BigDecimal nowRate = BigDecimal.ONE;
                        if (command == 1) { //SELL
                            nowRate = new BigDecimal(((Map<String, String>) symbolMap.get(remarkStr)).get("ask"));
                        } else if (command == 0) {//BUY
                            nowRate = new BigDecimal(((Map<String, String>) symbolMap.get(remarkStr)).get("bid"));
                        }
                        subtract = subtract.multiply(nowRate);
                    }
                }
            }
        }

        if (storage != null){
//            subtract = subtract.subtract(storage);
            subtract = subtract.add(storage);
        }
        return subtract;
    }

    /**
     * 添加一个用户用户订单 返回订单id
     * @param command 订单类型
     * @param volumn 手数
     * @param sl 止损
     * @param tp 止盈
     * @param price 操作价
     * @param storage 库存金
     * @param old_id 就id
     */
    public int addOrder4Local(int login_id,String symbol,int digids,Integer command,BigDecimal volumn,BigDecimal sl,BigDecimal tp,BigDecimal price,BigDecimal storage,Integer old_id){
        Order order = new Order();
        order.setDigits(digids);
        order.setLoginId(login_id);
        order.setSymbol(symbol);
        order.setCommand(command);
        order.setVolume(volumn);
        order.setStoploss(sl);
        order.setTakeprofit(tp);
        order.setPrice(price);
        order.setStorage(storage);
        if(old_id!=null){
            order.setComment("form #"+old_id);
        }
        order.setCreateTime(new Date());
        orderMapper.insertSelective(order);
        return order.getId();
    }
//    private int account;
//    private int command;
//    private java.lang.String comment;
//    private int volume;
//    private java.lang.String symbol;
//    private double price;
//    private double stoploss;
//    private double takeprofit;
    public int addOrder4Our(Integer login_id,String symbol,Integer command,BigDecimal volumn,BigDecimal sl,BigDecimal tp,BigDecimal price,MTMServiceSoap_PortType mtmServiceSoap_portType,ManagerInfo managerInfo) {
        TradeTransInfo order = new TradeTransInfo();
        order.setAccount(login_id);
        order.setCommand(command);
        order.setComment("");
        order.setVolume(volumn.intValue());
        order.setSymbol(symbol);
        //如果是买或者卖price赋值为0
        if(command==0||command==1){
            order.setPrice(0);
        }else {
            order.setPrice(price.doubleValue());
        }
        order.setStoploss(sl.doubleValue());
        order.setTakeprofit(tp.doubleValue());
        try {
            TradeRecordInfoHolder addNewTradeRecordResult = new TradeRecordInfoHolder();
            IntHolder intHolder = new IntHolder();
            mtmServiceSoap_portType.addNewTradeRecord(order,managerInfo,addNewTradeRecordResult,intHolder);
            return addNewTradeRecordResult.value.getOrder();
        }catch(RemoteException e){
            e.printStackTrace();
            return -1;
        }
    }
}
