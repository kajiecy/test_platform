package org.jsoncloud.project.mt4platform.backstage.controller;

import org.jsoncloud.framework.web.controller.BaseController;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4platform.backstage.core.UserCore;
import org.jsoncloud.project.mt4platform.dao.UserMapper;
import org.jsoncloud.project.mt4platform.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/9/21
 * @desc
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserCore userCore;

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取用户详细信息
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public Map getUserInfo(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        Integer userId = data.getIntMust("userId", "用户id缺失");
        Map user = this.userCore.get(userId);
        return ResponseMap.success("success").data("userInfo", user).result();
    }

    /**
     * 修改用户
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Map updateUser(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        Integer id = data.getIntMust("id", "用户id缺失");
        String email = data.getString("email", false, "邮箱缺失");
        String loginName = data.getString("loginName", false, "账户名缺失");
        String name = data.getString("name", false, "用户名缺失");
        String phone = data.getString("phone", false, "电话号码缺失");
        String qq = data.getString("qqnum", false, "QQ缺失");
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setLoginName(loginName);
        user.setName(name);
        user.setPhone(phone);
        user.setQqnum(qq);
        this.userCore.updateUser(user);
        return ResponseMap.success("success").result();
    }

    /**
     * 删除
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Map delete(HttpServletRequest request) {
        RequestBodyJSON requestBodyJSON = new RequestBodyJSON(request);
        String ids = requestBodyJSON.getStringMust("ids", "缺失参数");
        String[] split = ids.split(",");
        for (String id : split) {
            this.userMapper.deleteByPrimaryKey(Integer.valueOf(id));
        }
        return ResponseMap.success("success").result();
    }

    /**
     * 更改用户组
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/updateGroup", method = RequestMethod.POST)
    public Map updateGroup(HttpServletRequest request) {
        RequestBodyJSON requestBodyJSON = new RequestBodyJSON(request);
        String ids = requestBodyJSON.getStringMust("ids", "缺失参数");
        Integer groupId = requestBodyJSON.getIntNull("groupId");
        String[] split = ids.split(",");
        User user = null;
        Map args = new HashMap();
        for (String id : split) {
            if (groupId != null) {
                user = new User();
                user.setId(Integer.valueOf(id));
                user.setUserGroupId(groupId);
                this.userMapper.updateByPrimaryKeySelective(user);
            } else {
                args.put("id", id);
                this.mybatisDao.update("UserMapper.updateGroupNull", args);
            }
        }
        return ResponseMap.success("success").result();
    }

    /**
     * 更改颜色
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/updateColor", method = RequestMethod.POST)
    public Map updateColor(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        Integer id = data.getIntMust("id", "用户id缺失");
        String color = data.getStringMust("color", "颜色缺失");
        User user = new User();
        user.setId(id);
        user.setColor(color);
        this.userCore.updateUser(user);
        return ResponseMap.success("success").result();
    }

    /**
     * 更改颜色
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/updateRemark", method = RequestMethod.POST)
    public Map updateRemark(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        Integer id = data.getIntMust("id", "用户id缺失");
        String remark = data.getStringMust("remark", "注释缺失");
        User user = new User();
        user.setId(id);
        user.setRemark(remark);
        this.userCore.updateUser(user);
        return ResponseMap.success("success").result();
    }

    /**
     * 新增用户组
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Map save(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        Integer loginId = data.getIntMust("loginId", "缺失交易账号");
        String tel = data.getStringMust("tel", "缺失电话");
        String qq = data.getStringMust("qq", "缺失QQ");
        String email = data.getStringMust("email", "缺失邮箱");
        Integer groupId = data.getIntNull("groupId");
        User user = new User();
        user.setPhone(tel);
        user.setCreateTime(new Date());
        user.setName(tel);
        user.setQqnum(qq);
        user.setEmail(email);
        user.setLoginName(new String(loginId + ""));
        if (groupId != null){
            user.setUserGroupId(groupId);
        }
        User save = this.userCore.save(user);
        return ResponseMap.success("success").data("login", save).result();
    }
}
