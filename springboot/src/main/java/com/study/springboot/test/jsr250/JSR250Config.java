package com.study.springboot.test.jsr250;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.study.springboot.test.jsr250")
public class JSR250Config {
	@Bean(initMethod="init",destroyMethod="destroy")
	BeanWayService beanWayService(){
		return new BeanWayService();
	}
	
	@Bean
	JSR250WayService jsr250WayServcie(){
		return new JSR250WayService();
	}
}
