package org.jsoncloud.project.mt4platform.inter.core;

import org.jsoncloud.framework.exception.ErrorEnum;
import org.jsoncloud.framework.mybatis.MybatisDao;
import org.jsoncloud.framework.sms.PropertiesUtil;
import org.jsoncloud.framework.util.StringUtil;
import org.jsoncloud.framework.util.TokenUtil;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4_platform.soap.*;
import org.jsoncloud.project.mt4platform.base.redis.UserRedis;
import org.jsoncloud.project.mt4platform.base.tableenum.LoginTypeEnum;

import org.jsoncloud.project.mt4platform.dao.LoginMapper;

import org.jsoncloud.project.mt4platform.dao.AdminMapper;

import org.jsoncloud.project.mt4platform.dao.ServiceMapper;
import org.jsoncloud.project.mt4platform.inter.Constants;
import org.jsoncloud.project.mt4platform.po.Login;
import org.jsoncloud.project.mt4platform.po.Service;
import org.jsoncloud.project.mt4platform.rongyun.methods.User;
import org.jsoncloud.project.mt4platform.rongyun.models.TokenResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@SuppressWarnings("ALL")
@Controller
public class UserCore {

    @Resource
    private MybatisDao mybatisDao;
    @Resource
    private UserRedis userRedis;
    @Resource
    private ServiceMapper serviceMapper;
    @Resource
    private LoginMapper loginMapper;

    public boolean hasUserByPhone(String phone) {
        //判断库中手机号用户是否存在
        int ud = mybatisDao.selectOne(Integer.class, "UserMapper.hasUserByPhone", phone);
        if (ud > 0) {
            return true;
        }
        return false;
    }

    /**
     * 用户信息
     */
    public Map<String, Object> getUserById(int user_id) {
        return getUserById(user_id, false);
    }

