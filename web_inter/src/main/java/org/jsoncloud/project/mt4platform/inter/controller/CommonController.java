package org.jsoncloud.project.mt4platform.inter.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.jsoncloud.framework.exception.ErrorEnum;
import org.jsoncloud.framework.exception.ProjectException;
import org.jsoncloud.framework.redis.code.RedisImgCodeManager;
import org.jsoncloud.framework.sms.PropertiesUtil;
import org.jsoncloud.framework.util.DateUtil;
import org.jsoncloud.framework.util.StringUtil;
import org.jsoncloud.framework.util.TokenUtil;
import org.jsoncloud.framework.verifcode.img.ImgCodeBean;
import org.jsoncloud.framework.verifcode.sms.SmsCodeBean;
import org.jsoncloud.framework.verifcode.sms.SmsCodeTypeEnum;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.request.RequestData;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.framework.web.util.ClientUtil;
import org.jsoncloud.project.mt4_platform.push.PushPioneer;
import org.jsoncloud.project.mt4_platform.soap.MTMServiceLocator;
import org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType;
import org.jsoncloud.project.mt4_platform.soap.ManagerInfo;
import org.jsoncloud.project.mt4_platform.soap.UserRecordCS;
import org.jsoncloud.project.mt4platform.base.Util.InterUtil;
import org.jsoncloud.project.mt4platform.base.redis.UserRedis;
import org.jsoncloud.project.mt4platform.base.tableenum.LoginTypeEnum;
import org.jsoncloud.project.mt4platform.base.tableenum.VersionCodeEnum;
import org.jsoncloud.project.mt4platform.dao.DictionaryMapper;
import org.jsoncloud.project.mt4platform.dao.EmailMapper;
import org.jsoncloud.project.mt4platform.dao.LoginMapper;
import org.jsoncloud.project.mt4platform.dao.UserMapper;
import org.jsoncloud.project.mt4platform.inter.Constants;
import org.jsoncloud.project.mt4platform.inter.core.UserCore;
import org.jsoncloud.project.mt4platform.inter.smsutil.RedisSmsCodeManager2;
import org.jsoncloud.project.mt4platform.inter.smsutil.SmsCodeManager;
import org.jsoncloud.project.mt4platform.po.*;
import org.jsoncloud.project.mt4platform.po.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.IntHolder;
import java.io.*;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 */
@SuppressWarnings("ALL")
@Controller
@RequestMapping("/common")
public class CommonController extends BaseController {

    @Resource
    private RedisImgCodeManager redisImgCodeManager;
    @Resource
    private RedisSmsCodeManager2 redisSmsCodeManager;
    @Resource
    private UserCore userCore;
    @Autowired
    private UserRedis userRedis;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    private EmailMapper emailMapper;
    @Autowired
    private DictionaryMapper dictionaryMapper;

    @ResponseBody
    @RequestMapping("/getCodeToken.json")
    public Map<String, Object> getCodeToken(HttpServletRequest request) {
        String clientIP = ClientUtil.getClientIP(request);
        logger.debug("[getCodeToken-ip:]:[" + clientIP + "]");
        String code_token = TokenUtil.getInstance().generateToken(clientIP, true);
        return ResponseMap.success("获取成功").data("code_token", code_token).result();
    }

    @RequestMapping("/validcode.png")
    public void validcode(HttpServletResponse response, String code_token) throws IOException {
        if (StringUtil.hasEmpty(code_token)) {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter pw = response.getWriter();
            pw.println("code_token 缺失");
            return;
        }
        try {
            response.setContentType("image/png");
            OutputStream os = response.getOutputStream();
            redisImgCodeManager.buildImgCode(code_token, null, os);
        } catch (IOException e) {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter pw = response.getWriter();
            pw.println("验证码生成失败");
            logger.error("验证码生成失败", e);
            return;
        }
    }

