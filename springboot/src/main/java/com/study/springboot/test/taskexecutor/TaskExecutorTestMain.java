package com.study.springboot.test.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring 多线程处理技术
 * 
 * 原理是将需要异步执行的方法通过注解的方式构建成异步的方法
 * 
 * 将配置类声明成注解类并继承AsyncConfigurer接口并实现其内部的返回线程管理器 的方法 
 * 
 * 引用场景：进行一些互不影响的问题的并发解决，提高整体执行的速度
 *
 */
public class TaskExecutorTestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService asyncService = context.getBean(AsyncTaskService.class);
		for(int i = 0 ; i < 25 ; i++) {
			asyncService.executorAsyncTaskPlus(i);
		}
		for(int i = 0 ; i < 10 ; i++) {
			asyncService.executorAsyncTask(i);
		}

		context.close();
	}

}
