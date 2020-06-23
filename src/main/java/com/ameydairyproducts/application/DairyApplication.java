package com.ameydairyproducts.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.ameydairyproducts.controller", "com.ameydairyproducts.service",
		"com.ameydairyproducts.mapper", "com.ameydairyproducts.dto" })
@EnableJpaRepositories(basePackages = { "com.ameydairyproducts.persistance" })
@EntityScan("com.ameydairyproducts.domain")
public class DairyApplication {
	public static void main(String[] args) {
		SpringApplication.run(DairyApplication.class, args);
	}

}
