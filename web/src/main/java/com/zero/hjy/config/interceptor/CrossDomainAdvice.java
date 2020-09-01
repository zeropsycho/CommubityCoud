package com.zero.hjy.config.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CrossDomainAdvice implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 跨域路径
        registry.addMapping("/**")
        // 是否跨域请求域名
        .allowedOrigins("*")
        // 是否允许证书
        .allowCredentials(true)
        // 跨域方法
        .allowedMethods("*");
        // 跨域允许时间 maxAge
    }
}
