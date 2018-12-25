package org.jsoncloud.project.mt4_platform.push;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesUtils {
    private static Properties prop=new Properties();
    static {
        try {
            prop.load(new InputStreamReader(PropertiesUtils.class.getClassLoader().getResourceAsStream("common.properties"), "UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException("==================###### common.properties.bak 不存在 ######================");
        }
    }

    static public String get(String name) {
        return prop.getProperty(name);
//		return resource.getString(name);
    }

    public static int getInt(String name, int def) {
        try {
            return Integer.parseInt(get(name));
        } catch (Exception e) {
            return def;
        }
    }


}