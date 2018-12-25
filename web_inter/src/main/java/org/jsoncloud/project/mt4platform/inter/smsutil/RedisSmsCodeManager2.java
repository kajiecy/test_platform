package org.jsoncloud.project.mt4platform.inter.smsutil;

import com.alibaba.fastjson.JSON;
import org.jsoncloud.framework.redis.RedisDao;
import org.jsoncloud.framework.util.RandUtil;
import org.jsoncloud.framework.util.StringUtil;
import org.jsoncloud.framework.verifcode.sms.SmsCodeBean;

public class RedisSmsCodeManager2 extends SmsCodeManager {
    private RedisDao redisDao;
    private String keyPre = "smscode:";

    public RedisSmsCodeManager2() {
    }

    public void setKeyPre(String keyPre) {
        this.keyPre = keyPre;
    }

    public void setRedisDao(RedisDao redisDao) {
        this.redisDao = redisDao;
    }

    public SmsCodeBean buildSmsCode(String key, String phone, String codeType) {
        Integer smsTime = getEnableTime();
        SmsCodeBean bean = this.getSmsCode(key);
        if (bean != null) {
            bean.setPhone(phone);
            bean.setCodeType(codeType);
            bean.setValidTime(smsTime.intValue());
            this.redisDao.setValue(this.keyPre + key, JSON.toJSONString(bean));
            this.redisDao.setKeyExpire(this.keyPre + key, (long)smsTime.intValue() + 0L);
            return bean;
        } else {
            SmsCodeBean code = new SmsCodeBean(phone, "" + RandUtil.randomInt(4), codeType);
            this.redisDao.setValue(this.keyPre + key, JSON.toJSONString(code));
            this.redisDao.setKeyExpire(this.keyPre + key, (long)smsTime.intValue() + 0L);
            return code;
        }
    }

    public SmsCodeBean getSmsCode(String key){
        String jsonBean = this.redisDao.getValue(this.keyPre + key);
        if (StringUtil.hasEmpty(jsonBean)) {
            return null;
        } else {
            SmsCodeBean redisCodeBean = (SmsCodeBean) JSON.parseObject(jsonBean, SmsCodeBean.class);
            return redisCodeBean;
        }
    }

    public boolean compareCode(String key, String reqcode, String phone, String codeType, String sport) {
        SmsCodeBean bean = this.getSmsCode(key);
        logger.debug("【SMS验证码对比】:" + JSON.toJSONString(bean));
        if (bean == null || !bean.getCode().equals(reqcode) || bean.getPhone() != null && !bean.getPhone().equals(phone) || bean.getCodeType() != null && !bean.getCodeType().equals(codeType) || bean.getSpot() != null && !bean.getSpot().equals(sport)) {
            return false;
        } else {
            this.removeSmsCode(key);
            return true;
        }
    }

    public boolean compareCode(String key, String reqcode, String phone, String codeType) {
        return this.compareCode(key, reqcode, phone, codeType, (String)null);
    }

    public boolean compareCode(String key, String reqcode, String phone) {
        return this.compareCode(key, reqcode, phone, (String)null, (String)null);
    }

    public boolean compareCode(String key, String reqcode) {
        return this.compareCode(key, reqcode, (String)null, (String)null, (String)null);
    }

    public void removeSmsCode(String key) {
        this.redisDao.deleteKeys(this.keyPre + key);
    }
}