    /**
     * 获取版本信息
     * type：bus_android 、user_android
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("version.json")
    public Map<String, Object> version(HttpServletRequest request, HttpSession session) {
        RequestData data = new RequestBodyJSON(request);
        String code = data.getStringMust("code", "当前应用标识缺失");
        String app_version = data.getStringMust("app_version", "当前app的版本缺失");
        Double pro_version = data.getDoubleMust("pro_version", "当前省市区的版本号缺失");

        if (!code.equals(VersionCodeEnum.Android.getCode())
                && !code.equals(VersionCodeEnum.IOS.getCode())
                ) {
            throw new ProjectException(ErrorEnum.INVALID_TYPE.getCode(), "数据不匹配", "type参数无效:");
        }
        //获取最新的版本
        Map<String, Object> condition = getCondition();
        condition.put("code", code);
        condition.put("version_name", app_version);
        Map<String, Object> app = mybatisDao.selectMapOne("VersionMapper.selectLastApp", condition);
        if (app != null) {
            Integer is_must = mybatisDao.selectOne(Integer.class, "VersionMapper.selectHasMust", condition);
            app.put("is_must", is_must);
        }
//        //获取最新的版本
//        double pro_version_ad = StringUtil.toDouble(SystemCore.getProvincialVersion(mybatisDao), -1);
//        //版本变动  返回省市区信息
//        Map<String, Object> app_pro = null;
//        if (pro_version_ad != -1 && pro_version_ad > pro_version) {
//            app_pro = new HashMap<>();
//            condition.clear();
//            List<Map<String, Object>> pro = null;
//            pro = mybatisDao.selectMapList("VersionMapper.selectPro", condition);
//            app_pro.put("version_name", pro_version_ad);
//            app_pro.put("pro", pro);
//        }
        return ResponseMap.success("版本信息成功")
                .data("app", app).result();
//                .data("app_pro", app_pro)
    }

    /**
     * 获取版本信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("versionLast.json")
    public Map<String, Object> versionLast(HttpServletRequest request) {
        List<Map<String, Object>> versions = mybatisDao.selectMapList("VersionMapper.selVersionLast", null);
        logger.debug("versions:" + versions);
        return ResponseMap.success("获取最新的版本")
                .data("versions", versions)
                .result();
    }

    /**
     * 登录 登陆到三种服务器中
     * 1 本地服务器
     * 2 模拟服务器
     * 3 真实服务器
     *
     * @throws
     */
    @ResponseBody
    @RequestMapping("/login.json")
//    @Transactional
    public Map<String, Object> login(HttpServletRequest request) throws ServiceException, RemoteException {
        RequestData data = new RequestBodyJSON(request);
        logger.debug(data.getStringMust("loginid", "请输入登陆id"));
        Integer loginid = Integer.parseInt(data.getStringMust("loginid", "请输入登陆id"));
        String pwd = data.getStringMust("pwd", "请输入密码");
        Integer logintype = data.getIntNull("type");
        if(logintype==null){
            logintype = LoginTypeEnum.DEMO_SERVER.getValue();
        }
        Integer phonetype = data.getIntNull("phonetype");
        String clientid = data.getStringNull("clientid");
        String token = data.getStringNull("token");
        String serviceid = data.getStringNull("serviceid");

        String applicationType = data.getStringNull("isStock");
        applicationType = "1".equals(applicationType)?"USAStock":"MT4";

        if(serviceid==null){
            serviceid="2";
        }
        //本地服务器调用此方法
        if (logintype == LoginTypeEnum.LOCAL_SERVER.getValue()){
            return userCore.loginToLocal(loginid, pwd,phonetype,clientid,token,applicationType);
            //外部服务器走这里
        } else if (logintype == LoginTypeEnum.REAL_SERVER.getValue() || logintype == LoginTypeEnum.DEMO_SERVER.getValue()){
            return userCore.loginToOutServer(loginid, pwd, logintype,phonetype,clientid,token,serviceid,applicationType);
        }else{
            return ResponseMap.error(ErrorEnum.INVALID_LOST.getCode(),"登陆的服务器类型有误").result();
        }
    }

