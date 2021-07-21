package com.github.backend.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(final CorsRegistry registry) {
		//WebMvcConfigurer.super.addCorsMappings(registry);
		registry.addMapping("/api/*").allowedOrigins("http://localhost:8080");
	}
}
