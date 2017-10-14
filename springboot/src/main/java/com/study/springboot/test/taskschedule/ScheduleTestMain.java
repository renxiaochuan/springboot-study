package com.study.springboot.test.taskschedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务使用方法
 * 
 * 主要是用注解的方式进行，在配置类中添加@EnableScheduling注解以告知系统其内有定时任务
 * 
 * 在需要执行定时任务的类的方法上添加注解@Scheduled并指明定时情况可是指定时间规则或者间隔时长
 *
 */
public class ScheduleTestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskScheduleConfig.class);
//		context.getBean(TaskScheduleService.class);
	}

}
