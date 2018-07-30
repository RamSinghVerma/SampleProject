package com.myproject.FirstSpringMVC.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
//static resource config
	public void addResourceHandler(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/styles/**").addResourceLocations("/WEB-INF/resources/css/").setCachePeriod(31556926);
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/scripts/").setCachePeriod(31556926);
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/img/").setCachePeriod(31556926);
	}
	
	public void configDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
