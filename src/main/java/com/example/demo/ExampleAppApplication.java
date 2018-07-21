package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExampleAppApplication extends SpringBootServletInitializer {

	private static Logger log = LoggerFactory.getLogger(ExampleAppApplication.class);
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ExampleAppApplication.class);
	}
	
	public static void main(String[] args) {
		log.info("############################################## ---- Starting");
		
		SpringApplication.run(ExampleAppApplication.class, args);
		
		log.info("############################################## ---- Running");
	}
}
