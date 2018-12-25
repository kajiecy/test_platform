package org.jsoncloud.project.mt4platform.inter.controller;

import org.jsoncloud.framework.exception.ErrorEnum;
import org.jsoncloud.framework.exception.ProjectException;
import org.jsoncloud.framework.util.StringUtil;
import org.jsoncloud.project.mt4platform.base.redis.UserRedis;
import org.jsoncloud.project.mt4platform.inter.Constants;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/22.
 */
public abstract class BaseController extends org.jsoncloud.framework.web.controller.BaseController {

    @Resource
    public UserRedis userRedis;

    public Map<String, Object> getLoginUser(HttpServletRequest request) {
        int user_id = getLoginUserId(request);
        if (user_id == -1) {
            throw new ProjectException(ErrorEnum.USER_NOT_LOGIN.getCode()
                    , "登陆失效,重新登陆", "redis no this user");
        }
        Map<String, Object> data = getCondition();
        data.put("id", user_id);
        data = mybatisDao.selectMapOne("UserMapper.selUser", data);
        if(data==null){
            throw new ProjectException(ErrorEnum.USER_NOT_LOGIN.getCode()
                    , "该用户已失效", "db not this user");
        }
        return data;
    }

    public int getLoginUserId(HttpServletRequest request) {
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        return StringUtil.toInt(redisUser.get("id"), -1);
    }
}
