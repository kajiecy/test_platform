package org.jsoncloud.project.mt4platform.backstage.core;

import org.jsoncloud.framework.mybatis.MybatisDao;
import org.jsoncloud.project.mt4platform.base.Util.InterUtil;
import org.jsoncloud.project.mt4platform.dao.UserMapper;
import org.jsoncloud.project.mt4platform.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/9/21
 * @desc
 */
@Service
public class UserCore {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MybatisDao mybatisDao;

    /**
     * 通过用户id 获取用户的详细信息
     *
     * @param id
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Map get(int id) {

        Map args = new HashMap();
        args.put("id", id);
        List<Map<String, Object>> maps = this.mybatisDao.selectMapList("UserMapper.selectInfo", args);
        if (maps != null && maps.size() > 0) {
            return maps.get(0);
        }
        return null;
//        if (user != null) {
//            user.setName(AESUtil.decrypt(user.getName()));
//            user.setPhone(AESUtil.decrypt(user.getPhone()));
//            user.setQqnum(AESUtil.decrypt(user.getQqnum()));
//            user.setEmail(AESUtil.decrypt(user.getEmail()));
//        }
    }

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public int updateUser(User user) {
//        if (user != null) {
//            user.setName(AESUtil.encrypt(user.getName()));
//            user.setPhone(AESUtil.encrypt(user.getPhone()));
//            user.setQqnum(AESUtil.encrypt(user.getQqnum()));
//            user.setEmail(AESUtil.encrypt(user.getEmail()));
//        }
        int i = this.userMapper.updateByPrimaryKeySelective(user);
        return i;
    }

    /**
     * 保存
     *
     * @param user
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public User save(User user){
        user.setLoginPwd(InterUtil.createPwd());
        this.userMapper.insertSelective(user);
        return user;
    }

    public boolean hasUserByPhone(String phone) {
        //判断库中手机号用户是否存在
        int ud = mybatisDao.selectOne(Integer.class, "UserMapper.hasUserByPhone", phone);
        if (ud > 0) {
            return true;
        }
        return false;
    }
}
