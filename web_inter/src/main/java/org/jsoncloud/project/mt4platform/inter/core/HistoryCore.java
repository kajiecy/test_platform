package org.jsoncloud.project.mt4platform.inter.core;

import org.jsoncloud.project.mt4platform.dao.HistoryMapper;
import org.jsoncloud.project.mt4platform.dao.OrderMapper;
import org.jsoncloud.project.mt4platform.po.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/9/21
 * @desc
 */
@Service
public class HistoryCore {

    @Autowired
    private HistoryMapper historyMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
    public void orderToHistory(Map map){
        // 取出 order 中的字段
        Object id = map.get("id");
        Object loginId = map.get("login_id");
        Object command = map.get("command");
        Object margin = map.get("margin");
        Object volume = map.get("volume");
        Object symbol = map.get("symbol");
        Object price = map.get("price");
        Object stoploss = map.get("stoploss");
        Object takeprofit = map.get("takeprofit");
        Object create_time = map.get("create_time");
        Object close_price = map.get("close_price");
        Object profit = map.get("profit");
        Object storage = map.get("storage");

        // 保存为 history
        History history = new History();
        history.setLoginId(loginId == null ? null : (Integer) loginId); // LoginId
        history.setSymbol(symbol == null ? null : (String) symbol); // symbol
        history.setCmd(command == null ? null : (Integer) command); // command
        history.setVolume(volume == null ? null : (BigDecimal) volume); // volume
        history.setSl(stoploss == null ? null : (BigDecimal) stoploss); // stopless
        history.setTp(takeprofit == null ? null : (BigDecimal) takeprofit);//takeprofit
        history.setMarginRate(margin == null ? null : (Integer) margin);// margin
        history.setOpenTime(create_time == null ? null : (Date) create_time); //openTime
        history.setOpenPrice(price == null ? null : (BigDecimal) price); // openPrice
        history.setCloseTime(new Date());
        history.setClosePrice(close_price == null ? null : (BigDecimal) close_price); // close_price
        history.setProfit(profit == null ? null : (BigDecimal) profit);
        history.setStorage(storage == null ? null : (BigDecimal) storage);
        history.setCreateTime(new Date());

        this.historyMapper.insert(history);

        //删除该订单
        this.orderMapper.deleteByPrimaryKey((Integer) id);
    }

}
