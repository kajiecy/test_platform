package org.jsoncloud.project.mt4platform.base.tableenum;

/**
 *  应用的版本表，对应的Code信息
 */
public enum VersionCodeEnum {
    Android("android","MT4")
    ,IOS("ios","MT4")
    ;
    private String code;
    private String name;

    VersionCodeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
