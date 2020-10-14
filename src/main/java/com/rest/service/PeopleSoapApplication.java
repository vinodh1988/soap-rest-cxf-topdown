package com.rest.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.rest.service.generated")
@EnableJpaRepositories(basePackages = "com.rest.service.repository")
public class PeopleSoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeopleSoapApplication.class, args);
	}

}
