package com.study.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springmvc.domain.DemoObj;

@Controller
public class ConverterConverter {
	@RequestMapping(value="/convert",produces={"application/x-wisely"})
	public @ResponseBody DemoObj convert(@RequestBody DemoObj obj){
		return obj;
	}
}
