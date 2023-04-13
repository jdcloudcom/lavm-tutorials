package com.jcloud.demo.inf.dao.dao.impl;

import com.jcloud.demo.inf.dao.dao.base.DemoUserBaseDao;
import com.jcloud.demo.inf.dao.wrapper.DemoUserQuery;
import com.jcloud.demo.inf.dao.dao.intf.DemoUserDao;
import com.jcloud.demo.inf.dao.entity.DemoUser;
import org.springframework.stereotype.Repository;

/**
 * DemoUserDaoImpl: 数据操作接口实现
 *
 * 这只是一个减少手工创建的模板文件
 * 可以任意添加方法和实现, 更改作者和重定义类名
 * <p/>@author Powered By Fluent Mybatis
 */
@Repository
public class DemoUserDaoImpl extends DemoUserBaseDao implements DemoUserDao {
    @Override
    public DemoUser get(Long id) {
        //DemoUserQuery query = this.query().where.id().eq(id, id != null).end();
        return this.selectById(id);
    }
}
