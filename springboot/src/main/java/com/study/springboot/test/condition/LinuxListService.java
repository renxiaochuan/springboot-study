package com.study.springboot.test.condition;

public class LinuxListService implements ListService {

	public String showListCmd() {
		return "ls";
	}

}
