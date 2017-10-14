package com.study.springboot.test.taskschedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.study.springboot.test.taskschedule")
@EnableScheduling
public class TaskScheduleConfig {

}
