package com.tas.testWildFly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "My REST API", version = "1.2.6",
description = "My OpenAPIDefinition description"))
public class TestWildFlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestWildFlyApplication.class, args);
	}

}
