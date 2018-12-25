package org.jsoncloud.project.mt4_platform.push;

import com.gexin.rp.sdk.base.IPushResult;
import com.gexin.rp.sdk.base.ITemplate;
import com.gexin.rp.sdk.base.impl.AppMessage;
import com.gexin.rp.sdk.base.impl.SingleMessage;
import com.gexin.rp.sdk.base.impl.Target;
import com.gexin.rp.sdk.exceptions.PushAppException;
import com.gexin.rp.sdk.exceptions.RequestException;
import com.gexin.rp.sdk.http.IGtPush;

import java.util.ArrayList;
import java.util.List;

/**
 * 个推推送信息处理
 *
 * @author Bames
 */
public class PushManager {

    private final String appId;
    private final String appKey;
    private final String appSecret;
    private final String masterSecret;
    private IGtPush push;
    private String host = PropertiesUtils.get("getui_host_url");

    public PushManager(String appId, String appKey, String appSecret, String masterSecret) {
        this.appId = appId;
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.masterSecret = masterSecret;
        this.push = new IGtPush(host, appKey, masterSecret);
    }

    /**
     * 1. 全部消息推送
     *
     * @param template
     * @param avaMin   离线有效时间(min),24小时有效
     * @return
     */
    public boolean pushAll(ITemplate template, int avaMin) {
        AppMessage message = new AppMessage();
        List<String> appIdList = new ArrayList<String>();
        appIdList.add(this.appId);
        message.setAppIdList(appIdList);
        message.setOffline(true);
        // 离线有效时间，单位为毫秒，可选,24小时有效
        message.setOfflineExpireTime(avaMin * 1000);
        message.setData(template);
        message.setPushNetWorkType(0); // 可选。判断是否客户端是否wifi环境下推送，1为在WIFI环境下，0为不限制网络环境。
        IPushResult ret = null;
        try {
            ret = push.pushMessageToApp(message);
        } catch (PushAppException e) {
            e.printStackTrace();
        }
        if (ret != null) {
//            logger.info(ret.getResponse().toString());
            return true;
        } else {
//            logger.error("## 服务器响应异常");
            return false;
        }
    }

    /**
     * 2. 单个android消息推送:别名
     *
     * @param alias
     * @param template
     * @param avaMin   离线有效时间(min),24小时有效
     * @return
     */
    public boolean pushSingleByAlias(String alias, ITemplate template, int avaMin) {
//        logger.info("## push Single");
        SingleMessage message = new SingleMessage();
        message.setOffline(true);
        // 离线有效时间，单位为毫秒，可选,1小时有效
        message.setOfflineExpireTime(avaMin * 1000);
        message.setData(template);
        message.setPushNetWorkType(0); // 可选。判断是否客户端是否wifi环境下推送，1为在WIFI环境下，0为不限制网络环境。
        Target target = new Target();
        target.setAppId(this.appId);
        // target.setClientId(clientId);
        // 用户别名推送，cid和用户别名只能2者选其一
        target.setAlias(alias);
        IPushResult ret = null;
        try {
            ret = push.pushMessageToSingle(message, target);
        } catch (RequestException e) {
            e.printStackTrace();
            ret = push.pushMessageToSingle(message, target, e.getRequestId());
        }
        if (ret != null) {
//            logger.info(ret.getResponse().toString());
            return true;
        } else {
//            logger.error("## 服务器响应异常");
            return false;
        }
    }

    /**
     * 3. 单个android消息推送:ClientId
     *
     * @param CID      ClientId
     * @param template
     * @param avaMin   离线有效时间(min),24小时有效
     * @return
     */
    public boolean pushSingleByClientId(String CID, ITemplate template, int avaMin) {
//        logger.info("## push Single");
        SingleMessage message = new SingleMessage();
        message.setOffline(true);
        // 离线有效时间，单位为毫秒，可选,1小时有效
        message.setOfflineExpireTime(avaMin * 1000);
        message.setData(template);
        message.setPushNetWorkType(0); // 可选。判断是否客户端是否wifi环境下推送，1为在WIFI环境下，0为不限制网络环境。
        Target target = new Target();
        target.setAppId(this.appId);
        // 用户别名推送，cid和用户别名只能2者选其一
        target.setClientId(CID);
        IPushResult ret = null;
        try {
            ret = push.pushMessageToSingle(message, target);
        } catch (RequestException e) {
            e.printStackTrace();
            ret = push.pushMessageToSingle(message, target, e.getRequestId());
        }
        if (ret != null) {
            System.out.println(ret.getResponse().toString());
            return true;
        } else {
            System.out.println("## 服务器响应异常");
            return false;
        }
    }

    /**
     * 4. 单个ios消息推送:devicetoken
     *
     * @param devicetoken
     * @param template
     * @param avaMin      离线有效时间(min),24小时有效
     * @return
     */
    public boolean pushSingleByDevicetoken(String devicetoken, ITemplate template, int avaMin) {
        System.out.println("## push Single");
        SingleMessage message = new SingleMessage();
        message.setOffline(true);
        // 离线有效时间，单位为毫秒，可选,1小时有效
        message.setOfflineExpireTime(avaMin * 1000);
        message.setData(template);
        message.setPushNetWorkType(0); // 可选。判断是否客户端是否wifi环境下推送，1为在WIFI环境下，0为不限制网络环境。
        IPushResult ret = null;
        try {
            ret = push.pushAPNMessageToSingle(this.appId, devicetoken, message);
        } catch (RequestException e) {
            e.printStackTrace();
        }
        if (ret != null) {
            System.out.println(ret.getResponse().toString());
            return true;
        } else {
            System.out.println("## 服务器响应异常");
            return false;
        }
    }

    public boolean pushMessageList(String devicetoken, ITemplate template, int avaMin) {





//        logger.info("## push Single");
//        SingleMessage message = new SingleMessage();
//        message.setOffline(true);
//        // 离线有效时间，单位为毫秒，可选,1小时有效
//        message.setOfflineExpireTime(avaMin * 1000);
//        message.setData(template);
//        message.setPushNetWorkType(0); // 可选。判断是否客户端是否wifi环境下推送，1为在WIFI环境下，0为不限制网络环境。
        IPushResult ret = null;
//        try {
//            ret = push.pushAPNMessageToSingle(this.appId, devicetoken, message);
//        } catch (RequestException e) {
//            e.printStackTrace();
//        }
        if (ret != null) {
            System.out.println(ret.getResponse().toString());
            return true;
        } else {
            System.out.println("## 服务器响应异常");
            return false;
        }
    }


}
