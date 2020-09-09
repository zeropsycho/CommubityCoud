package com.zero.hjy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 添加子模块时 映射包应该引入对应依赖到该pom文件中
 */
@SpringBootApplication(scanBasePackages = "\\com.zero.hjy.**")
@MapperScan(value = "com.zero.hjy.dao.**")
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
