package com.study.springboot.test.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		AnnotationService service = context.getBean(AnnotationService.class);
		service.outputResult();
		context.close();
	}

}
