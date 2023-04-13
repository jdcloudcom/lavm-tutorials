package com.jcloud.demo.config;

import cn.org.atool.fluent.mybatis.spring.MapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangzhimin
 * @date 2023/4/13 14:03
 */
@Configuration
public class Beans {

    @Bean
    public MapperFactory mapperFactory() {
        return new MapperFactory();
    }
}
