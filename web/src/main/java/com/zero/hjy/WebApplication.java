package com.zero.hjy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//{AuthorityUserServiceImpl.class,
//        AuthorityUserDao.class, AuthorityUserController.class}
@SpringBootApplication(scanBasePackages = "\\*")
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
