package com.duing.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Configuration
 * 声明这是一个配置类
 * @ConfigurationProperties(prefix = "beef")
 * 声明这是一个配置类  并声明文件中需要读取参数的前缀
 * @PropertySource("classpath:beef.properties")
 * 配置文件的地址
 */
@Configuration
@ConfigurationProperties(prefix = "beef")
@PropertySource("classpath:beef.properties")
public class BeefConfig {

    private String celery;
    private String coriander;
    private String pepper;

    public String getCelery() {
        return celery;
    }

    public void setCelery(String celery) {
        this.celery = celery;
    }

    public String getCoriander() {
        return coriander;
    }

    public void setCoriander(String coriander) {
        this.coriander = coriander;
    }

    public String getPepper() {
        return pepper;
    }

    public void setPepper(String pepper) {
        this.pepper = pepper;
    }
}
