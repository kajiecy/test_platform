package org.jsoncloud.project.mt4platform.base.tableenum;

/**
 *  应用的版本表，对应的Code信息
 */
public enum OrderCommandEnum {
    OP_BUY(0,"买入")
    ,OP_SELL(1,"卖出")
    ,OP_BUY_LIMIT(2,"限价买进")
    ,OP_SELL_LIMIT(3,"限价卖出")
    ,OP_BUY_STOP(4,"止损买进")
    ,OP_SELL_STOP(5,"止损卖出")
    ,OP_BALANCE(6,"金额变动")
    ,OP_CREDIT(7,"信贷变动")
    ;
    private int value;
    private String desc;


    OrderCommandEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;

    }



    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
