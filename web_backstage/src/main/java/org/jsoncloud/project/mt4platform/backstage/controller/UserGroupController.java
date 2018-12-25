package org.jsoncloud.project.mt4platform.backstage.controller;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import org.apache.commons.lang.StringUtils;
import org.jsoncloud.framework.exception.ProjectException;
import org.jsoncloud.framework.web.controller.BaseController;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4platform.dao.AdminMapper;
import org.jsoncloud.project.mt4platform.dao.UserGroupMapper;
import org.jsoncloud.project.mt4platform.po.Admin;
import org.jsoncloud.project.mt4platform.po.UserGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/11/24
 * @desc 用户组管理
 */
@RestController
@RequestMapping("/userGroup")
public class UserGroupController extends BaseController {

    @Autowired
    private UserGroupMapper userGroupMapper;

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 查询用户组集合
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Map list(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute("login_token");
        Integer id = (Integer) redisUser.get("id");

        String param = data.getString("param", false, "查询参数");

        Admin admin = this.adminMapper.selectByPrimaryKey(id);

        Map args = new HashMap();
        if (StringUtils.isNotBlank(param)) {
            args.put("param", "%" + param + "%");
        }
        List<Map<String, Object>> mapList = this.mybatisDao.selectMapList("UserGroupMapper.selectList", args);
        return ResponseMap.success("success").data("list", mapList).result();

    }

    /**
     * 保存
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Map save(HttpServletRequest request) {
        RequestBodyJSON requestBodyJSON = new RequestBodyJSON(request);
        String groupName = requestBodyJSON.getStringMust("groupName", "缺失用户组名称");
        UserGroup userGroup = new UserGroup();
        userGroup.setGroupName(groupName);
        userGroup.setCreateTime(new Date());
        this.userGroupMapper.insertSelective(userGroup);
        return ResponseMap.success("success").result();
    }

    /**
     * 修改
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Map update(HttpServletRequest request) {
        RequestBodyJSON requestBodyJSON = new RequestBodyJSON(request);
        String groupName = requestBodyJSON.getStringMust("groupName", "缺失用户组名称");
        Integer id = requestBodyJSON.getIntMust("id", "缺失用户组Id");
        UserGroup userGroup = new UserGroup();
        userGroup.setId(id);
        userGroup.setGroupName(groupName);
        userGroup.setUpdateTime(new Date());
        this.userGroupMapper.updateByPrimaryKeySelective(userGroup);
        return ResponseMap.success("success").result();
    }

    /**
     * 获取用户组详情
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/info")
    public Map getInfo(HttpServletRequest request) {
        RequestBodyJSON requestBodyJSON = new RequestBodyJSON(request);
        Integer id = requestBodyJSON.getIntMust("id", "缺失用户组Id");
        UserGroup userGroup = this.userGroupMapper.selectByPrimaryKey(id);
        return ResponseMap.success("success").data("info", userGroup).result();
    }

    /**
     * 删除
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/delete")
    public Map delete(HttpServletRequest request) {
        RequestBodyJSON requestBodyJSON = new RequestBodyJSON(request);
        String ids = requestBodyJSON.getStringMust("ids", "缺失用户组Id");
        ids = StringUtils.trimToNull(ids);
        if (StringUtils.isNotBlank(ids)) {
            String[] idList = ids.split(",");
            for (String id : idList) {
                id = StringUtils.trimToNull(id);
                try {
                    this.userGroupMapper.deleteByPrimaryKey(Integer.valueOf(id));
                } catch (RuntimeException e) {
                    throw new ProjectException(500, "分组Id为" + id + "已被使用，不可删除！");
                }
            }

        }
        return ResponseMap.success("success").result();
    }
}
