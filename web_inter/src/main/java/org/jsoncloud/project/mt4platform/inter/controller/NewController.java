package org.jsoncloud.project.mt4platform.inter.controller;

import com.kajie88.util.page.PageInfo;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.framework.web.util.ClientUtil;
import org.jsoncloud.project.mt4platform.inter.core.NewsCore;
import org.jsoncloud.project.mt4platform.po.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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
public class NewController extends BaseController{

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

    @RequestMapping(value = "/getNewsList.json", method = RequestMethod.POST)
    public Map getNewsList(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        int currentPage = data.getIntDef("currentPage", 1);
        int pageSize = data.getIntDef("pageSize", 10);
        String title = data.getString("title", false, null);

        Map<String,Object> condition = getCondition();
        condition.put("startIndex",(currentPage-1)*pageSize);
        condition.put("pageSize",pageSize);
        condition.put("title",title);
        int totalCount = this.mybatisDao.selectOne(Integer.class,"NewsMapper.selectNewsListCount", condition);
        List<Map<String, Object>> resultList = new ArrayList<>();
        if(totalCount>0){
            resultList = this.mybatisDao.selectMapList("NewsMapper.selectNewsList", condition);
        }
        PageInfo pageInfo = new PageInfo();
        pageInfo.setCurrentPage(currentPage);
        pageInfo.setPageSize(pageSize);
        pageInfo.setTotalCount(totalCount);
        return ResponseMap.success("success").data("pageInfo",pageInfo).data("list",resultList).result();
    }

    //获取最新的五条推荐新闻
    @RequestMapping(value = "/getNewsRecommend.json", method = RequestMethod.POST)
    public Map getNewsRecommend(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        Map<String,Object> condition = getCondition();
        condition.put("top5",1);
        condition.put("is_recommend",1);
        List<Map<String, Object>> resultList = this.mybatisDao.selectMapList("NewsMapper.selectNewsList", condition);
        return ResponseMap.success("success").data("list",resultList).result();
    }

    @RequestMapping(value = "/getNewsOutList.json", method = RequestMethod.POST)
    public Map getNewsOutList(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        int currentPage = data.getIntDef("currentPage", 1);
        int pageSize = data.getIntDef("pageSize", 10);
        String news_source = data.getStringNull("news_source");

        Map<String,Object> condition = getCondition();
        condition.put("startIndex",(currentPage-1)*pageSize);
        condition.put("pageSize",pageSize);
        condition.put("news_source",news_source);
        int totalCount = this.mybatisDao.selectOne(Integer.class,"NewsMapper.selectNewsOutListCount", condition);
        List<Map<String, Object>> resultList = new ArrayList<>();
        if(totalCount>0){
            resultList = this.mybatisDao.selectMapList("NewsMapper.selectNewsOutList", condition);
        }
        PageInfo pageInfo = new PageInfo();
        pageInfo.setCurrentPage(currentPage);
        pageInfo.setPageSize(pageSize);
        pageInfo.setTotalCount(totalCount);
        return ResponseMap.success("success").data("pageInfo",pageInfo).data("list",resultList).result();
    }
    @RequestMapping(value = "/getNewsOutList4App.json", method = RequestMethod.POST)
    public Map getNewsOutList4App(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        int currentPage = data.getIntDef("currentPage", 1);
        int pageSize = data.getIntDef("pageSize", 10);
        String news_source = data.getStringNull("news_source");

        Map<String,Object> condition = getCondition();
        condition.put("startIndex",(currentPage-1)*pageSize);
        condition.put("pageSize",pageSize+1);
        condition.put("news_source",news_source);
//        int totalCount = this.mybatisDao.selectOne(Integer.class,"NewsMapper.selectNewsOutListCount", condition);
        List<Map<String, Object>> resultList = new ArrayList<>();
        resultList = this.mybatisDao.selectMapList("NewsMapper.selectNewsOutList", condition);
        boolean hasNext = false;
        if(resultList.size()>pageSize){
            hasNext = true;
            resultList.remove(resultList.size()-1);
        }
        return ResponseMap.success("success").data("hasNext",hasNext).data("list",resultList).result();
    }

    @RequestMapping(value = "/getNewsInnerList4App.json", method = RequestMethod.POST)
    public Map getNewsInnerList4App(HttpServletRequest request) {
        RequestBodyJSON data = new RequestBodyJSON(request);
        int currentPage = data.getIntDef("currentPage", 1);
        int pageSize = data.getIntDef("pageSize", 10);
        Integer id = data.getIntNull("id");

        Map<String,Object> condition = getCondition();
        condition.put("startIndex",(currentPage-1)*pageSize);
        condition.put("pageSize",pageSize+1);
        condition.put("id",id);
        //每次根据id 获取的新闻内容 为其阅读量字段+1
        if(id!=null){
            this.mybatisDao.update("NewsMapper.upInnerNewsReadCount", condition);
        }
        //int totalCount = this.mybatisDao.selectOne(Integer.class,"NewsMapper.selectNewsOutListCount", condition);
        List<Map<String, Object>> resultList = new ArrayList<>();
        resultList = this.mybatisDao.selectMapList("NewsMapper.selectNewsList", condition);
        boolean hasNext = false;
        if(resultList.size()>pageSize){
            hasNext = true;
            resultList.remove(resultList.size()-1);
        }
        return ResponseMap.success("success").data("hasNext",hasNext).data("list",resultList).result();
    }


    //用户点赞接口
    @RequestMapping(value = "/addPraise.json", method = RequestMethod.POST)
    public Map addPraise(HttpServletRequest request) {
        String clientIP = ClientUtil.getClientIP(request);
        RequestBodyJSON data = new RequestBodyJSON(request);
        int newsId = data.getIntMust("newsId","新闻id不能为空");
        int isInnerNews = data.getIntMust("isInnerNews","isInnerNews字段必传");
        newsCore.changeNewsPraiseCount(newsId,isInnerNews,clientIP);
        return ResponseMap.success("success").result();
    }
}
