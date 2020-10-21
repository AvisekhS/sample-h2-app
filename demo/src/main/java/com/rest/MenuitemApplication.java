package com.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class MenuitemApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuitemApplication.class);

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MenuitemApplication.class);
	}

	public static void main(String[] args) {
		LOGGER.debug("Starting Spring application main...");
		SpringApplication.run(MenuitemApplication.class, args);
	}
}
