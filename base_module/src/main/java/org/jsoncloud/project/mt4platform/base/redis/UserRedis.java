package org.jsoncloud.project.mt4platform.base.redis;

import com.alibaba.fastjson.JSONObject;
import org.jsoncloud.framework.redis.token.RedisToken;
import org.jsoncloud.framework.util.StringUtil;

import java.util.Map;

/**
 * 
 */
public class UserRedis extends RedisToken {

    //初始化
    public UserRedis() {
        super.setKey("mt4_user:info");
    }

    /**
     * 验证token，判断是否登陆
     * @param token
     * @return
     */
    public Map<String, Object> hasLogin(String token) {
        //根据loginname 获取redis中的数据
        JSONObject data = getDataByLogin(token);
        if (data==null) {
            return null;
        }
        //匹配用户的login_token
        String login_token = StringUtil.toString(data.get("login_token"), "");
        if (!login_token.equals(token)) {
            return null;
        }
        return data;
    }

}
