package org.jsoncloud.project.mt4platform.backstage.core;

import org.apache.commons.lang.StringUtils;
import org.jsoncloud.framework.mybatis.MybatisDao;
import org.jsoncloud.project.mt4platform.dao.ServiceMapper;
import org.jsoncloud.project.mt4platform.po.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/10/30
 * @desc
 */
@org.springframework.stereotype.Service
public class ServiceCore {

    @Autowired
    private ServiceMapper serviceMapper;

    @Autowired
    private MybatisDao mybatisDao;

    /**
     * 增加服务器
     *
     * @param service
     */
    public void save(Service service) {
        this.serviceMapper.insertSelective(service);
    }

    /**
     * 删除
     *
     * @param id
     */
    public void delete(Integer id) {
        this.serviceMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改
     *
     * @param service
     */
    public void update(Service service) {
        this.serviceMapper.updateByPrimaryKeySelective(service);
    }

    /**
     * 根据 id 查询详情
     *
     * @param id
     * @return
     */
    public Service getOne(Integer id) {
        Service service = this.serviceMapper.selectByPrimaryKey(id);
        return service;
    }

    /**
     * 查询集合
     *
     * @return
     */
    public List<Map<String, Object>> list(String param, Map args) {
        param = StringUtils.trimToNull(param);

        List<Map<String, Object>> srviceMapper = this.mybatisDao.selectMapList("ServiceMapper.selectList", args);

        return srviceMapper;
    }
}
