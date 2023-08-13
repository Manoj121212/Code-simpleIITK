package com.manoj.taskmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TaskmanagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmanagementServiceApplication.class, args);
	}

	//localhost:3000/ calling port 8080
			//Allow all requests only from the url http://localhost:3000/
			// we call it Cross Origin Requests
			@Bean
			public WebMvcConfigurer corsConfigurer() {
				WebMvcConfigurer wmvc= new WebMvcConfigurer() {
					
				
					public void addCorsMappings(CorsRegistry registry) {
						registry.addMapping("/**")
							.allowedMethods("*")
							.allowedOrigins("http://localhost:3000");
					}
				};

				return wmvc;
			
		}
}
