package com.study.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springmvc.domain.DemoObj;

/**
 * 主要用于一些controller控制器全局配置处理,对所有添加了@RequestMapping的注解有效
 * 
 * 在进行全局配置的文件中添加@ControllerAdvice注解
 * 然后在不同的方法上添加子注解
 * 其中@ExceptionHandler注解用于配置全局异常处理,此方法触发时机为异常抛出到controller层之后(不是太确定)
 * 然后@initBinder注解用于在页面参数进入 映射方法之前先进行一步modle的处理,可以添加或者删除一些数据
 * 最后ModelAttribute用于在页面参数进入映射方法之前进行全局属性的处理可以添加一些东西,然后在映射方法上添加此注释进行获取
 *
 */
@Controller
public class AdviceController {
	@RequestMapping("/advice")
	public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj){
		System.out.println("AdviceController-getSomething:");
		throw new IllegalArgumentException("非常抱歉,参数有无/"+"来自@ModelAttribute:"+msg);
	}
}
