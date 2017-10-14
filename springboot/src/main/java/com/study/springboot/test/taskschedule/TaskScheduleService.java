package com.study.springboot.test.taskschedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskScheduleService {
	private static  final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:");
	
	@Scheduled(fixedRate = 5000)//每5秒钟执行一次
	public void reportCurrentTime() {
		System.out.println("每隔5秒执行一次 "+dateFormat.format(new Date()));
	}
	
	@Scheduled(cron = "0 21 16 ? * *")//指定时间下执行  可以使用表达式进行配置
	public void fixTimeExcution() {
		System.out.println("在指定时间执行 "+dateFormat.format(new Date()));

	}
}
