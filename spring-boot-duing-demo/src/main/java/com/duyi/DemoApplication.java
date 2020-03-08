package com.duyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication
 * 声明我们的入口类  并且声明是spring-boot项目
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        //打开一个入口
        //放入当前入口类  和args参数
        SpringApplication.run(DemoApplication.class,args);
    }
}
