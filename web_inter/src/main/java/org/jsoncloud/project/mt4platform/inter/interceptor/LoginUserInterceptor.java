package org.jsoncloud.project.mt4platform.inter.interceptor;

import org.apache.log4j.Logger;
import org.jsoncloud.framework.exception.ErrorEnum;
import org.jsoncloud.framework.exception.ProjectException;
import org.jsoncloud.framework.util.StringUtil;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.request.RequestData;
import org.jsoncloud.project.mt4platform.base.redis.UserRedis;
import org.jsoncloud.project.mt4platform.inter.Constants;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 登录拦截器
 * Created by Bames on 2016/8/4.
 */
public class LoginUserInterceptor extends HandlerInterceptorAdapter {

    private static Logger logger = Logger.getLogger(LoginUserInterceptor.class);

    private UserRedis userRedis;

    public void setUserRedis(UserRedis userRedis) {
        this.userRedis = userRedis;
    }
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        RequestData data = new RequestBodyJSON(request);
        //获取头信息
        String login_token = data.getStringNull(Constants.PARAM_LOGIN_TOKEN);
        if (StringUtil.hasEmpty(login_token)){
            System.out.println(ErrorEnum.USER_NOT_LOGIN.getCode());
            throw new ProjectException(ErrorEnum.USER_NOT_LOGIN.getCode(), "非法请求,缺失LOGIN_TOKEN");
        }
        //获取redis 的用户信息
        Map<String, Object> loginUser = null;
        loginUser = userRedis.hasLogin(login_token);
        if (loginUser == null){
            throw new ProjectException(ErrorEnum.USER_NOT_LOGIN.getCode()
                    , "会话已过期，请重新登录", "session无用户");
        } else {
            request.setAttribute(Constants.TOKEN_LOGIN_USER, loginUser);
        }
        return super.preHandle(request, response, handler);
    }
}
