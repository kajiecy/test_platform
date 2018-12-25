package org.jsoncloud.project.mt4platform.backstage.controller;

import org.jsoncloud.framework.exception.ProjectException;
import org.jsoncloud.framework.util.PropertiesUtil;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4platform.dao.AdminMapper;
import org.jsoncloud.project.mt4platform.dao.LoginMapper;
import org.jsoncloud.project.mt4platform.po.Admin;
import org.jsoncloud.project.mt4platform.po.Login;
import org.jsoncloud.project.mt4platform.rongyun.methods.User;
import org.jsoncloud.project.mt4platform.rongyun.models.TokenResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/11/1
 * @desc
 */
@RestController
@RequestMapping("/rongyun")
public class RongYunController {

    private static String appkey;
    private static String appSecret;
    private static String headerImg;

    @Autowired
    private AdminMapper adminMapper;

    static {
        appkey = PropertiesUtil.get("appKey");
        appSecret = PropertiesUtil.get("appSecret");
        headerImg = PropertiesUtil.get("headerImg");
    }

    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public Map getUserToken(HttpServletRequest request) {
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute("login_token");
        Integer id = (Integer) redisUser.get("id");
        Admin admin = this.adminMapper.selectByPrimaryKey(id);

        if (admin == null) {
            throw new ProjectException(500, "用户不存在");
        }

        User user = new User(appkey, appSecret);
        try {
            TokenResult token = user.getToken(admin.getId().toString(), admin.getUsername(), headerImg);
            return ResponseMap.success("success").data("token", token).data("appkey", appkey).result();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseMap.error("error").result();
    }
}
