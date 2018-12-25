package org.jsoncloud.project.mt4platform.backstage.core;

import com.alibaba.fastjson.JSONObject;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.apache.log4j.Logger;
import org.jsoncloud.framework.util.DateUtil;
import org.jsoncloud.framework.util.RandUtil;
import org.jsoncloud.framework.util.StringUtil;
import org.jsoncloud.project.mt4platform.backstage.util.PropertiesUtils;


import java.io.IOException;
import java.util.Date;

public class QiniuHelper {
    private static Logger logger = Logger.getLogger(QiniuHelper.class);
    private String keyName;
    private String bucketname;
    private Auth auth;
    private UploadManager uploadManager;
    private BucketManager bucketManager;
    private String imageUrl;
    private boolean uploadOverride;

    public String toString() {
        return "QiniuHelper [keyName=" + this.keyName + ", bucketname=" + this.bucketname + ", auth=" + this.auth + ",  imageUrl=" + this.imageUrl + "]";
    }

    public QiniuHelper(String bucketname, String keyName, boolean uploadOverride) {
        this(bucketname, keyName);
        this.uploadOverride = uploadOverride;
    }

    public QiniuHelper(String bucketname, String keyName) {
        this.uploadOverride = false;
        this.bucketname = bucketname;
        this.keyName = keyName;
        String accessKey = PropertiesUtils.get("qiniu_access_key");
        String secretKey = PropertiesUtils.get("qiniu_secret_key");
        this.auth = Auth.create(accessKey, secretKey);
        this.uploadManager = new UploadManager();
        this.bucketManager = new BucketManager(this.auth);
    }

    public String getUpToken() {
        return !this.uploadOverride ? this.auth.uploadToken(this.bucketname, this.keyName, 3600L, (new StringMap()).put("insertOnly", Integer.valueOf(1))) : this.auth.uploadToken(this.bucketname, this.keyName);
    }

    public String getUpTokenVideo(StringMap map) {
        return map != null ? this.auth.uploadToken(this.bucketname, this.keyName, 3600L, map) : this.auth.uploadToken(this.bucketname, this.keyName);
    }

    public String getUrl() {
        return this.imageUrl;
    }

    public String getUrlMaxSquare(int edge) {
        return this.getUrlMaxRectangle(edge, edge);
    }

    public String getUrlMaxRectangle(int width, int height) {
        return this.imageUrl == null ? null : this.imageUrl + "?imageView2/0/w/" + width + "/h/" + height;
    }

    public QiniuHelper upload(byte[] data) throws IOException {
        if (data != null && data.length != 0) {
            Response res = this.uploadManager.put(data, this.keyName, this.getUpToken());
            String response = res.bodyString();
            logger.info("## 图片上传[bucket:" + this.bucketname + ",keyName:" + this.keyName + "]结果：" + response);
            JSONObject json = (JSONObject)JSONObject.parse(response);
            if (json.getString("error") == null && json.getString("code") == null) {
                String key = json.getString("key");
                this.imageUrl = PropertiesUtils.get(this.bucketname);
                if (this.imageUrl.endsWith("/")) {
                    this.imageUrl = this.imageUrl + key;
                } else {
                    this.imageUrl = this.imageUrl + "/" + key;
                }

                return this;
            } else {
                throw new IOException("文件上传返回失败,反馈内容：" + response);
            }
        } else {
            logger.error("## 图片上传失败,上传内容为空!");
            throw new NullPointerException("图片上传失败,上传内容为空");
        }
    }

    public void delete() throws QiniuException {
        this.bucketManager.delete(this.bucketname, this.keyName);
        logger.info("## 删除七牛资源：bucketname:" + this.bucketname + ",key:" + this.keyName);
    }

    public static void batchDelete(String bucket, String... keys) throws QiniuException {
        String accessKey = PropertiesUtils.get("qiniu_access_key");
        String secretKey = PropertiesUtils.get("qiniu_secret_key");
        Auth auth = Auth.create(accessKey, secretKey);
        BucketManager bucketManager = new BucketManager(auth);
        BucketManager.Batch batch = new BucketManager.Batch();
        batch.delete(bucket, keys);
        bucketManager.batch(batch);
    }

    public static String buildKey(String preKey, String filename) {
        String key = "" + RandUtil.randomInt(3);
        key = key + DateUtil.date2String(new Date(), "yyMMddHHmmss");
        if (!StringUtil.hasEmpty(filename)) {
            int suffixIndex = filename.lastIndexOf(".");
            if (suffixIndex > 0) {
                key = key + filename.substring(suffixIndex);
            }
        }

        return preKey + key;
    }
}
