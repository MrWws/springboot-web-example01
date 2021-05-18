package com.king.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jjk
 * @time: 2021-04-15-11:02
 * @description:
 * @function:
 */
@Configuration
public class MyConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List list = new ArrayList();
        list.add("/user/toLogin");
        list.add("/user/login");
        list.add("/user/toRegister");
        list.add("/user/register");
        list.add("/css/**");
        list.add("/img/**");
        list.add("/js/**");
        list.add("/bower_components/*/*/*/**");
        list.add("/dist/*/*/**");
        list.add("/check/code");
        list.add("/t/reg");
        registry.addInterceptor(new UserInterceptor()).addPathPatterns("/**").excludePathPatterns(list);

    }

}