    @ResponseBody
    @RequestMapping("test.json")
    public String addOilInfo(HttpServletRequest request, String url, String access_token) {

//        https://graph.qq.com/user/get_user_info?
//        access_token=*************&
//        oauth_consumer_key=1106349754&
//        openid=****************&
//        format=json


//        callback( {"client_id":"1106349754","openid":"5F266BD6A5967EAF39223E042D63DB53"} );
        String firReturn = sendRequest(url);
        String openid = firReturn.substring(firReturn.indexOf("openid") + 9, firReturn.lastIndexOf("\""));
        String getInfoUrl = "https://openmobile.qq.com/user/get_simple_userinfo?"
                + "access_token=" + access_token + "&"
                + "oauth_consumer_key=1106349754&"
                + "openid=" + openid + "&format=json";
        String userinfo = sendRequest(getInfoUrl);
        return openid;
    }

    public String sendRequest(String url) {
        String result = "";
        BufferedReader in = null;
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }



    /**
     * 注册
     *
     * @throws
     */
    @ResponseBody
    @RequestMapping("/reg.json")
    public Map<String, Object> reg(HttpServletRequest request) throws RemoteException, UnsupportedEncodingException, ServiceException{
        // 获取传参的参数
        RequestData data = new RequestBodyJSON(request);
        String code = data.getStringMust("code", "验证码不能为空！");
        String phone = data.getStringMust("phone", "手机号不能为空");
        String name = data.getStringMust("name", "姓名不能为空");
        String qqnum = data.getStringMust("qqnum", "QQ号码不能为空！");
        String email = data.getStringMust("email", "Email不能为空");
        String code_token = data.getStringMust(Constants.PARAM_CODE_TOKEN, "CodeToken缺失！");
        Integer money = data.getIntMust("money", "请输入金额");
        String isStock = data.getStringNull("isStock");
        isStock = "1".equals(isStock)?"美股APP":"MT4管理员";

        String pwd = InterUtil.createPwd();
//      代理人id
        Integer referees_id = null;

        Map<String, Object> condition = getCondition();
        Map<String, Object> refereesinfo = null;
//        // 判断 用户输入的验证码 和 生成的验证码是否一致
        if (!redisSmsCodeManager.compareCode(code_token, code, phone, SmsCodeTypeEnum.REGISTER.getType())){
            return ResponseMap.error(ErrorEnum.INVALID_LOST.getCode(), "验证码错误").result();
        }
        //添加注册的用户
//        向测试服务器发送请求 创建账户 创建好账户后记录下账户信息 放到login表中

        User user = new User();
        user.setPhone(phone);
        user.setCreateTime(new Date());
        user.setName(name);
        user.setQqnum(qqnum);
        user.setEmail(email);
        user.setUserFrom(isStock);

        MTMServiceLocator mtmServiceLocator = new MTMServiceLocator();
        MTMServiceSoap_PortType mtmServiceSoap_portType = mtmServiceLocator.getMTMServiceSoap12();
        UserRecordCS userRecordCS = new UserRecordCS();

        userRecordCS.setLogin(0);
        if("美股APP".equals(isStock)){
//            userRecordCS.setGroup("allsymbols");
            userRecordCS.setGroup("demoadvanced");
        }else {
            userRecordCS.setGroup("demoadvanced");
        }
        userRecordCS.setPassword(pwd);
        userRecordCS.setEnable(1);
        userRecordCS.setEnable_change_password(1);
        userRecordCS.setEnable_read_only(0);
        userRecordCS.setPassword_investor(pwd);
        userRecordCS.setPassword_phone(pwd);
        HanyuPinyinHelper hanyuPinyinHelper = new HanyuPinyinHelper();
        userRecordCS.setName(hanyuPinyinHelper.toHanyuPinyin(name));
        userRecordCS.setCountry("china");
        userRecordCS.setCity("china");
        userRecordCS.setState("china");
        userRecordCS.setZipcode("1222");
        userRecordCS.setAddress("china");
        userRecordCS.setPhone(phone);
        userRecordCS.setEmail(email);
        userRecordCS.setComment("china");
        userRecordCS.setId("");
        userRecordCS.setStatus("1");
        int time = Integer.valueOf(DateUtil.date2String(user.getCreateTime(), "yyyyMMdd"));
        userRecordCS.setRegdate(time);
        userRecordCS.setLastdate(time);
        userRecordCS.setLeverage(100);
        userRecordCS.setAgent_account(22);
        userRecordCS.setTimestamp(new Long(new Date().getTime()/1000).intValue());
        userRecordCS.setBalance(money);
        userRecordCS.setPrevmonthbalance(0);
        userRecordCS.setPrevbalance(0);
        userRecordCS.setCredit(0);
        userRecordCS.setInterestrate(0);
        userRecordCS.setTaxes(0);
        userRecordCS.setPublickey("");
        userRecordCS.setSend_reports(1);
        userRecordCS.setBalance_status(1);
        userRecordCS.setUser_color(0xffffff);
        userRecordCS.setApi_data("");

        ManagerInfo managerInfo = new ManagerInfo();
        managerInfo.setLogin(PropertiesUtil.getInt("test_login"));
        managerInfo.setPassword(PropertiesUtil.get("test_pwd"));
        managerInfo.setServer(PropertiesUtil.get("test_addr"));
        userRecordCS = mtmServiceSoap_portType.addNewUser(userRecordCS, managerInfo);
        //创建模拟服务器用户成功后为user表数据
        //为login表添加数据
        user.setLoginName(userRecordCS.getLogin()+"");
        user.setLoginPwd(pwd);
//        if (!userCore.hasUserByPhone(phone)){
//            user.setName(AESUtil.encrypt(user.getName()));
//            user.setPhone(AESUtil.encrypt(user.getPhone()));
//            user.setQqnum(AESUtil.encrypt(user.getQqnum()));
//            user.setEmail(AESUtil.encrypt(user.getEmail()));
            userMapper.insertSelective(user);
//        }


        Login login = new Login();
        login.setId(userRecordCS.getLogin());
        login.setName(name);
        login.setPwd(pwd);
        if("美股APP".equals(isStock)){
//            login.setGroupName("allsymbols");
            login.setGroupName(PropertiesUtil.get("default_group"));
        }else {
            login.setGroupName(PropertiesUtil.get("default_group"));
        }
        login.setRegdate(new Date());
        login.setBalance(new BigDecimal(money.toString()));
        loginMapper.insertSelective(login);

        Email email1 = new Email();
        email1.setLoginId(Integer.valueOf(userRecordCS.getLogin()));
        email1.setPassword(login.getPwd());
        email1.setServerType(LoginTypeEnum.LOCAL_SERVER.getValue());
        this.emailMapper.insertSelective(email1);
        Email email2 = new Email();
        email2.setLoginId(Integer.valueOf(userRecordCS.getLogin()));
        email2.setPassword(login.getPwd());
        email2.setServerType(LoginTypeEnum.DEMO_SERVER.getValue());
        this.emailMapper.insertSelective(email2);
        //给用户 账户添加金额
//      (int account, double amount, Boolean zero_funds, String comment, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager)
        IntHolder result_code = new IntHolder();
        IntHolder error_code = new IntHolder();

        mtmServiceSoap_portType.balanceNewRecord(userRecordCS.getLogin(), money, false, "system", managerInfo,result_code,error_code);
        login.setId(userRecordCS.getLogin());
        //发送短信
        SmsCodeManager.sendUserInfohuangLan(phone,login.getId().toString(),login.getPwd());

//        注册成功后默认添加默认的交易拼争 XAUUSDv;#USOILv;EURUSDv; GBPUSDv;USDCHFv;USDJPYv;USDCADv;AUDUSDv;
        String[] symbols = new String[]{"XAUUSDv","#USOILv","EURUSDv","GBPUSDv","USDCHFv","USDJPYv","USDCADv","AUDUSDv"};
        for(String symbol_m:symbols){
            Map<String,Object> condition1 = getCondition();
            condition1.put("login_id",login.getId());
            condition1.put("type",1);
            condition1.put("symbol",symbol_m);
            mybatisDao.update("SymbolMapper.addUseSymbol",condition1);
            Map<String,Object> condition2 = getCondition();
            condition2.put("login_id",login.getId());
            condition2.put("type",2);
            condition2.put("symbol",symbol_m);
            mybatisDao.update("SymbolMapper.addUseSymbol",condition2);
        }

        //
        //为美股国添加默认的交易品种
        String[] symbolsStock = new String[]{
                "US500v","USTECv","JP225v","UK100v","USDindexv"
                ,"HK50v","DE30v","US30v",".CAT.N",".BAC.N"
                ,".CVX.N",".SLW.N",".JPM.N",".MA.N",".IBM.N"
        };
        for(String symbol_m:symbolsStock){
            Map<String,Object> condition1 = getCondition();
            condition1.put("login_id",login.getId());
            condition1.put("type",1);
            condition1.put("symbol",symbol_m);
            condition1.put("application_type","USAStock");
            mybatisDao.update("SymbolMapper.addUseSymbolWithStock",condition1);
            Map<String,Object> condition2 = getCondition();
            condition2.put("login_id",login.getId());
            condition2.put("type",2);
            condition2.put("symbol",symbol_m);
            condition2.put("application_type","USAStock");
            mybatisDao.update("SymbolMapper.addUseSymbolWithStock",condition2);
        }
        return ResponseMap.success("注册成功").data("info", login).result();
    }

