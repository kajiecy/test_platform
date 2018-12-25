package org.jsoncloud.project.mt4platform.base.tableenum;

/**
 *  应用的版本表，对应的Code信息
 */
public enum ChartPeriodsEnum {
    PERIOD_M1("1","1-minute")
    ,PERIOD_M5("5","5-minute")
    ,PERIOD_M15("15","15-minute")
    ,PERIOD_M30("30","30-minute")
    ,PERIOD_H1("60","One-hour")
    ,PERIOD_H4("240","4-hour")
    ,PERIOD_D1("1440","Daily")
    ,PERIOD_W1("10080","Weekly")
    ,PERIOD_MN("43200","Monthly")
    ;
    private String value;
    private String desc;


    ChartPeriodsEnum( String value,String desc) {
        this.value = value;
        this.desc = desc;

    }



    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
