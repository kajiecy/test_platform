package com.kajie88.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2019/1/2 0002.
 */
public class HttpTest {
    private static final String huaerjieUrl  = "https://api-prod.wallstreetcn.com/apiv1/content/lives?channel=us-stock-channel&client=pc&limit=20&first_page=true&accept=live%2Cvip-live";
    private static final String jinshiUrl  = "https://partner-api.jin10.com/?max_id=0&count=50";

    public static void main(String[] args) {
        //getJinShiNews();
        getHuaErJieNews();
    }
    private static void getHuaErJieNews(){
        String result = HttpUtil.sendGet(huaerjieUrl,null);
        JSONObject jsonObj = (JSONObject)JSON.parse(result);
        JSONArray jsonArray = jsonObj.getJSONObject("data").getJSONArray("items");
        /**
         * 被忽略的字段 author channels
         */
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObjectItem = jsonArray.getJSONObject(i);
            String article = jsonObjectItem.getString("article");//文章未知
            String content = jsonObjectItem.getString("content");//新闻内容
            String content_more = jsonObjectItem.getString("content_more");//新闻内容-更多
            String content_text = jsonObjectItem.getString("content_text");//新闻内容-文本
            Long display_time = jsonObjectItem.getLong("display_time");
            String global_channel_name = jsonObjectItem.getString("global_channel_name");//频道名
            String global_more_uri = jsonObjectItem.getString("global_more_uri");//频道名
            String id = jsonObjectItem.getString("id");//新闻的id
            String image_uris = jsonObjectItem.getJSONArray("image_uris").toJSONString();//展示图片集
            Boolean is_favourite = jsonObjectItem.getBoolean("is_favourite");//是否为特别喜欢？
            Boolean is_priced = jsonObjectItem.getBoolean("is_priced");//是否有价格？
            String reference = jsonObjectItem.getString("reference");//参考
            String related_themes = jsonObjectItem.getString("related_themes");//相关主题
            Integer score = jsonObjectItem.getInteger("score");//分数？
            JSONArray symbols = jsonObjectItem.getJSONArray("symbols");//交易品种？
            JSONArray tags = jsonObjectItem.getJSONArray("tags");//标签
            String title = jsonObjectItem.getString("title");//标题
            System.out.println(jsonObjectItem);
        }
        System.out.println(jsonObj);
    }
    private static void getJinShiNews(){
        String result = HttpUtil.sendGet(jinshiUrl,null);
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
             * 11
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

            System.out.println(strings);
            jinShiDataList.add(strings);
        }
        System.out.println(jinShiDataList);
    }
}
