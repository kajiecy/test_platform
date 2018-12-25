package org.jsoncloud.project.mt4_platform.push;

import com.gexin.fastjson.JSON;
import com.gexin.rp.sdk.base.IPushResult;
import com.gexin.rp.sdk.base.impl.ListMessage;
import com.gexin.rp.sdk.base.impl.Target;
import com.gexin.rp.sdk.http.IGtPush;
import com.gexin.rp.sdk.template.NotificationTemplate;
import com.gexin.rp.sdk.template.TransmissionTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PushPioneer {
    private static String host = "http://sdk.open.api.igexin.com/apiex.htm";
    private static PushTemplateBuilder templateBuilder;
    private static PushManager manager;
    static {
        templateBuilder = new PushTemplateBuilder(PropertiesUtils.get("getui_app_id"), PropertiesUtils.get("getui_app_key"));
        manager = new PushManager(PropertiesUtils.get("getui_app_id"), PropertiesUtils.get("getui_app_key"), PropertiesUtils.get("getui_app_secret"), PropertiesUtils.get("getui_master_secret"));
    }

    public void runPush(String title,String text,String clientid){
        System.setProperty("gexin_pushList_needDetails", "true");
        IGtPush push = new IGtPush(host, PropertiesUtils.get("getui_app_key"), PropertiesUtils.get("getui_master_secret"));
        Map<String,Object> content =new HashMap();
        content.put("title",title);
        content.put("content",text);
        content.put("payload","");
        TransmissionTemplate template = templateBuilder.buildTransmissionTemplate(2, JSON.toJSONString(content));
        ListMessage message = new ListMessage();
        message.setData(template);
        // 设置消息离线，并设置离线时间
        message.setOffline(true);
        // 离线有效时间，单位为毫秒，可选
        message.setOfflineExpireTime(24 * 1000 * 3600);
        List targets = new ArrayList();
        Target target = new Target();
        target.setAppId(PropertiesUtils.get("getui_app_id"));
        target.setClientId(clientid);
        targets.add(target);
        String taskId = push.getContentId(message);
        IPushResult ret = push.pushMessageToList(taskId, targets);
        System.out.println("=====================================>"+ret.getResponse().toString());
    }
    public void runPushList(String title,String text,List<String> clientids){
        System.setProperty("gexin_pushList_needDetails", "true");
        IGtPush push = new IGtPush(host, PropertiesUtils.get("getui_app_key"), PropertiesUtils.get("getui_master_secret"));
        Map<String,Object> content =new HashMap();
        content.put("title",title);
        content.put("content",text);
        content.put("payload","");
//        TransmissionTemplate template = templateBuilder.buildTransmissionTemplate(2, JSON.toJSONString(content));
        NotificationTemplate template = templateBuilder.buildNotificationTemplate(title,text,"",text);
        ListMessage message = new ListMessage();
        message.setData(template);
        // 设置消息离线，并设置离线时间
        message.setOffline(true);
        // 离线有效时间，单位为毫秒，可选
        message.setOfflineExpireTime(24 * 1000 * 3600);
        List targets = new ArrayList();
        for (String clientid:clientids){
            Target target = new Target();
            target.setAppId(PropertiesUtils.get("getui_app_id"));
            target.setClientId(clientid);
            targets.add(target);
        }
        String taskId = push.getContentId(message);
        IPushResult ret = push.pushMessageToList(taskId, targets);
        System.out.println("=====================================>"+ret.getResponse().toString());
    }
}
