package com.king.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.king.springboot.dao")
@SpringBootApplication()
//exclude ={DataSourceAutoConfiguration.class}
public class SpringbootWebExample01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebExample01Application.class, args);
    }

}
