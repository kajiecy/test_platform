package org.jsoncloud.project.mt4platform.base.tableenum;

/**
 *  应用的版本表，对应的Code信息
 */
public enum LoginTypeEnum {
    LOCAL_SERVER(1,"本地服务器")
    ,DEMO_SERVER(2,"模拟服务器")
    ,REAL_SERVER(3,"真实服务器")
    ;
    private Integer value;
    private String desc;


    LoginTypeEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
