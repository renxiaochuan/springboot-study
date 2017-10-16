package com.study.springboot.test.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 以条件进行判断具体应该使用按个加载bean
 * 用以支撑在不同环境下的不同支撑
 * 主要实现方式是在bean加载是添加条件判断注解@condition
 * 在注解引用的class中实现condition接口
 *
 */
public class ConditionTestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
		ListService listService = context.getBean(ListService.class);
		System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的bean为:"+listService.showListCmd());
		context.close();
	}

}
