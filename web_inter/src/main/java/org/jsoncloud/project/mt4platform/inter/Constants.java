package org.jsoncloud.project.mt4platform.inter;

/**
 * Created by Administrator on 2017/3/24.
 */
public class Constants extends org.jsoncloud.framework.constant.Constants {
    /**
     * 登陆的token
     */
    public static final String TOKEN_LOGIN_USER = "TOKEN_LOGIN_USER";

    public static final String PARAM_LOGIN_TOKEN = "login_token";
    //记录map中的服务器类型
    public static final String PARAM_LOGIN_KIND = "server_type";

    public static final String PARAM_LOGIN_GROUP = "login_group";

    /**
     * 当前请求的标志token，主要作用类似session，使用该标记存储一些分步骤的请求，这里主要是为了验证码
     */
    public static final String PARAM_CODE_TOKEN="code_token";




}
