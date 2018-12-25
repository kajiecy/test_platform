package org.jsoncloud.project.mt4platform.inter.controller;

import org.jsoncloud.framework.util.PropertiesUtil;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HttpPostUrl {

    public static String postDownloadJson(String path,Map<String,String> paramMap){
        URL url = null;
        try {
            url = new URL(path);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");// 提交模式
            // conn.setConnectTimeout(10000);//连接超时 单位毫秒
            // conn.setReadTimeout(2000);//读取超时 单位毫秒
            // 发送POST请求必须设置如下两行
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            //设置融云的请求头
            String appKey = PropertiesUtil.get("rongcloud_app_secret");
            String nonce=((int)(Math.random()*900)+100)+"";
            String timestamp =new Date().getTime()+"";
            String signature = sha1(appKey+nonce+timestamp);
            httpURLConnection.setRequestProperty("RC-App-Key",appKey);
            httpURLConnection.setRequestProperty("RC-Nonce",nonce);
            httpURLConnection.setRequestProperty("RC-Timestamp",timestamp);
            httpURLConnection.setRequestProperty("RC-Signature",signature);
            httpURLConnection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            // 获取URLConnection对象对应的输出流
            PrintWriter printWriter = new PrintWriter(httpURLConnection.getOutputStream());
            // 发送请求参数
            String param = "";
            if (paramMap != null && paramMap.size() > 0) {
                Iterator<String> ite = paramMap.keySet().iterator();
                while (ite.hasNext()) {
                    String key = ite.next();// key
                    String value = paramMap.get(key);
                    param += key + "=" + value + "&";
                }
                param = param.substring(0, param.length() - 1);
            }
            printWriter.write(param);//post的参数 xx=xx&yy=yy
            // flush输出流的缓冲
            printWriter.flush();
            //开始获取数据
            System.out.println();
            BufferedInputStream bis = new BufferedInputStream(httpURLConnection.getInputStream());
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int len;
            byte[] arr = new byte[1024];
            while((len=bis.read(arr))!= -1){
                bos.write(arr,0,len);
                bos.flush();
            }
            bos.close();
            return bos.toString("utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String sha1(String data) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA1");
        md.update(data.getBytes());
        StringBuffer buf = new StringBuffer();
        byte[] bits = md.digest();
        for(int i=0;i<bits.length;i++){
            int a = bits[i];
            if(a<0) a+=256;
            if(a<16) buf.append("0");
            buf.append(Integer.toHexString(a));
        }
        return buf.toString();
    }
    public static void main(String[] args) {
        Map<String, String> mapParam = new HashMap<String, String>();
        mapParam.put("userId", "jlk456j5");
        mapParam.put("name","Ironman");
        mapParam.put("portraitUri","http://outp8ki6i.bkt.clouddn.com/IMG_H_1_680170908133358.jpg");
        String pathUrl = "http://api.cn.ronghub.com/user/getToken.json";
        String result = postDownloadJson(pathUrl, mapParam);
        System.out.println(result);
    }

}
