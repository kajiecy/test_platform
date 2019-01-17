package org.jsoncloud.project.mt4platform.backstage.core;

import org.apache.commons.lang.StringUtils;
import org.jsoncloud.framework.exception.ErrorEnum;
import org.jsoncloud.framework.mybatis.MybatisDao;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4platform.dao.NewsMapper;
import org.jsoncloud.project.mt4platform.po.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/10/26
 * @desc
 */
@Service
public class NewsCore {

    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private MybatisDao mybatisDao;

    /**
     * 增加
     *
     * @param news
     */
    public void save(News news) {
        this.newsMapper.insertSelective(news);
    }

    /**
     * 删除
     *
     * @param id
     */
    public void delete(int id) {
        this.newsMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改
     *
     * @param news
     */
    public void update(News news) {
        this.newsMapper.updateByPrimaryKeySelective(news);
    }

    /**
     * 通过 id 获取
     *
     * @param id
     * @return
     */
    public News get(int id) {
        News news = this.newsMapper.selectByPrimaryKey(id);
        return news;
    }

    /**
     * 获取集合
     *
     * @param param
     * @return
     */
    public List<Map<String, Object>> list(String param) {

        param = StringUtils.trimToNull(param);

        Map args = new HashMap();
        if (StringUtils.isNotBlank(param)){
            args.put("param", "%" + param + "%");
        }
        List<Map<String, Object>> newsMapper = this.mybatisDao.selectMapList("NewsMapper.selectList", args);
        return newsMapper;
    }

    public List<Map<String, Object>> listPage(Map args) {

        List<Map<String, Object>> newsMapper = new ArrayList<>();

        int total = mybatisDao.selectOne(Integer.class,"NewsMapper.selectListPageCount",args);

        if(total>0){
            newsMapper = this.mybatisDao.selectMapList("NewsMapper.selectListPage", args);
        }
        args.put("total",total);
        return newsMapper;
    }

    public List<Map<String, Object>> getNewsOutList4Page(Map args) {

        List<Map<String, Object>> newsMapper = new ArrayList<>();

        int total = mybatisDao.selectOne(Integer.class,"NewsMapper.selectNewsOutCount",args);

        if(total>0){
            newsMapper = this.mybatisDao.selectMapList("NewsMapper.selectNewsOutPage", args);
        }
        args.put("total",total);
        return newsMapper;
    }


    public Map<String, Object> updateOutNews(Map<String, Object> args) {
        //先去数据库查询外部新闻来源

        Map<String,Object> condition = new HashMap<>();
        condition.put("startIndex",0);
        condition.put("pageSize",1);
        condition.put("id",args.get("id"));

        List<Map<String, Object>> list = this.getNewsOutList4Page(condition);
        if(list.isEmpty()){
            return ResponseMap.error(ErrorEnum.INVALID_LOST.getCode(), "该账号不存在").result();
        }
        Map<String,Object> newsInfo = list.get(0);
        String news_source = (String)newsInfo.get("news_source");
        if("jinshi".equals(news_source)){
            String jinshiContent = (String)newsInfo.get("jinshi_content");
            String[] split = jinshiContent.split("#");
            split[3] = (String)args.get("content");
            jinshiContent =  StringUtils.join(split, "#");
            condition.put("jinshi_content",jinshiContent);
        }else {
            condition.put("content",args.get("content"));
        }
        this.mybatisDao.selectMapList("NewsMapper.updateOutNewsContent", condition);
        return ResponseMap.success("success").result();
    }
}
