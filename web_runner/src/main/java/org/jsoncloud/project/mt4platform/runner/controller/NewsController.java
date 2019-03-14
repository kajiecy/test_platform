package org.jsoncloud.project.mt4platform.runner.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.jsoncloud.framework.web.controller.BaseController;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/1/2 0002.
 */
@Component
public class NewsController  extends BaseController {
    private static final String huaerjieUrl  = "https://api-prod.wallstreetcn.com/apiv1/content/lives?channel=us-stock-channel&client=pc&limit=20&first_page=true&accept=live%2Cvip-live";
    private static final String jinshiUrl  = "https://partner-api.jin10.com/?max_id=0&count=50";
    private static final String meiGangNews  = "https://api-ushk.jin10.com/flash?max_time=0&callback=__jp0";

    public void init() {

    }
    public void getJinShiMessage(){
        this.getHuaErJieNews();
        this.getJinShiNews();
        this.getMeiGangNews();
    }
    //请求华尔街新闻的 美股快讯
    private void getHuaErJieNews(){
        String result = sendGet(huaerjieUrl,null);
        JSONObject jsonObj = (JSONObject) JSON.parse(result);
        JSONArray jsonArray = jsonObj.getJSONObject("data").getJSONArray("items");
        /**
         * 被忽略的字段 author channels
         */
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObjectItem = jsonArray.getJSONObject(i);
            String id = jsonObjectItem.getString("id");//新闻的id
            String article = jsonObjectItem.getString("article");//文章未知
            String content = jsonObjectItem.getString("content");//新闻内容
            String content_more = jsonObjectItem.getString("content_more");//新闻内容-更多
            String content_text = jsonObjectItem.getString("content_text");//新闻内容-文本
            Long display_time = jsonObjectItem.getLong("display_time");
            String global_channel_name = jsonObjectItem.getString("global_channel_name");//频道名
            String global_more_uri = jsonObjectItem.getString("global_more_uri");//频道名
            String image_uris = jsonObjectItem.getJSONArray("image_uris").toJSONString();//展示图片集
            Boolean is_favourite = jsonObjectItem.getBoolean("is_favourite");//是否为特别喜欢？
            Boolean is_priced = jsonObjectItem.getBoolean("is_priced");//是否有价格？
            String reference = jsonObjectItem.getString("reference");//参考
            String related_themes = jsonObjectItem.getString("related_themes");//相关主题
            Integer score = jsonObjectItem.getInteger("score");//分数？
            JSONArray symbols = jsonObjectItem.getJSONArray("symbols");//交易品种？
            JSONArray tags = jsonObjectItem.getJSONArray("tags");//标签
            String title = jsonObjectItem.getString("title");//标题
//            System.out.println(jsonObjectItem);
            /**
             * 先根据ID查询是否存在此条id的信息
             * 如果 没有 插入此条记录
             */
            Map<String,Object> condition = getCondition();
            condition.put("news_id",id);
            List<Map<String, Object>> resultList = this.mybatisDao.selectMapList("NewsMapper.getNewsById", condition);
            if(!(resultList!=null&&resultList.size()>0)){
                //向数据库中添加一条记录
                Map<String,Object> insertSource = getCondition();
                insertSource.put("news_id",id);
                insertSource.put("news_source","huaerjie");
                insertSource.put("article",article);
                if(content.indexOf("了解更多，点击查看")!=-1){
                    insertSource.put("content",content.substring(0,content.indexOf("了解更多，点击查看")));
                }else {
                    //去除所有的<a>标签
                    content=content.replaceAll("<a[^>]*>[^>]*</a>", "");
                    insertSource.put("content",content);
                }
                insertSource.put("image_uris",image_uris);
                insertSource.put("score",score);
                insertSource.put("create_time",new Date());
                this.mybatisDao.insert("NewsMapper.addNewsOut",insertSource);
            }
        }
//        System.out.println(jsonObj);
    }
    //请求金十数据的快讯
    private void getJinShiNews(){
        String result = sendGet(jinshiUrl,null);
        result = result.replaceAll("金十","美股指数APP");
        result = result.replaceAll("Jin10.com","");
        JSONObject jsonObj = (JSONObject)JSON.parse(result);
        JSONArray infos = jsonObj.getJSONArray("infos");
        List<String[]> jinShiDataList = new ArrayList<>();
        for (int i = 0; i < infos.size(); i++) {
            /**
             * 已知各 index 的含义 总长度为12
             * 0
             * 1  已发现 可能性 【0，1】 1显示蓝色color #343c4c、0显示color为#e74c3c
             * 2  格式化后的时间
             * 3  消息内容
             * 4  储存转跳地址
             * 5
             * 6  其存在图片名称 全路径为 //image.jin10.com/ + value
             * 7
             * 8  存在内容 0 但不明确含义
             * 9
             * 10
             * 11 日期可用作id
             * */
            //先想文字文字 以####0###分开
            String[] strings = infos.getString(i).split("#");
            String string0 = strings[0];
            String string1 = strings[1];
            String string2 = strings[2];
            String string3 = strings[3];
            String string4 = strings[4];
            String string5 = strings[5];
            String string6 = strings[6];
            String string7 = strings[7];
            String string8 = strings[8];
            String string9 = strings[9];
            String string10 = strings[10];
            String string11 = strings[11];
//            jinShiDataList.add(strings);

            /**
             * 先根据ID查询是否存在此条id的信息
             * 如果 没有 插入此条记录
             */
            if("0".equals(string0)&&!"<a".equals(string3.substring(0,2))){
                Map<String,Object> condition = getCondition();
                condition.put("news_id",string11);
                List<Map<String, Object>> resultList = this.mybatisDao.selectMapList("NewsMapper.getNewsById", condition);
                if(!(resultList!=null&&resultList.size()>0)){
                    //向数据库中添加一条记录
                    Map<String,Object> insertSource = getCondition();
                    insertSource.put("news_id",string11);
                    insertSource.put("news_source","jinshi");
                    insertSource.put("jinshi_content",infos.getString(i));
                    insertSource.put("create_time",new Date());
                    this.mybatisDao.insert("NewsMapper.addNewsOut",insertSource);
                }
            }
        }
//        System.out.println(jinShiDataList);
    }


    private void getMeiGangNews(){
        String result = sendGet(meiGangNews,null);
        result = result.substring(50);
        result = result.substring(0,result.length()-2);
        JSONObject jsonObj = (JSONObject)JSON.parse(result);

        JSONArray jsonArray = jsonObj.getJSONArray("data");

        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObjectItem = jsonArray.getJSONObject(i);
            if(jsonObjectItem.getInteger("type")==0){
//                System.out.println(jsonObj);
                String id = jsonObjectItem.getString("id");//新闻的id
                String content = jsonObjectItem.getString("title_content");//资讯内容
                String pic = jsonObjectItem.getString("pic");//资讯内容
                /*
                 * 先根据ID查询是否存在此条id的信息
                 * 如果 没有 插入此条记录
                 */
                Map<String,Object> condition = getCondition();
                condition.put("news_id",id);
                List<Map<String, Object>> resultList = this.mybatisDao.selectMapList("NewsMapper.getNewsById", condition);


                if(!(resultList!=null&&resultList.size()>0)){
                    //向数据库中添加一条记录
                    Map<String,Object> insertSource = getCondition();
                    insertSource.put("news_id",id);
                    insertSource.put("news_source","huaerjie");
                    //去除所有的<a>标签
                    content=content.replaceAll("<a[^>]*>[^>]*</a>", "");
                    insertSource.put("content",content);
                    if(pic!=null){
                        insertSource.put("image_uris","[\"//image.jin10.com/"+pic+"\"]");
                    }else {
                        insertSource.put("image_uris","[]");
                    }
                    insertSource.put("score",0);
                    insertSource.put("create_time",new Date());
                    this.mybatisDao.insert("NewsMapper.addNewsOut",insertSource);
                }
            }
        }
    }

    //封装httpClient的get请求
    private static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {

            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setRequestProperty("connection", "Keep-Alive");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
//                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }
}
