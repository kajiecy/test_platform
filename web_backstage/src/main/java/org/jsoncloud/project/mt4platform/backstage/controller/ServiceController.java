package org.jsoncloud.project.mt4platform.backstage.controller;

import org.apache.commons.lang.StringUtils;
import org.jsoncloud.framework.exception.ProjectException;
import org.jsoncloud.framework.web.controller.BaseController;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4platform.backstage.core.ServiceCore;
import org.jsoncloud.project.mt4platform.base.tableenum.LoginTypeEnum;
import org.jsoncloud.project.mt4platform.po.News;
import org.jsoncloud.project.mt4platform.po.Service;
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
 * @Date 2017/10/30
 * @desc 服务器空控制器
 */
@RestController
@RequestMapping("/service")
public class ServiceController extends BaseController {

    @Autowired
    private ServiceCore serviceCore;

    /**
     * 增加
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Map save(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);

        String name = data.getStringMust("name", "缺失服务器名称");
        String desc = data.getStringMust("desc", "缺失服务器描述");
        String img = data.getStringMust("img", "缺失服务器图片");
        Integer type = data.getIntMust("type", "缺失服务器类型");

        Service service = new Service();
        service.setName(name);
        service.setServiceDesc(desc);
        service.setImg(img);
        service.setType(type);
        this.serviceCore.save(service);

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
        RequestBodyJSON data = new RequestBodyJSON(request);
        String ids = data.getStringMust("ids", "缺失Id");
        ids = StringUtils.trimToNull(ids);
        if (StringUtils.isNotBlank(ids)) {
            String[] idList = ids.split(",");
            for (String id : idList) {
                id = StringUtils.trimToNull(id);
                this.serviceCore.delete(Integer.valueOf(id));
            }

        }
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
        RequestBodyJSON data = new RequestBodyJSON(request);

        Integer id = data.getIntMust("id", "缺失id");
        String name = data.getStringMust("name", "缺失服务器名称");
        String desc = data.getStringMust("desc", "缺失服务器描述");
        String img = data.getStringMust("img", "缺失服务器图片");
        Integer type = data.getIntMust("type", "缺失服务器类型");

        Service service = new Service();
        service.setId(id);
        service.setName(name);
        service.setServiceDesc(desc);
        service.setImg(img);
        service.setType(type);
        this.serviceCore.update(service);

        return ResponseMap.success("success").result();
    }

    /**
     * 获取详情
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public Map get(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        Integer id = data.getIntMust("id", "缺失Id");
        Service one = this.serviceCore.getOne(id);
        return ResponseMap.success("success").data("info", one).result();
    }

    /**
     * 获取集合
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Map list(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        String param = data.getString("param", false, null);
        String searchName = data.getString("name", false, null);
        String searchDesc = data.getString("desc", false, null);
        String searchType = data.getString("type", false, null);
        searchName = StringUtils.trimToEmpty(searchName);
        searchDesc = StringUtils.trimToEmpty(searchDesc);
        searchType = StringUtils.trimToEmpty(searchType);

        Map args = new HashMap();
        if (StringUtils.isNotBlank(searchName)) {
            args.put("searchName", "%" + searchName + "%");
        }
        if (StringUtils.isNotBlank(searchDesc)) {
            args.put("searchDesc", "%" + searchDesc + "%");
        }
        if (StringUtils.isNotBlank(searchType)) {
            args.put("searchType", Integer.valueOf(searchType));
        }
        List<Map<String, Object>> list = this.serviceCore.list(param, args);

        for (Map map : list) {
            Integer type = (Integer) map.get("type");
            if (type.compareTo(LoginTypeEnum.LOCAL_SERVER.getValue()) == 0) {
                map.put("typeDesc", "本地服务器");
            } else if (type.compareTo(LoginTypeEnum.DEMO_SERVER.getValue()) == 0) {
                map.put("typeDesc", "模拟服务器");
            } else if (type.compareTo(LoginTypeEnum.REAL_SERVER.getValue()) == 0) {
                map.put("typeDesc", "真实服务器");
            } else {
                map.put("typeDesc", "其它服务器");
            }
        }

        return ResponseMap.success("success").data("list", list).result();
    }
}
