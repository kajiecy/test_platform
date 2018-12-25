package org.jsoncloud.project.mt4platform.backstage.core;

import org.apache.commons.lang.StringUtils;
import org.jsoncloud.framework.exception.ErrorEnum;
import org.jsoncloud.framework.mybatis.MybatisDao;
import org.jsoncloud.framework.util.StringUtil;
import org.jsoncloud.framework.util.TokenUtil;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4platform.base.redis.UserRedis;
import org.jsoncloud.project.mt4platform.dao.AdminMapper;
import org.jsoncloud.project.mt4platform.po.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
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
public class AdminCore {

    @Autowired
    private MybatisDao mybatisDao;

    @Resource
    private UserRedis userRedis;

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 检查用户名密码是否正确
     *  @param username
     * @param password
     * @param ip
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public Map checkUnamePswd(String username, String password, String ip) {

        //匹配数据库判断是否登陆OK
        Map<String, Object> args = new HashMap<String, Object>();
        args.put("username", username);
        Map<String, Object> login = this.mybatisDao.selectMapOne("AdminMapper.selectByUsername", args);
        if (login == null) {
            return ResponseMap.error(ErrorEnum.INVALID_LOST.getCode(), "用户名不存在").result();
        }
        String db_pwd = StringUtil.toString(login.get("password"), null);
        if (!password.equals(db_pwd)) {//匹配密码是否正确
            return ResponseMap.error(ErrorEnum.INVALID_VALUE.getCode(), "密码错误").result();
        }
        // 用户名密码匹配
        Integer id = (Integer) login.get("id");
        String old_token = StringUtil.toString(login.get("login_token"), "");
        String new_token = TokenUtil.getInstance().generateToken(id.toString(), true);
        args.clear();
        args.put("login_token", new_token);
        args.put("id", id);
        args.put("time", new Date());
        args.put("ip", ip);
        this.mybatisDao.update("AdminMapper.updateTokenById", args);
        //添加最新的用户数据到redis服务器
        login.put("login_token", new_token);
        this.userRedis.doLogin(old_token, new_token, login);
        //移除不必要的
        login.remove("pwd");
        return ResponseMap.success("登陆成功")
                .data("login_token", new_token)
                .data("id", id)
                .data("super_admin", login.get("super_admin"))
                .result();
    }

    /**
     * 通过管理员id 获取所管理的用户集合
     *
     * @param args
     * @param adminId
     * @return
     */
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<Map<String, Object>> selectUserList(Map args, Integer adminId) {
        List<Map<String, Object>> userMapList = null;
        Admin admin = this.adminMapper.selectByPrimaryKey(adminId);
        if (admin != null) {
            if (admin.getSuperAdmin()) {
                userMapList = this.mybatisDao.selectMapList("UserMapper.selectAllUser", args);
            } else {
                args.put("adminId",adminId);
                userMapList = this.mybatisDao.selectMapList("AdminMapper.selectUserListByAdmin", args);
            }
        }
//
//        if (userMapList != null && userMapList.size() > 0) {
//            for (Map user : userMapList) {
//                Object email = user.get("email");
//                Object login_name = user.get("login_name");
//                Object name = user.get("name");
//                Object phone = user.get("phone");
//                Object qqnum = user.get("qqnum");
//                user.put("email", email == null ? null : AESUtil.decrypt((String) email));
//                user.put("login_name", login_name == null ? null : login_name);
//                user.put("name", name == null ? null : AESUtil.decrypt((String) name));
//                user.put("phone", phone == null ? null : AESUtil.decrypt((String) phone));
//                user.put("qqnum", qqnum == null ? null : AESUtil.decrypt((String) qqnum));
//            }
//        }
        return userMapList;
    }

    /**
     * 查询所有的管理员
     *
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<Map<String, Object>> listAdmin() {
        List<Map<String, Object>> maps = this.mybatisDao.selectMapList("AdminMapper.listAdmin", null);
        return maps;
    }
}