package org.jsoncloud.project.mt4platform.backstage.controller;

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
@RequestMapping("/symbolGroup")
public class SymbolGroupController extends BaseController {

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
//    获取服务器组 集合
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Map list(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute("login_token");
        Integer id = (Integer) redisUser.get("id");

        Admin admin = this.adminMapper.selectByPrimaryKey(id);

        List<Map<String, Object>> mapList = this.mybatisDao.selectMapList("SymbolGroupMapper.selGroupList", null);
        return ResponseMap.success("success").data("list", mapList).result();
    }

    /**
     * 保存
     *  grouptype  传入 1：ngroup  2：vgroup  3:  .group
     *  serverdec  传入 1本地 2模拟 3真实
     * @param request
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Map save(HttpServletRequest request) {
        RequestBodyJSON requestBodyJSON = new RequestBodyJSON(request);
        String groupName = requestBodyJSON.getStringMust("group_name", "缺失groupname");
        String groupType = requestBodyJSON.getStringMust("symbol_type", "缺失grouptype");
        String serverDec = requestBodyJSON.getStringMust("server_dec", "缺失serverdec");

        Map<String,Object> condition = getCondition();
        //#{groupname},#{grouptype},#{serverdec}
        condition.put("groupname",groupName);
        condition.put("grouptype",groupType);
        condition.put("serverdec",serverDec);

        int result = mybatisDao.insert("SymbolGroupMapper.addSymbolGroup",condition);
        return ResponseMap.success("success").result();
    }

    /**
     * 修改
     *  grouptype  传入 1：ngroup  2：vgroup  3:  .group
     *  serverdec  传入 1本地 2模拟 3真实
     * @param request
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Map update(HttpServletRequest request) {
        RequestBodyJSON requestBodyJSON = new RequestBodyJSON(request);
        Integer id = requestBodyJSON.getIntMust("id", "缺失grouptype");
        String groupName = requestBodyJSON.getStringMust("group_name", "缺失groupname");
        String groupType = requestBodyJSON.getStringMust("group_type", "缺失grouptype");
        String serverDec = requestBodyJSON.getStringMust("server_dec", "缺失serverdec");


        Map<String,Object> condition = getCondition();
        //#{groupname},#{grouptype},#{serverdec}
        condition.put("groupname",groupName);
        condition.put("symboltype",groupType);
        condition.put("serverdec",serverDec);
        condition.put("id",id);

        int result = mybatisDao.insert("SymbolGroupMapper.upSymbolGruop",condition);
        return ResponseMap.success("success").result();
    }


    /**
     * 删除
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/delete")
    public Map delete(HttpServletRequest request){
        RequestBodyJSON requestBodyJSON = new RequestBodyJSON(request);
        Integer id = requestBodyJSON.getIntMust("id", "缺失id");
        Map<String,Object> condition = getCondition();
        condition.put("id",id);
        int result = mybatisDao.delete("SymbolGroupMapper.delSymbolGroup",condition);
        return ResponseMap.success("success").result();
    }
}
