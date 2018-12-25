package org.jsoncloud.project.mt4_platform.push;

import com.gexin.rp.sdk.base.payload.APNPayload;
import com.gexin.rp.sdk.template.APNTemplate;
import com.gexin.rp.sdk.template.LinkTemplate;
import com.gexin.rp.sdk.template.NotificationTemplate;
import com.gexin.rp.sdk.template.TransmissionTemplate;

/**
 * 推送模板构造器
 * Created by Bames on 2016/8/31.
 */
public class PushTemplateBuilder {

    private final String appId;
    private final String appKey;

    public PushTemplateBuilder(String appId, String appKey){
        this.appId = appId;
        this.appKey = appKey;
    }

    /**
     * 强制启动应用
     */
    public static final int TRANSMISSION_MOD_START = 1;

    /**
     * 等待应用启动
     */
    public static final int TRANSMISSION_MOD_WAIT = 0;

    /**
     * 造"透传消息"模板
     *
     * @param mod     透传消息设置，1为强制启动应用，客户端接收到消息后就会立即启动应用(TRANSMISSION_MOD_START)；2为等待应用启动(TRANSMISSION_MOD_WAIT)
     * @param content
     * @return
     */
    public TransmissionTemplate buildTransmissionTemplate(int mod, String content) {
        TransmissionTemplate template = new TransmissionTemplate();
        template.setAppId(this.appId);
        template.setAppkey(this.appKey);
        // 透传消息设置，1为强制启动应用，客户端接收到消息后就会立即启动应用；2为等待应用启动
        template.setTransmissionType(mod);
        template.setTransmissionContent(content);
        // 设置定时展示时间
        // template.setDuration("2015-01-16 11:40:00", "2015-01-16 12:24:00");
        return template;
    }

    /**
     * 造“通知栏打开应用”模板
     *
     * @param title
     * @param text
     * @param logoUrl                通知栏图标名（已经预置在apk应用内）
     * @param transmissionContent 透传消息内容
     * @return
     */
    public NotificationTemplate buildNotificationTemplate(String title, String text, String logoUrl, String transmissionContent) {
        NotificationTemplate template = new NotificationTemplate();
        template.setAppId(this.appId);
        template.setAppkey(this.appKey);
        // 设置通知栏标题与内容
        template.setTitle(title);
        template.setText(text);
        // 配置通知栏图标
//        template.setLogo(logo);
        // 配置通知栏网络图标，填写图标URL地址
         template.setLogoUrl(logoUrl);
        // 设置通知是否响铃，震动，或者可清除
        template.setIsRing(true);
        template.setIsVibrate(true);
        template.setIsClearable(true);
        template.setTransmissionType(1);
        template.setTransmissionContent(transmissionContent);
        return template;
    }

    /**
     * 造“通知栏推送消息打开网页”模板
     * @return
     */
    public LinkTemplate buildLinkTemplate(String title, String text, String logo, String openUrl) {
        LinkTemplate template = new LinkTemplate();
        // 设置APPID与APPKEY
        template.setAppId(this.appId);
        template.setAppkey(this.appKey);
        // 设置通知栏标题与内容
        template.setTitle(title);
        template.setText(text);
        // 配置通知栏图标
        template.setLogo(logo);
        // 配置通知栏网络图标，填写图标URL地址
        // template.setLogoUrl(logoUrl);
        // 设置通知是否响铃，震动，或者可清除
        template.setIsRing(true);
        template.setIsVibrate(true);
        template.setIsClearable(true);
        // 设置打开的网址地址
        template.setUrl(openUrl);
        return template;
    }

    /**
     * 造ios推送模板
     *
     * @param title
     * @param text
     * @return
     */
    public APNTemplate buildAPnTemplate(String title, String text) {
        APNTemplate t = new APNTemplate();
        APNPayload apnpayload = new APNPayload();
        apnpayload.setSound("");
        //apn高级推送
        APNPayload.DictionaryAlertMsg alertMsg = new APNPayload.DictionaryAlertMsg();
        ////通知文本消息标题
        alertMsg.setTitle(title);
        //通知文本消息字符串
        alertMsg.setBody(text);
        //对于标题指定执行按钮所使用的Localizable.strings,仅支持IOS8.2以上版本
        alertMsg.setTitleLocKey(title);
        //指定执行按钮所使用的Localizable.strings
        alertMsg.setActionLocKey("确定");
        apnpayload.setAlertMsg(alertMsg);
        t.setAPNInfo(apnpayload);
        return t;
    }


}
