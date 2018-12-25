package org.jsoncloud.project.mt4platform.backstage.controller;

import org.apache.commons.lang.StringUtils;
import org.jsoncloud.framework.util.DateUtil;
import org.jsoncloud.framework.web.controller.BaseController;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.request.RequestData;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4platform.backstage.core.AdminCore;
import org.jsoncloud.project.mt4platform.dao.AdminMapper;
import org.jsoncloud.project.mt4platform.dao.AdminUserMapper;
import org.jsoncloud.project.mt4platform.po.Admin;
import org.jsoncloud.project.mt4platform.po.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
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
@RestController
@RequestMapping("/admin")
public class AdminController extends BaseController {

    @Autowired
    private AdminCore adminCore;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminUserMapper adminUserMapper;

    /**
     * 管理员登录
     *
     * @param request
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Map login(HttpServletRequest request) {
        RequestData data = new RequestBodyJSON(request);
        String username = data.getStringMust("username", "请输入用户名");
        String password = data.getStringMust("password", "请输入密码");
        String ip = request.getRemoteAddr();
        Map map = this.adminCore.checkUnamePswd(username, password, ip);
        return map;
    }

    /**
     * 查看当前管理员管理的用户
     *
     * @return
     */
    @RequestMapping(value = "/listUser")
    public Map listUsers(HttpServletRequest request) {
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute("login_token");
        Integer id = (Integer) redisUser.get("id");
        RequestData data = new RequestBodyJSON(request);
        String beginDate = data.getStringNull("beginDate");
        String endDate = data.getStringNull("endDate");
        String searchParam = data.getStringNull("searchParam");
        String searchType = data.getStringNull("searchType");
        String color = data.getStringNull("color");
        Integer group = data.getIntNull("group");

        Map args = new HashMap();
        if (StringUtils.isNotBlank(beginDate)) {
            try {
                Date begin = DateUtil.string2Date(beginDate, "yyyy-MM-dd");
                args.put("beginDate", begin);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (StringUtils.isNotBlank(endDate)) {
            try {
                Date end = DateUtil.string2Date(endDate, "yyyy-MM-dd");
                args.put("endDate", end);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        if (StringUtils.isNotBlank(searchParam)) {
            args.put(searchType, "%" + searchParam + "%");
        }

        if (StringUtils.isNotBlank(color)) {
            args.put("color", color);
        }

        if (group != null) {
            args.put("group", group);
        }

        List<Map<String, Object>> maps = this.adminCore.selectUserList(args, id);
        return ResponseMap.success("success").data("userList", maps).result();
    }

    /**
     * 查询所有的管理员
     *
     * @param request
     * @return
     */
    @RequestMapping("/listAdmin")
    public Map listAdmins(HttpServletRequest request) {
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute("login_token");
        Boolean super_admin = (Boolean) redisUser.get("super_admin");
        if (super_admin) {
            List<Map<String, Object>> maps = this.adminCore.listAdmin();
            return ResponseMap.success("success").data("list", maps).result();
        } else {
            return ResponseMap.error("权限不足").result();
        }
    }

    /**
     * 删除管理员
     *
     * @param request
     * @return
     */
    @RequestMapping("/deleteAdmin")
    public Map deleteAdmin(HttpServletRequest request) {
        RequestBodyJSON json = new RequestBodyJSON(request);
        Integer id = json.getIntMust("id", "缺失管理员id");
        this.adminMapper.deleteByPrimaryKey(id);
        return ResponseMap.success("success").result();
    }


    /**
     * 新增管理员
     *
     * @param request
     * @return
     */
    @RequestMapping("/saveAdmin")
    public Map save(HttpServletRequest request) {
        RequestBodyJSON json = new RequestBodyJSON(request);
        String username = json.getStringMust("username", "缺失用户名");
        String password = json.getStringMust("password", "缺失密码");
        String repassword = json.getStringMust("repassword", "缺失重复密码");
        String email = json.getStringMust("email", "缺失邮箱");
        String realName = json.getStringMust("realName", "缺失真实姓名");
        Integer superAdmin = json.getIntMust("superAdmin", "是否为超级管理员");
        Integer groupId = json.getIntMust("groupName", "缺失用户组");

        username = StringUtils.trimToNull(username);
        password = StringUtils.trimToNull(password);
        repassword = StringUtils.trimToNull(repassword);
        email = StringUtils.trimToNull(email);
        realName = StringUtils.trimToNull(realName);

        if (password.equals(repassword)) {
            Admin admin = new Admin();
            admin.setCreateTime(new Date());
            admin.setUsername(username);
            admin.setPassword(password);
            admin.setEmail(email);
            admin.setRealName(realName);
            if (superAdmin == 1) {
                admin.setSuperAdmin(true);
            } else {
                admin.setSuperAdmin(false);
            }
            this.adminMapper.insertSelective(admin);

            if (groupId != -1) {
                AdminUser adminUser = new AdminUser();
                adminUser.setUserGroupId(groupId);
                adminUser.setAdminId(admin.getId());
                this.adminUserMapper.insert(adminUser);
            }
            return ResponseMap.success("success").result();
        } else {
            return ResponseMap.error("两次密码输入不一致").result();
        }
    }

    /**
     * 修改管理员
     *
     * @param request
     * @return
     */
    @RequestMapping("/updateAdmin")
    public Map update(HttpServletRequest request) {
        RequestBodyJSON json = new RequestBodyJSON(request);
        Integer id = json.getIntMust("id", "缺失id");
        String password = json.getStringMust("password", "缺失密码");
        String repassword = json.getStringMust("repassword", "缺失重复密码");
        String email = json.getStringMust("email", "缺失邮箱");
        String realName = json.getStringMust("realName", "缺失真实姓名");
        Integer superAdmin = json.getIntMust("superAdmin", "是否为超级管理员");
        Integer groupId = json.getIntMust("groupName", "缺失用户组");

        password = StringUtils.trimToNull(password);
        repassword = StringUtils.trimToNull(repassword);
        email = StringUtils.trimToNull(email);
        realName = StringUtils.trimToNull(realName);

        if (password.equals(repassword)) {
            Admin admin = new Admin();
            admin.setId(id);
            admin.setCreateTime(new Date());
            admin.setPassword(password);
            admin.setEmail(email);
            admin.setRealName(realName);
            if (superAdmin == 1) {
                admin.setSuperAdmin(true);
            } else {
                admin.setSuperAdmin(false);
            }
            this.adminMapper.updateByPrimaryKeySelective(admin);
            // 更新管理员所管理的用户组
            Map args = new HashMap();
            args.put("adminId", id);
            List<Map<String, Object>> maps = this.mybatisDao.selectMapList("AdminMapper.viwAdminGroup", args);
            Map<String, Object> stringObjectMap = null;
            if (maps != null && maps.size() > 0) {
                stringObjectMap = maps.get(0);
                Integer auid = (Integer) stringObjectMap.get("auid");
                this.adminUserMapper.deleteByPrimaryKey(auid);
            }
            if (groupId.intValue() != -1) {
                AdminUser adminUser = new AdminUser();
                adminUser.setUserGroupId(groupId);
                adminUser.setAdminId(id);
                this.adminUserMapper.insert(adminUser);
            }

            return ResponseMap.success("success").result();
        } else {
            return ResponseMap.error("两次密码输入不一致").result();
        }
    }

    /**
     * 查询详情
     *
     * @param request
     * @return
     */
    @RequestMapping("/info")
    public Map info(HttpServletRequest request) {
        RequestBodyJSON requestBodyJSON = new RequestBodyJSON(request);
        Integer id = requestBodyJSON.getIntMust("id", "缺失管理员Id");
        Admin admin = this.adminMapper.selectByPrimaryKey(id);
        Map args = new HashMap();
        args.put("adminId", id);
        List<Map<String, Object>> maps = this.mybatisDao.selectMapList("AdminMapper.viwAdminGroup", args);
        Map<String, Object> stringObjectMap = null;
        if (maps != null && maps.size() > 0) {
            stringObjectMap = maps.get(0);
        }

        return ResponseMap.success("success").data("info", admin).data("groupInfo", stringObjectMap).result();
    }
}
