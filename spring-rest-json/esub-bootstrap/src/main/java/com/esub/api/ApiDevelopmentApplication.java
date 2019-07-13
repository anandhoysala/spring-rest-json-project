package com.esub.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin(origins = "${cors.filter.url}")
@ComponentScan(basePackages = {"com"})
@EnableAutoConfiguration
@EnableJpaRepositories
@SpringBootApplication
@EnableSwagger2
public class ApiDevelopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDevelopmentApplication.class, args);
	}

}
