package org.java.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan({"org.java.controller*","org.java.service*","org.java.conf*"})
@MapperScan("org.java.mapper")
@EnableConfigurationProperties
@EnableCaching //开启缓存
@EnableScheduling//开启定时任务注解
public class SpringTemplateApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringTemplateApplication.class, args);
	}
	
    @Override//为了打包springboot项目
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
