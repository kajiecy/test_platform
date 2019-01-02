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
    public static void main(String[] args) {
        String result = HttpUtil.sendGet("https://partner-api.jin10.com/?max_id=0&count=50","");
        JSONObject jsonObj = (JSONObject)JSON.parse(result);
        JSONArray infos = jsonObj.getJSONArray("infos");
        List<String[]> jinShiDataList = new ArrayList<>();
        for (int i = 0; i < infos.size(); i++) {
            /**
             * 已知各 index 的含义 总长度为12
             * 1  已发现 可能性 【0，1】 1显示蓝色color #343c4c、0显示color为#e74c3c
             * 2  格式化后的时间
             * 3  消息内容
             * 4  储存转跳地址
             * 6  其存在图片名称 全路径为 //image.jin10.com/ + value
             * 8 存在内容 0 但不明确含义
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
