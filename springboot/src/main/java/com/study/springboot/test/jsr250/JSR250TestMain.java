package com.study.springboot.test.jsr250;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JSR250TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				JSR250Config.class);
		BeanWayService beanWay = context.getBean(BeanWayService.class);
		JSR250WayService jsr250Way = context.getBean(JSR250WayService.class);
		context.close();
	}
}
