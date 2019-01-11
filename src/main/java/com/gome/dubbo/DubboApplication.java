package com.gome.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class}
        ,scanBasePackages = {"com.gome.dubbo.controller"})
public class DubboApplication {

    public static void main(String[] args) {
        System.out.println("just for you");
        SpringApplication.run(DubboApplication.class, args);
    }

}

