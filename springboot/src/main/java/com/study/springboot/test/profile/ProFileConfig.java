package com.study.springboot.test.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan("com.study.springboot.test.profile")
public class ProFileConfig {
	
	@Bean
	@Profile("dev")
	public DemoBean developmentDemoBean(){
		return new DemoBean("development !!!");
	}

	@Bean
	@Profile("prod")
	public DemoBean productionDemoBean(){
		return new DemoBean("production !!!");
	}
}
