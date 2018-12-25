package org.jsoncloud.project.mt4platform.backstage.interceptor;

import org.jsoncloud.framework.exception.ErrorEnum;
import org.jsoncloud.framework.exception.ProjectException;
import org.jsoncloud.framework.util.StringUtil;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.request.RequestData;
import org.jsoncloud.project.mt4platform.base.redis.UserRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/9/22
 * @desc
 */
public class LoginAdminInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private UserRedis userRedis;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        RequestData data = new RequestBodyJSON(request);
        //获取头信息
        String login_token = data.getStringNull("login_token");
        if (StringUtil.hasEmpty(login_token)) {
            System.out.println(ErrorEnum.USER_NOT_LOGIN.getCode());
            throw new ProjectException(ErrorEnum.USER_NOT_LOGIN.getCode(), "非法请求,缺失LOGIN_TOKEN");
        }
        //获取redis 的用户信息
        Map<String, Object> loginUser = null;
        loginUser = userRedis.hasLogin(login_token);
        if (loginUser == null) {
            throw new ProjectException(ErrorEnum.USER_NOT_LOGIN.getCode()
                    , "会话已过期，请重新登录", "session无用户");
        } else {
            request.setAttribute("login_token", loginUser);
        }
        return super.preHandle(request, response, handler);
    }
}