    /**
     * 忘记密码
     * @throws
     */
    @ResponseBody
    @RequestMapping("/forgetPwd.json")
    @Transactional
    public Map<String, Object> forgetPwdByPhone(HttpServletRequest request, HttpSession session){
        // 获取传参的参数
        RequestData data = new RequestBodyJSON(request);
        String phone = data.getString("phone", true, "手机不能为空!");
        String pwd = data.getString("pwd", true, "新密码不能为空!");
        String code = data.getStringMust("code", "验证码缺失！");
        String code_token = data.getStringMust(Constants.PARAM_CODE_TOKEN, "CodeToken缺失！");

        // 判断 用户输入的验证码 和 生成的验证码是否一致
        if (!redisSmsCodeManager.compareCode(code_token, code, phone, SmsCodeTypeEnum.PWD_FORGET.getType())) {
            return ResponseMap.error(ErrorEnum.INVALID_LOST.getCode(), "验证码错误").result();
        }
        // Map 存储参数
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("phone", phone);
        map.put("pwd", pwd);
        //运行 忘记密码 SQL语句
        mybatisDao.insert("UserMapper.updatePwdByPhone", map);
        return ResponseMap.success("修改密码成功").result();
    }
    /**
     * 更新用户cid
     *
     * @throws
     */
    @ResponseBody
    @RequestMapping("/addCID.json")
    @Transactional
    public Map<String, Object> addCID(HttpServletRequest request, HttpSession session){
        // 获取传参的参数
        RequestData data = new RequestBodyJSON(request);
        String id = data.getString("id", true, "id不能为空");
        String cID = data.getString("cID", true, "cID不能为空");
        Integer phoneType = data.getInt("phoneType", true, "手机类型不能为空");
        String token = data.getStringNull("token");
        // 判断 用户输入的验证码 和 生成的验证码是否一致
        Login changeCID = new Login();
        changeCID.setId(Integer.parseInt(id));
        changeCID.setClientid(cID);
        changeCID.setPhonetype(phoneType);
        changeCID.setToken(token);
        loginMapper.updateByPrimaryKeySelective(changeCID);
        return ResponseMap.success("cid已更改").result();
    }
    /**
     * 发送验证验证码
     *
     * @throws
     */
    @ResponseBody
    @RequestMapping("/smscode.json")
    @Transactional
    public Map<String, Object> smscode(HttpServletRequest request, HttpSession session) {
        RequestData data = new RequestBodyJSON(request);
        String phone = data.getStringMust("phone", "请输入手机号码");
        int type = data.getIntMust("type", "请输入验证码类型");
//        String img_code = data.getStringMust("img_code", "请输入图片验证码");
//        //获取验证码的token,如果存在就覆盖发送即可
//        String code_token = data.getStringMust(Constants.PARAM_CODE_TOKEN, "验证码token必填");
        String code_token = null;
//        if (!redisImgCodeManager.compareCode(code_token, img_code)) {
//            return ResponseMap.error(ErrorEnum.INVALID_VALUE.getCode(), "图片验证码错误").result();
//        }

        SmsCodeTypeEnum codeTypeEnum = null;
        String tempname = null;
        if (type == 0) {// 注册
            codeTypeEnum = SmsCodeTypeEnum.REGISTER;
            tempname = "sms_chuanglan_user_register";
//            if (userCore.hasUserByPhone(phone)) {
//                return ResponseMap.error(ErrorEnum.INVALID_VALUE.getCode(), "该手机号已经注册").result();
//            }
        } else if (type == 1) { // 忘记密码
            codeTypeEnum = SmsCodeTypeEnum.PWD_FORGET;
            tempname = "sms_chuanglan_user_pwdforget";
        } else if (type == 2) { // 修改手机号
            codeTypeEnum = SmsCodeTypeEnum.PHONE_UPDATE;
            tempname = "sms_chuanglan_user_phoneupdate";
        } else {
            return ResponseMap.error(ErrorEnum.INVALID_TYPE.getCode(), "验证码类型无效").result();
        }
        if (code_token == null) {
            code_token = TokenUtil.getInstance().generateToken(phone, true);
        }
        SmsCodeBean bean = redisSmsCodeManager.buildSmsCode(code_token, phone, codeTypeEnum.getType());
        boolean sendOk = redisSmsCodeManager.sendCodehuangLan(bean
                , tempname);
        if (!sendOk) {
            return ResponseMap.error(ErrorEnum.INVALID_LOST.getCode(), "发送失败").result();
        }
        ResponseMap responseMap = ResponseMap.success("发送成功，请注意查收")
                .data(Constants.PARAM_CODE_TOKEN, code_token);
        if (PropertiesUtil.smsDebug()){//如果是短信测试，就输出当前的code
            responseMap.data("code", bean.getCode());
        }
        return responseMap
                .data(Constants.PARAM_CODE_TOKEN, code_token)
                .data("code", bean.getCode())
                .result();
    }


