package org.jsoncloud.project.mt4platform.inter.smsutil;


import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.jsoncloud.framework.sms.PropertiesUtil;

import java.io.IOException;

public class SmsChuangLanUtil {
    private static Logger logger = Logger.getLogger(org.jsoncloud.framework.sms.chuangl.SmsChuangLanUtil.class);

    public SmsChuangLanUtil() {
    }

    public static boolean send(String phone, String text) {
        if (PropertiesUtil.smsDebug()) {
            logger.debug("## CHUANLAN_DEBUG_发送短信[" + phone + "]结果：" + text);
            return true;
        } else {
            String url = PropertiesUtil.smsChuanglanUrl();
            String sms_password = PropertiesUtil.smsChuanglanPassword();
            String sms_account = PropertiesUtil.smsChuanglanAccount();

            try {
                String response = batchSend(url, sms_account, sms_password, phone, text, true, "");
//                logger.debug("## 发送短信[" + text + "]结果：" + response);
//                String[] resp = response.split("\n");
//                String result = resp[0].split(",")[1];
//                logger.debug("## 发送短信[" + text + "]解析结果：" + result);
                return "0".equals(response);
            } catch (IOException var8) {
                logger.error("## 发送短信失败，", var8);
                return false;
            }
        }
    }

    public static String batchSend(String url, String account, String pswd, String mobile, String msg, boolean needstatus, String extno) throws IOException {
//        HttpClient client = new HttpClient();
//        GetMethod method = new GetMethod();

//        try {
//            URI base = new URI(url, false);
//            method.setURI(new URI(base, "HttpBatchSendSM", false));
//            method.setQueryString(new NameValuePair[]{new NameValuePair("account", account), new NameValuePair("pswd", pswd), new NameValuePair("mobile", mobile), new NameValuePair("needstatus", String.valueOf(needstatus)), new NameValuePair("msg", msg), new NameValuePair("extno", extno)});
//            int result = client.executeMethod(method);
//            if (result != 200) {
//                throw new IOException("HTTP 错误状态: " + method.getStatusCode() + ":" + method.getStatusText());
//            } else {
//                InputStream in = method.getResponseBodyAsStream();
//                ByteArrayOutputStream baos = new ByteArrayOutputStream();
//                byte[] buffer = new byte[1024];
//                boolean var14 = false;
//
//                int len;
//                while((len = in.read(buffer)) != -1) {
//                    baos.write(buffer, 0, len);
//                }
//
//                String var15 = URLDecoder.decode(baos.toString(), "UTF-8");
//                return var15;
//            }
//        } finally {
//            method.releaseConnection();
//        }

//            ---------------------------------------------------------------------
            SmsSendRequest smsSingleRequest = new SmsSendRequest(account, pswd, msg, mobile,"true");
            String requestJson = JSON.toJSONString(smsSingleRequest);
            logger.info("before request string is: " + requestJson);
            String response = ChuangLanSmsUtil.sendSmsByPost(url, requestJson);
            System.out.println("response after request result is :" + response);
            SmsSendResponse smsSingleResponse = JSON.parseObject(response, SmsSendResponse.class);
            System.out.println("response  toString is :" + smsSingleResponse);
//            ---------------------------------------------------------------------
            return smsSingleResponse.getCode();
    }
}

