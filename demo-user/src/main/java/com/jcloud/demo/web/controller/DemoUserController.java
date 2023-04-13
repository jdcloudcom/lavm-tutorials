package com.jcloud.demo.web.controller;

import com.jcloud.demo.inf.dao.dao.intf.DemoUserDao;
import com.jcloud.demo.inf.dao.entity.DemoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzhimin
 * @date 2023/4/13 13:46
 */
@RestController
@RequestMapping("/demo/user")
public class DemoUserController {

    @Autowired
    private DemoUserDao dao;

    @RequestMapping("/get/{id}")
    public Object get(@PathVariable Long id){
        return dao.get(id);
    }
}