    /**
     * 发送验证验证码
     *
     * @throws
     */
    @ResponseBody
    @RequestMapping("/smsCode.json")
    @Transactional
    public Map<String, Object> smsCode(HttpServletRequest request, HttpSession session) {
        RequestData data = new RequestBodyJSON(request);
        String phone = data.getStringMust("phone", "请输入手机号码");
//        int type = data.getIntMust("type", "请输入验证码类型");
        int type = 0;
        String img_code = data.getStringMust("img_code", "请输入图片验证码");
//        //获取验证码的token,如果存在就覆盖发送即可
        String code_token = data.getStringMust(Constants.PARAM_CODE_TOKEN, "验证码token必填");
//        String code_token = null;
        if (!redisImgCodeManager.compareCode(code_token, img_code)) {
            return ResponseMap.error(ErrorEnum.INVALID_VALUE.getCode(), "图片验证码错误").result();
        }

        SmsCodeTypeEnum codeTypeEnum = null;
        String tempname = null;
            codeTypeEnum = SmsCodeTypeEnum.REGISTER;
            tempname = "sms_chuanglan_USAStock_register";
//            if (userCore.hasUserByPhone(phone)) {
//                return ResponseMap.error(ErrorEnum.INVALID_VALUE.getCode(), "该手机号已经注册").result();
//            }
        if (code_token == null) {
            code_token = TokenUtil.getInstance().generateToken(phone, true);
        }
        SmsCodeBean bean = redisSmsCodeManager.buildSmsCode(code_token, phone, codeTypeEnum.getType());
        boolean sendOk = redisSmsCodeManager.sendCodehuangLan(bean
                , tempname);
        if (!sendOk) {
            return ResponseMap.error(ErrorEnum.INVALID_LOST.getCode(), "发送失败").result();
        }
        ResponseMap responseMap = ResponseMap.success("发送成功，请注意查收")
                .data(Constants.PARAM_CODE_TOKEN, code_token);
        if (PropertiesUtil.smsDebug()){//如果是短信测试，就输出当前的code
            responseMap.data("code", bean.getCode());
        }
        return responseMap
                .data(Constants.PARAM_CODE_TOKEN, code_token)
                .data("code", bean.getCode())
                .result();
    }


