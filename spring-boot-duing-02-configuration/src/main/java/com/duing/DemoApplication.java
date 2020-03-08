package com.duing;

import com.duing.config.FoodConfig;
import com.duing.config.VegetablesConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @SpringBootApplication
 * 声明我们的入口类  并且声明是spring-boot项目
 * @EnableConfigurationProperties
 * 告诉主程序入口类 要自动引入配置文件
 * 配置文件对应的类 放入注解参数
 */
@SpringBootApplication
@EnableConfigurationProperties(FoodConfig.class)
//@EnableConfigurationProperties(VegetablesConfig.class)
public class DemoApplication {

    public static void main(String[] args) {

        //打开一个入口
        //放入当前入口类  和args参数
        SpringApplication.run(DemoApplication.class,args);
    }
}
