//package com.lian.inteceptor;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * 拦截器的配置类
// */
//@Configuration //此注解必须有
//public class LoginInteceptorConfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //指定拦截的路径
//        registry.addInterceptor(new LoginInteceptor()).addPathPatterns("/**").excludePathPatterns("/**/login.*").excludePathPatterns("/layui/**").excludePathPatterns("/js/**").excludePathPatterns("/css/**").excludePathPatterns("/img/**");
//        //将配置器加载
//        WebMvcConfigurer.super.addInterceptors(registry);
//    }
//}
