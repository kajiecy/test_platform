package org.jsoncloud.project.mt4platform.inter.smsutil;


import org.apache.log4j.Logger;
import org.jsoncloud.framework.util.StringUtil;
import org.jsoncloud.framework.verifcode.PropertiesUtil;
import org.jsoncloud.framework.verifcode.sms.SmsCodeBean;

public abstract class SmsCodeManager {
    protected static Logger logger = Logger.getLogger(org.jsoncloud.framework.verifcode.sms.SmsCodeManager.class);

    public SmsCodeManager() {
    }

    protected static int getEnableTime() {
        return PropertiesUtil.verifcodeSmsEnableTime();
    }

    public static boolean sendCodehuangLan(SmsCodeBean code, String sms_template) {
        String temp = PropertiesUtil.get(sms_template);
        if (StringUtil.hasEmpty(temp)){
            logger.error("CHUANGLNA 发送的短信模版[" + sms_template + "]没有配置");
            return false;
        } else {
            String sms = temp.replace("${code}", code.getCode());
            return SmsChuangLanUtil.send(code.getPhone(), sms);
        }
    }
    public static boolean sendUserInfohuangLan(String phone,String login,String pwd) {
        String temp = PropertiesUtil.get("sms_chuanglan_user_infoshow");
        if (StringUtil.hasEmpty(temp)){
            logger.error("CHUANGLNA 发送的短信模版[sms_chuanglan_user_infoshow]没有配置");
            return false;
        } else {
            String sms = temp.replace("${name}", login).replace("${pwd}",pwd);
            logger.info("sendSMS##"+sms);
            return SmsChuangLanUtil.send(phone, sms);
        }
    }

    public static boolean sendUserInfoSuccess(String phone,String login,String pwd) {
        String temp = PropertiesUtil.get("sms_chuanglan_USAStock_infoshow");
        if (StringUtil.hasEmpty(temp)){
            logger.error("CHUANGLNA 发送的短信模版[sms_chuanglan_user_infoshow]没有配置");
            return false;
        } else {
            String sms = temp.replace("${name}", login).replace("${pwd}",pwd);
            logger.info("sendSMS##"+sms);
            return SmsChuangLanUtil.send(phone, sms);
        }
    }
}

