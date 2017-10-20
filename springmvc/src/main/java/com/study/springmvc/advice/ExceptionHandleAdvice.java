package com.study.springmvc.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandleAdvice {
	@ExceptionHandler(value=Exception.class)
	public ModelAndView exception (Exception exception ,WebRequest request){
		ModelAndView modelAndView = new ModelAndView("error");
		modelAndView.addObject("errorMessage", exception.getMessage());
		System.out.println("ExceptionHandleAdvice-exception:");
		return modelAndView;
	}
	
	@ModelAttribute
	public void addAttributes(Model model){
		System.out.println("ExceptionHandleAdvice-addAttributes:");
		model.addAttribute("msg","额外信息");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
		System.out.println("ExceptionHandleAdvice-initBinder:");
		webDataBinder.setDisallowedFields("id");
	}
}