    /**
     * 获取用户信息
     */
    public Map<String, Object> getUserById(int user_id, boolean has_clock) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (has_clock) {
            map.put("lock", 1);
        }
        map.put("id", user_id);
        Map<String, Object> nowuser = mybatisDao.selectMapOne("UserMapper.selUserInfo", map);
        if (nowuser == null) {
            return null;
        }
        return nowuser;
    }


    /**
     * 修改用户 信息
     *
     * @param user_id  用户昵称
     * @param nickname
     * @return
     */
    public void updateOther(int user_id
            , String nickname
            , Integer sex) {
        if (nickname == null && sex == null) {
            return;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", user_id);
        map.put("nickname", nickname);
        map.put("sex", sex);
        mybatisDao.update("UserMapper.updateOther", map);
    }


    public Map<String,Object> loginToLocal(Integer loginid,String pwd,Integer phonetype,String clientid,String token){

        //匹配数据库判断是否登陆OK
        Map<String, Object> condition = new HashMap<String, Object>();
        condition.put("login_id", loginid);
        Map<String, Object> login = mybatisDao.selectMapOne("LoginMapper.selLogin", condition);
        if (login == null) {
            return ResponseMap.error(ErrorEnum.INVALID_LOST.getCode(), "该账号不存在").result();
        }
        //登陆成功，生成最新的token，入库
        String db_pwd = StringUtil.toString(login.get("pwd"), null);
        if (!pwd.equals(db_pwd)) {//匹配密码是否正确
            return ResponseMap.error(ErrorEnum.INVALID_VALUE.getCode(), "密码错误").result();
        }
        String old_token = StringUtil.toString(login.get("login_token"), "");
        String new_token = TokenUtil.getInstance().generateToken(loginid.toString(), true);
        condition.clear();
        condition.put("login_token", new_token);
        condition.put("login", loginid);
        condition.put("phonetype",phonetype);
        condition.put("clientid",clientid);
        condition.put("token",token);
        mybatisDao.selectMapOne("LoginMapper.updateTokenById", condition);
        //添加最新的用户数据到redis服务器
        login.put("login_token", new_token);
        login.put(Constants.PARAM_LOGIN_KIND, LoginTypeEnum.LOCAL_SERVER.getValue());
        userRedis.doLogin(old_token, new_token, login);
        //移除不必要的
        login.remove("pwd");
        Map<String, Object> returnInfo = new HashMap<>();
        //添加用户系信息
        returnInfo.put("id", login.get("id"));
        returnInfo.put("name", login.get("name"));
        returnInfo.put("group_name", login.get("group_name"));
        returnInfo.put("balance", login.get("balance"));
        //寻找服务器讯息
        Service service = serviceMapper.selectByPrimaryKey(1);
        returnInfo.put("serviceId", service.getId());
        returnInfo.put("serviceName", service.getName());
        returnInfo.put("serviceDesc", service.getServiceDesc());
        returnInfo.put("serviceImg", service.getImg());
        returnInfo.put("serviceType", service.getType());

        Login login_ = new Login();
        login_.setId(Integer.valueOf(login.get("id").toString()));
        login_.setName(login.get("name").toString());

        return ResponseMap.success("登陆成功")
                .data(Constants.PARAM_LOGIN_TOKEN, new_token)
                .data("loginInfo", returnInfo)
                .data("rongyunInfo", getRongYunInfo(login_))
                .result();
    }

    public Map<String,Object> loginToOutServer(Integer loginid,String pwd,Integer type,Integer phone_type,String clientid,String token,String serviceid) throws ServiceException, RemoteException {

        MTMServiceLocator mtmServiceLocator = new MTMServiceLocator();
        MTMServiceSoap_PortType mtmServiceSoap_portType = mtmServiceLocator.getMTMServiceSoap12();
        ManagerInfo managerInfo = new ManagerInfo();
        if (type == LoginTypeEnum.DEMO_SERVER.getValue()) {
            managerInfo.setLogin(Integer.parseInt(PropertiesUtil.get("test_login")));
            managerInfo.setPassword(PropertiesUtil.get("test_pwd"));
            managerInfo.setServer(PropertiesUtil.get("test_addr"));
        } else if (type == LoginTypeEnum.REAL_SERVER.getValue()) {
            managerInfo.setLogin(Integer.parseInt(PropertiesUtil.get("real_login")));
            managerInfo.setPassword(PropertiesUtil.get("real_pwd"));
            managerInfo.setServer(PropertiesUtil.get("real_addr"));
        }
        int result = mtmServiceSoap_portType.checkUserPassword(loginid, pwd, managerInfo);
        if (result != 0) {
            return ResponseMap.error(ErrorEnum.INVALID_LOST.getCode(), "密码不正确").result();
        }
        //检查密码成功后 获取用户信息
        LoginsList loginsList = new LoginsList(new LoginInfo[]{new LoginInfo(loginid)});
        AccountCollection collection = mtmServiceSoap_portType.getAccountsList(loginsList, managerInfo);
        AccountDesc[] accountDescs = collection.getItems();
        AccountDesc accountDesc = accountDescs[0];

        Map<String, Object> returnInfo = new HashMap<>();
        //添加用户系信息
        returnInfo.put("id", accountDesc.getUser().getLogin());
        returnInfo.put("name", accountDesc.getUser().getName());
        returnInfo.put("group_name", accountDesc.getUser().getGroup());
        returnInfo.put("balance", accountDesc.getUser().getBalance());
        //查询出服务器信息之后 查询 数据库中 login表是否有此数据 有 更新 信息 没有就添加一条信息

        Map<String,Object> condition = new HashMap<>();
        condition.put("login_id",accountDesc.getUser().getLogin());
        Map<String,Object> info = mybatisDao.selectMapOne("LoginMapper.selLogin",condition);
        if(info==null){
            Login login = new Login();
            login.setId(accountDesc.getUser().getLogin());
            login.setName("111");
            login.setPhonetype(phone_type);
            login.setClientid(clientid);
            login.setToken(token);
            loginMapper.insertSelective(login);
        }
        //寻找服务器讯息
        Service service = serviceMapper.selectByPrimaryKey(Integer.parseInt(serviceid));
        returnInfo.put("serviceId", service.getId());
        returnInfo.put("serviceName", service.getName());
        returnInfo.put("serviceDesc", service.getServiceDesc());
        returnInfo.put("serviceImg", service.getImg());
        returnInfo.put("serviceType", service.getType());

        //通过接口检查用户的密码成功后 分配一个token
        String new_token = TokenUtil.getInstance().generateToken(loginid.toString(), true);
        //根据login_id 查询信息
        Map<String,Object> login_out = mybatisDao.selectMapOne("LoginMapper.selLogin",condition);
        String old_token =login_out.get("login_token")==null?"":(String)login_out.get("login_token");

        Map<String, Object> map = new HashMap<>();
        map.put("id", loginid);
        map.put(Constants.PARAM_LOGIN_KIND, type);
        map.put(Constants.PARAM_LOGIN_TOKEN, new_token);
        map.put("group_name",accountDesc.getUser().getGroup());
        userRedis.doLogin(old_token, new_token, map);

        Login uptoken = new Login();
        uptoken.setId((Integer) login_out.get("id"));
        uptoken.setLoginToken(new_token);
        loginMapper.updateByPrimaryKeySelective(uptoken);

        Login login = new Login();
        login.setId(Integer.valueOf(accountDesc.getUser().getLogin()));
        login.setName(accountDesc.getUser().getName());

        return ResponseMap.success("登陆成功")
                .data(Constants.PARAM_LOGIN_TOKEN, new_token)
                .data("loginInfo", returnInfo)
                .data("rongyunInfo", getRongYunInfo(login))
                .result();
    }



    private static String appkey;
    private static String appSecret;
    private static String headerImg;

    static {
        appkey = org.jsoncloud.framework.util.PropertiesUtil.get("rongcloud_app_key");
        appSecret = org.jsoncloud.framework.util.PropertiesUtil.get("rongcloud_app_secret");
        headerImg = org.jsoncloud.framework.util.PropertiesUtil.get("headerImg");
    }


    public Map getRongYunInfo(Login login) {
        Map params = new HashMap();
        params.put("loginId", login.getId() + "");
        List<Map<String, Object>> list = this.mybatisDao.selectMapList("UserMapper.selectAdmin", params);

        Map result = new HashMap();
        if (list != null && list.size() > 0 && list.get(0) != null) {
            result.put("admin", list.get(0).get("admin_id"));
        } else {
            result.put("admin", 1);
        }

        User user = new User(appkey, appSecret);
        try {
            TokenResult token = user.getToken(login.getId().toString(), login.getName(), headerImg);
            result.put("token", token);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
