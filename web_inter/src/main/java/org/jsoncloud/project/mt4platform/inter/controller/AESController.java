package org.jsoncloud.project.mt4platform.inter.controller;

import org.apache.commons.lang.StringUtils;
import org.jsoncloud.framework.mybatis.MybatisDao;
import org.jsoncloud.project.mt4platform.dao.UserMapper;
import org.jsoncloud.project.mt4platform.inter.util.AESUtil;
import org.jsoncloud.project.mt4platform.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/11/15
 * @desc
 */
@RestController
public class AESController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MybatisDao mybatisDao;

    @RequestMapping("/aes")
    public void aec(){
        List<Map<String, Object>> maps = this.mybatisDao.selectMapList("UserMapper.selectAllUser", null);
        for (Map map : maps) {
            Integer id = (Integer) map.get("id");
            if (id >= 29) {


                String name = (String) map.get("name");
                String phone = (String) map.get("phone");
                String qq = (String) map.get("qqnum");
                String email = (String) map.get("email");
                User user = new User();
                user.setId(id);
                if (StringUtils.isNotBlank(name)) {
                    user.setName(AESUtil.decrypt(name));
                }
                if (StringUtils.isNotBlank(phone)) {
                    user.setPhone(AESUtil.decrypt(phone));
                }
                if (StringUtils.isNotBlank(qq)) {
                    user.setQqnum(AESUtil.decrypt(qq));
                }
                if (StringUtils.isNotBlank(email)) {
                    user.setEmail(AESUtil.decrypt(email));
                }
                this.userMapper.updateByPrimaryKeySelective(user);
            }
        }
    }
}
