package org.jsoncloud.project.mt4platform.backstage.controller;

import org.apache.commons.lang.StringUtils;
import org.jsoncloud.framework.web.controller.BaseController;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4platform.backstage.core.NewsCore;
import org.jsoncloud.project.mt4platform.po.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.jsoncloud.project.mt4_platform.push.PushPioneer;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/10/26
 * @desc
 */
@RestController
@RequestMapping("/news")
public class NewsPushController extends BaseController{

    @Autowired
    private NewsCore newsCore;

    /**
     * 增加
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Map save(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        String title = data.getStringMust("title", "标题不能为空");
        String content = data.getStringMust("content", "内容不能为空");
        String author = data.getStringMust("author",  "作者不能为空");
        String secTitle = data.getStringMust("secTitle",  "副标题不能为空");
        String titleImg = data.getStringMust("titleImg",  "图片地址不能为空");

        News news = new News();
        news.setTitle(title);
        news.setContent(content);
        news.setAuthor(author);
        news.setCreateTime(new Date());
        news.setSecTitle(secTitle);
        news.setTitleImg(titleImg);
        this.newsCore.save(news);
        //使用个推推送
        PushPioneer pushPioneer = new PushPioneer();
        List<Map<String,Object>> infolist = mybatisDao.selectMapList("UserMapper.selLoginByClientId",null);
        List<String> clients = new ArrayList<>();
        for (Map<String,Object> info : infolist){
            clients.add((String)info.get("clientid"));
        }
        pushPioneer.runPushList(title,secTitle,clients);
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
                this.newsCore.delete(Integer.valueOf(id));
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
        Integer id = data.getIntMust("id", "缺失Id");
        String title = data.getStringMust("title", "标题不能为空");
        String content = data.getStringMust("content", "标题不能为空");
        String author = data.getStringMust("author",  "作者不能为空");
        String secTitle = data.getStringMust("secTitle",  "副标题不能为空");
        String titleImg = data.getStringMust("titleImg",  "图片地址不能为空");

        News news = new News();
        news.setId(id);
        news.setTitle(title);
        news.setContent(content);
        news.setAuthor(author);
        news.setUpdateTime(new Date());
        news.setSecTitle(secTitle);
        news.setTitleImg(titleImg);
        this.newsCore.update(news);
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
        News news = this.newsCore.get(id);
        return ResponseMap.success("success").data("info", news).result();
    }

    /**
     * 获取集合
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Map list(HttpServletRequest request){
        RequestBodyJSON data = new RequestBodyJSON(request);
        String param = data.getString("param", false, null);
        List<Map<String, Object>> list = this.newsCore.list(param);
        return ResponseMap.success("success").data("list", list).result();
    }
}
