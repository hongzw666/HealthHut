package com.china.HealthHut;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.china.HealthHut.mapper","com.china.HealthHut.appmapper"})
public class HealthHutApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthHutApplication.class, args);
	}
}
