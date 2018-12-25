package org.jsoncloud.project.mt4platform.base.Util;

import java.util.Random;

public class InterUtil {
    private static char[] ele = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    public static String createPwd(){
//        int index =
        Random rm = new Random();
        int index = rm.nextInt(36);
        //模拟服务器密码至少5位 必须包含 字母 和 数字
        //1号位 生成数字 2号位 生成字母
        String pwd = "";
        pwd += ele[rm.nextInt(10)+26];
        pwd += ele[rm.nextInt(26)];
        for (int i = 0;i<3;i++){
          pwd += ele[rm.nextInt(36)];
        }
        return pwd;
    }
    //将unicode转换为中文
    public static String unicodeToCn(String unicode) {
        /** 以 \ u 分割，因为java注释也能识别unicode，因此中间加了一个空格*/
        String[] strs = unicode.split("\\\\u");
        String returnStr = "";
        // 由于unicode字符串以 \ u 开头，因此分割出的第一个字符是""。
        for (int i = 1; i < strs.length; i++) {
            returnStr += (char) Integer.valueOf(strs[i], 16).intValue();
        }
        return returnStr;
    }
    //想中文转换为Unicode
    public static String cnToUnicode(String cn) {
        char[] chars = cn.toCharArray();
        String returnStr = "";
        for (int i = 0; i < chars.length; i++) {
            returnStr += "\\u" + Integer.toString(chars[i], 16);
        }
        return returnStr;
    }

    public static void main(String[] args) {
        for (int i = 0;i<20;i++){
            System.out.println(InterUtil.createPwd());
        }
    }
}
