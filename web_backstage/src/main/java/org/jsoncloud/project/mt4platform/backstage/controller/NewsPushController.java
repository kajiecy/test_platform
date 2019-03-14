package org.jsoncloud.project.mt4platform.backstage.controller;

import com.kajie88.util.page.PageInfo;
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
        Integer isRecommend = data.getIntMust("isRecommend",  "推荐信息不能为空");

        News news = new News();
        news.setTitle(title);
        news.setContent(content);
        news.setAuthor(author);
        news.setCreateTime(new Date());
        news.setSecTitle(secTitle);
        news.setTitleImg(titleImg);
        news.setIsRecommend(isRecommend);
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
        Integer isRecommend = data.getIntMust("isRecommend",  "推荐信息不能为空");

        News news = new News();
        news.setId(id);
        news.setTitle(title);
        news.setContent(content);
        news.setAuthor(author);
        news.setUpdateTime(new Date());
        news.setSecTitle(secTitle);
        news.setTitleImg(titleImg);
        news.setIsRecommend(isRecommend);
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

    @RequestMapping(value = "/listPage", method = RequestMethod.POST)
    public Map listPage(HttpServletRequest request){
        RequestBodyJSON data = new RequestBodyJSON(request);
        String param = data.getString("param", false, null);

        int currentPage = data.getIntDef("currentPage", 1);
        int pageSize = data.getIntDef("pageSize", 10);

        Map<String,Object> condition = getCondition();
        condition.put("startIndex",(currentPage-1)*pageSize);
        condition.put("pageSize",pageSize);
        condition.put("param",param);

        List<Map<String, Object>> list = this.newsCore.listPage(condition);

        PageInfo pageInfo = new PageInfo();
        pageInfo.setCurrentPage(currentPage);
        pageInfo.setPageSize(pageSize);
        pageInfo.setTotalCount((Integer) condition.get("total"));
        return ResponseMap.success("success").data("pageInfo",pageInfo).data("list",list).result();
    }

    @RequestMapping(value = "/getNewsOutPage", method = RequestMethod.POST)
    public Map getNewsOutPage(HttpServletRequest request){
        RequestBodyJSON data = new RequestBodyJSON(request);
        String param = data.getString("param", false, null);
        String id = data.getString("id", false, null);

        int currentPage = data.getIntDef("currentPage", 1);
        int pageSize = data.getIntDef("pageSize", 10);

        Map<String,Object> condition = getCondition();
        condition.put("startIndex",(currentPage-1)*pageSize);
        condition.put("pageSize",pageSize);
        condition.put("param",param);
        condition.put("id",id);

        List<Map<String, Object>> list = this.newsCore.getNewsOutList4Page(condition);

        PageInfo pageInfo = new PageInfo();
        pageInfo.setCurrentPage(currentPage);
        pageInfo.setPageSize(pageSize);
        pageInfo.setTotalCount((Integer) condition.get("total"));
        return ResponseMap.success("success").data("pageInfo",pageInfo).data("list",list).result();
    }

    @RequestMapping(value = "/changeOutNewsInfo", method = RequestMethod.POST)
    public Map getOutNewsInfo(HttpServletRequest request){
        RequestBodyJSON data = new RequestBodyJSON(request);
        Integer id = data.getIntMust("id", "缺失Id");
        String content = data.getStringMust("content", "内容不能为空");

        Map<String,Object> condition = getCondition();
        condition.put("id",id);
        condition.put("content",content);

        return this.newsCore.updateOutNews(condition);
    }

}
