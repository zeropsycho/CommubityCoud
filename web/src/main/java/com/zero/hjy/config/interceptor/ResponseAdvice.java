package com.zero.hjy.config.interceptor;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.Method;

/**
 * 设置全局controller response参数格式
 */
@RestControllerAdvice
@SuppressWarnings("rawtypes")
@Configuration
public class ResponseAdvice implements ResponseBodyAdvice {

    /**
     * 拦截策略
     */
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        Method method = returnType.getMethod();
        String methodName = method.getName();
        // 处理忽略拦截的方法
        if ("login".equals(methodName)) {
            return false;
        }
        return true;
    }

    /**
     * 参数接收前
     */
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        return body;
    }
}
