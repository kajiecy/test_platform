package org.jsoncloud.project.mt4platform.inter.core;

import org.apache.commons.lang.StringUtils;
import org.jsoncloud.framework.mybatis.MybatisDao;
import org.jsoncloud.project.mt4platform.dao.NewsMapper;
import org.jsoncloud.project.mt4platform.po.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void changeNewsPraiseCount(int newsIds,int isInnerNews,String userIp){
        //逻辑 先去数据库 中 查询 此ip是否点赞过 此条news
        //如果 有记录 删除此条记录 此条news 的 praise_count-1
        //如果 没有 添加一条记录 此条noew 的 praise_count+1

        

    }
}
