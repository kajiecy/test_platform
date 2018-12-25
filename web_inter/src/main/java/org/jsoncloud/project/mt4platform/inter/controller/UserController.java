package org.jsoncloud.project.mt4platform.inter.controller;

import org.apache.commons.lang.StringUtils;
import org.jsoncloud.framework.exception.ErrorEnum;
import org.jsoncloud.framework.exception.ProjectException;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.request.RequestData;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4_platform.soap.MTMServiceLocator;
import org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType;
import org.jsoncloud.project.mt4_platform.soap.ManagerInfo;
import org.jsoncloud.project.mt4platform.base.tableenum.LoginTypeEnum;
import org.jsoncloud.project.mt4platform.dao.EmailMapper;
import org.jsoncloud.project.mt4platform.dao.LoginMapper;
import org.jsoncloud.project.mt4platform.inter.Constants;
import org.jsoncloud.project.mt4platform.po.Email;
import org.jsoncloud.project.mt4platform.po.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/10/26
 * @desc
 */
@RequestMapping("/user")
@RestController
public class UserController extends BaseController {

    @Autowired
    private LoginMapper loginMapper;

    @Autowired
    private EmailMapper emailMapper;

    private static MTMServiceLocator mtmServiceLocator;
    private static MTMServiceSoap_PortType mtmServiceSoap_portType = null;
    private static ManagerInfo managerInfo_demo = new ManagerInfo();
    private static ManagerInfo managerInfo_real = new ManagerInfo();

    static {
        mtmServiceLocator = new MTMServiceLocator();
        try {
            //demo服务器的管理员信息
            mtmServiceSoap_portType = mtmServiceLocator.getMTMServiceSoap12();
            managerInfo_demo.setLogin(Integer.parseInt(org.jsoncloud.framework.sms.PropertiesUtil.get("test_login")));
            managerInfo_demo.setPassword(org.jsoncloud.framework.sms.PropertiesUtil.get("test_pwd"));
            managerInfo_demo.setServer(org.jsoncloud.framework.sms.PropertiesUtil.get("test_addr"));
            //real服务器的管理员信息
            managerInfo_real.setLogin(Integer.parseInt(org.jsoncloud.framework.sms.PropertiesUtil.get("real_login")));
            managerInfo_real.setPassword(org.jsoncloud.framework.sms.PropertiesUtil.get("real_pwd"));
            managerInfo_real.setServer(org.jsoncloud.framework.sms.PropertiesUtil.get("real_addr"));
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取用户的信息
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/info.json", method = RequestMethod.POST)
    public Map<String, Object> getUserInfo(HttpServletRequest request) {
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);
        Map<String, Object> args = new HashMap<>();
        args.put("loginId", login_id);
        args.put("serverType", server_type);
//      params.put("password", login.getPwd());
        List<Map<String, Object>> maps = this.mybatisDao.selectMapList("EmailMapper.selectInfo", args);
        if (maps != null && maps.size() > 0) {
            Map<String, Object> map = maps.get(0);
            args.put("password", map.get("password"));
        }
        if (server_type.compareTo(LoginTypeEnum.LOCAL_SERVER.getValue()) == 0) {
            args.put("serverType", "本地服务器");
        } else if (server_type.compareTo(LoginTypeEnum.DEMO_SERVER.getValue()) == 0) {
            args.put("serverType", "模拟服务器");
        } else if (server_type.compareTo(LoginTypeEnum.REAL_SERVER.getValue()) == 0) {
            args.put("serverType", "真实服务器");
        }

        return ResponseMap.success("success").data("info", args).result();
    }


    /**
     * 更新用户cid
     *
     * @throws
     */
    @ResponseBody
    @RequestMapping("/changePush.json")
    @Transactional
    public Map<String, Object> changePush(HttpServletRequest request, HttpSession session){

        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");

        // 获取传参的参数
        RequestData data = new RequestBodyJSON(request);
        Integer state = data.getIntMust("state","开启状态不能位空");//0 关闭 1开启
        String cID = data.getStringNull("cID");
        Integer phoneType = data.getInt("phoneType", true, "手机类型不能为空");
        String token = data.getStringNull("token");
        // 判断 用户输入的验证码 和 生成的验证码是否一致
        Login changeCID = new Login();
        changeCID.setId(login_id);
        changeCID.setPushstate(state);
        changeCID.setClientid(cID);
        changeCID.setPhonetype(phoneType);
        changeCID.setToken(token);
        loginMapper.updateByPrimaryKeySelective(changeCID);
        return ResponseMap.success("cid已更改").result();
    }


    /**
     * 获取用户的消息接收状态
     *
     * @throws
     */
    @ResponseBody
    @RequestMapping("/getPushState.json")
    @Transactional
    public Map<String, Object> getPushState(HttpServletRequest request, HttpSession session){

        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");

        Login login = loginMapper.selectByPrimaryKey(login_id);

        return ResponseMap.success("success").data("pushstate",login.getPushstate()).result();
    }


    /**
     * 修改用户密码
     *
     * @param request
     * @return
     */
        @RequestMapping(value = "/updatePswd", method = RequestMethod.POST)
    @Transactional
    public Map updatePswd(HttpServletRequest request) {
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");

        RequestData requestData = new RequestBodyJSON(request);
        String oldPswd = requestData.getStringMust("oldPswd", "缺失旧密码");
        String newPswd = requestData.getStringMust("newPswd", "缺失新密码");
        String newPswd2 = requestData.getStringMust("newPswd2", "缺失重复密码");

        if (!newPswd.equals(newPswd2)) {
            throw new ProjectException(500, "两次新密码输入不一致");
        }


        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);

        Map args = new HashMap();

        if (server_type.compareTo(LoginTypeEnum.LOCAL_SERVER.getValue()) == 0) {
            Login login = this.loginMapper.selectByPrimaryKey(login_id);
            String pwd = login.getPwd(); //用户的旧密码
            if (!pwd.equals(oldPswd)) {
                throw new ProjectException(500, "旧密码输入错误");
            }

            Login _login = new Login();
            _login.setId(login_id);
            _login.setPwd(newPswd);
            this.loginMapper.updateByPrimaryKeySelective(_login);

        } else if (server_type.compareTo(LoginTypeEnum.DEMO_SERVER.getValue()) == 0) {
            try {
                int result = mtmServiceSoap_portType.checkUserPassword(login_id, oldPswd, managerInfo_demo);
                if (result != 0) {
                    throw new ProjectException(500, "旧密码输入错误");
                }
                mtmServiceSoap_portType.changePassword(login_id, newPswd, false, managerInfo_demo);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } else if (server_type.compareTo(LoginTypeEnum.REAL_SERVER.getValue()) == 0) {
            try {
                int i = mtmServiceSoap_portType.checkUserPassword(login_id, oldPswd, managerInfo_real);
                if (i != 0) {
                    throw new ProjectException(500, "旧密码输入错误");
                }
                mtmServiceSoap_portType.changePassword(login_id, newPswd, false, managerInfo_real);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        args.put("loginId", login_id);
        args.put("serverType", server_type);
        List<Map<String, Object>> maps = this.mybatisDao.selectMapList("EmailMapper.selectInfo", args);
        if (maps != null && maps.size() > 0){
            Map<String, Object> stringObjectMap = maps.get(0);
            Email email = new Email();
            email.setId((Integer) stringObjectMap.get("id"));
            email.setServerType(server_type);
            email.setPassword(newPswd);
            email.setLoginId(login_id);
            this.emailMapper.updateByPrimaryKey(email);
        }
        return ResponseMap.success("success").result();
    }
}
