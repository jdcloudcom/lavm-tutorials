package com.jcloud.demo.inf.dao.dao.intf;

import cn.org.atool.fluent.mybatis.base.IBaseDao;
import com.jcloud.demo.inf.dao.entity.DemoUser;

/**
 * DemoUserDao: 数据操作接口
 *
 * 这只是一个减少手工创建的模板文件
 * 可以任意添加方法和实现, 更改作者和重定义类名
 * <p/>@author Powered By Fluent Mybatis
 */
public interface DemoUserDao extends IBaseDao<DemoUser> {

    /**
     * 根据标识获取用户
     * @param id
     * @return
     */
    DemoUser get(Long id);
}