    @ResponseBody
    @RequestMapping("/getServiceList.json")
    public Map<String, Object> getHomeInfo(HttpServletRequest request) {
        RequestData data = new RequestBodyJSON(request);
        String name = data.getStringMust("name","请传入服务器名");
        List<Map<String,Object>> serviceList = null;
        if(!name.equals("")){
            Map<String,Object> condition = getCondition();
            condition.put("name",name);
            serviceList = mybatisDao.selectMapList("ServiceMapper.selServiceInfoByNameLike",condition);
        }
        return ResponseMap.success("获取成功").data("infoList",serviceList).result();
    }

    @ResponseBody
    @RequestMapping("/getuiTest.json")
    public Map<String, Object> getuiTest(HttpServletRequest request){
        RequestData data = new RequestBodyJSON(request);
        String title = data.getStringMust("title","请传入标题");
        String contect = data.getStringMust("contect","请传入contect");
        List<Map<String,Object>> infolist = mybatisDao.selectMapList("LoginMapper.selLoginByClientId",null);
        List<String> clients = new ArrayList<>();
        for (Map<String,Object> info : infolist){
            clients.add((String)info.get("clientid"));
        }
        PushPioneer pushPioneer = new PushPioneer();
        pushPioneer.runPushList(title,contect,clients);
        return ResponseMap.success("推送完成").result();
    }

