package com.study.springboot.test.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProFileTestMain {
//	开发环境和生产环境之间的切换方式,使用profile这个注解来实现,主要用于切换一些配置信息,已达到在
//	测试环境和生产环境所获取的值不同的情况,
//  可以使用接口的方式定义一个接口,然后用多个实现类去实现它,然后配置成在不同的发布环境中去使用
//	调用时使用获取接口对象的bean,spring会自动装配一个符合这个接口的bean,这种方式需要确保同一个容器中只有一个实现类被使用
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.register(ProFileConfig.class);
		context.refresh();
		
//		Object demo = context.getBean("demoBean");
		DemoBean demo = context.getBean(DemoBean.class);
		ParentProfileInter inter = context.getBean(ParentProfileInter.class);
//		System.out.println(demo.toString());
		System.out.println(demo.getContent());
		System.out.println(inter.getContent());
		
		context.close();
	}

}
