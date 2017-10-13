package com.study.springboot.test.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 主要功能 :   事件触发后的监听事件的执行
 * 
 * 原理描述:   事件的发布者发布这个事件,并传送相关信息
 * 			发布者内部创建时间对象,并使用应用上下文的类将事件发布到环境中
 * 			监听者捕获到这个事件后执行自己的方法
 *
 * 应用场景:  由于事件表达的是一个 发布/订阅的模式   其内在可以是1对多的关系 ,在现实世界中的表述就是当一件事情发生时
 * 		          我们需要做这么多事儿,其中每件事可以是一个listener 这种机制的好处是解耦  可以灵活的拆卸各个不互相关联的listener
 *
 *
 */
public class EventTestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				EventConfig.class);
		DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
		demoPublisher.publish("ni da ye !!!");
		
		context.close();
	}

}