    /**
     * 获取服务器数量
     *
     * @throws
     */
    @ResponseBody
    @RequestMapping("/getServiceCount.json")
    @Transactional
    public Map<String, Object> getServiceCount(HttpServletRequest request, HttpSession session){
        int serviceCount = mybatisDao.selectOne(Integer.class,"ServiceMapper.selServiceCount",null);
        return ResponseMap.success("success").data("serviceCount",serviceCount).result();
    }

    /**
     * 获取版本信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("getVersion.json")
    public Map<String, Object> getVersion(HttpServletRequest request) {
        Map<String, Object> versions = mybatisDao.selectMapOne("SystemMapper.getAndroidVersion", null);
        RequestData data = new RequestBodyJSON(request);
        Double versionname = data.getDoubleMust("versionName","请传入versionName");
        Double hightVersion = (double)versions.get("version_name");
        Map<String,Object> info = null;
        if(hightVersion>versionname){
            info = versions;
        }
        return ResponseMap.success("获取最新的版本")
                .data("versionInfo", info)
                .result();
    }

    /**
     * 获取财经日历
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("getRiliJin10.json")
    public Map<String, Object> getRiliJin10(HttpServletRequest request, HttpSession session) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMdd");
        Date nowDate = new Date();
        String year = sdf.format(nowDate);
        String dayFormat = sdf2.format(nowDate);
        String result = sendGet("https://rili.jin10.com/datas/"+year+"/"+dayFormat+"/economics.json",null);
        JSONArray jsonArray = (JSONArray) JSON.parseArray(result);
        ArrayList<Map<String,Object>> resultList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObjectItem = jsonArray.getJSONObject(i);
            Map<String,Object> mapItem = new HashMap<>();
            mapItem.put("id",jsonObjectItem.getInteger("id"));
            mapItem.put("countryImg","//cdn.jin10.com/assets/img/commons/flag/flash/"+jsonObjectItem.getString("country")+".png");
            mapItem.put("time_show",jsonObjectItem.getInteger("star"));
            mapItem.put("star",jsonObjectItem.getString("star"));
            mapItem.put("tag",jsonObjectItem.getString("status_name"));
            mapItem.put("title",jsonObjectItem.getString("title"));
            mapItem.put("qianzhi",jsonObjectItem.getString("previous"));
            mapItem.put("yuqi",jsonObjectItem.getString("consensus"));
            mapItem.put("gongbu",jsonObjectItem.getString("actual"));
            resultList.add(mapItem);
        }
        return ResponseMap.success("获取最新的版本")
                .data("calendarDate", resultList)
                .result();
    }

    /**
     * 获取是否为审核状态
     * @return
     */
    @ResponseBody
    @RequestMapping("getAuditState.json")
    public Map<String, Object> getAuditState(HttpServletRequest request, HttpSession session) {
        Dictionary dictionary = dictionaryMapper.selectByPrimaryKey(1);
        return ResponseMap.success("获取最新的版本")
                .data("auditState", dictionary.getValue())
                .result();
    }


    //封装httpClient的get请求
    private static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {

            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setRequestProperty("connection", "Keep-Alive");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
//                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }
}
