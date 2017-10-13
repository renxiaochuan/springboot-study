package com.study.springboot.test.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 实现了aware的方法会在容器加载的时候调用接口内的某些方法,完成部分数据的初始化,
 * 一般都是spring容器相关的数据和对象的赋值
 *
 */
public class AwareTestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AwareConfig.class);
		AwareService service = context.getBean(AwareService.class);
		service.outputResult();
		
		context.close();
	}
}
