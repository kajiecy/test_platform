package org.jsoncloud.project.mt4platform.inter.controller;

import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4platform.inter.core.NewsCore;
import org.jsoncloud.project.mt4platform.po.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/10/30
 * @desc
 */
@RequestMapping("/news")
@RestController
public class NewController {

    @Autowired
    private NewsCore newsCore;

    /**
     * 获取详情
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/info.json", method = RequestMethod.POST)
    public Map get(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        Integer id = data.getIntMust("id", "缺失Id");
        News news = this.newsCore.get(id);
        return ResponseMap.success("success").data("info", news).result();
    }

    /**
     * 获取集合
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    public Map list(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        String param = data.getString("param", false, null);
        List<Map<String, Object>> list = this.newsCore.list(param);
        return ResponseMap.success("success").data("list", list).result();
    }
}
