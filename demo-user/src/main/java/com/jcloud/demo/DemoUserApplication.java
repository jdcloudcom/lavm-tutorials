package com.jcloud.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan({"com.jcloud.demo.inf.dao.mapper"})
@SpringBootApplication
public class DemoUserApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoUserApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoUserApplication.class);
	}
}
