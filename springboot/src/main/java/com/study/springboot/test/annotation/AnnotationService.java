package com.study.springboot.test.annotation;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {
	public void outputResult(){
		System.out.println("从组合注解照样活得bean配置");
	}
}
