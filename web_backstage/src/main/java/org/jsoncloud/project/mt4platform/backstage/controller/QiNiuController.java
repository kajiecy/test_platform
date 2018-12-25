package org.jsoncloud.project.mt4platform.backstage.controller;

import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.request.RequestData;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4platform.backstage.core.QiniuHelper;
import org.jsoncloud.project.mt4platform.backstage.util.PropertiesUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/26.
 */
@RestController
@RequestMapping("qiNiu")
public class QiNiuController {

    private static String scope;

    private static String qiniuAccessKey;

    private static String qiniuSecretKey;
    //需要在application-context.properties文件改变的时候改变
    private static String runVideo;

    //音频转码队列 用于处理amr录音文件转为mp3使用
    private String pipeline = "amr_micro_section";

    //####################### 七牛上传 #######################
    static {
        runVideo = PropertiesUtils.get("shares-headimg");
        qiniuSecretKey = PropertiesUtils.get("qiniu_secret_key");
        qiniuAccessKey = PropertiesUtils.get("qiniu_access_key");
        scope = PropertiesUtils.get("qiniu_bucketname");
    }

    /**
     * 图片文件上传信息获取接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("getQiniuToken")
    public Map<String, Object> upload_info(HttpServletRequest request) {
        RequestData data = new RequestBodyJSON(request);
        String name = data.getStringMust("name", "缺少图片名称");
        String key = QiniuHelper.buildKey("img-", name);
        String scope = PropertiesUtils.get("qiniu_bucketname");//test

        Map<String, Object> result = ResponseMap.success("") // 返回消息给页面
                .data("uptoken", new QiniuHelper(scope, key).getUpToken())//
                .data("scope", scope).data("key", key)
                .data("domain", PropertiesUtils.get(scope))// 获取 qiniu_domain_test
                .result();

        return result;
    }
    /**
     * 新闻图片七牛上传
     */
    @ResponseBody
    @RequestMapping("getQiniuToken2")
    public Map<String, Object> uploadQiniu(HttpServletRequest request) throws IOException {
        RequestData data = new RequestBodyJSON(request);
        String imgStr = data.getStringMust("imgStr", "缺少imgStr");
        String suffix = data.getStringMust("suffix", "缺少suffix");


        //文件名
        String filename = System.currentTimeMillis() + (suffix.startsWith(".") ? "" : ".") + suffix;
        //Base64解码
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] b = decoder.decodeBuffer(imgStr);
        for (int i = 0; i < b.length; ++i) {
            if (b[i] < 0) {
                b[i] += 256; // 调整异常数据
            }
        }
        //七牛
        //String bucket = PropertiesUtil.get("qiniu_bucket_media");
        String bucket = PropertiesUtils.get("qiniu_bucketname"); //bucket =skoda-img
        org.jsoncloud.framework.storage.qiniu.QiniuHelper helper = new org.jsoncloud.framework.storage.qiniu.QiniuHelper(bucket, filename, true);
        helper.upload(b);
        return ResponseMap.success("").data("imgUrl", helper.getUrl()).result();
    }
}
