package com.ot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.winterchen.dao")
public class OnlineTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineTestApplication.class, args);
	}
}
