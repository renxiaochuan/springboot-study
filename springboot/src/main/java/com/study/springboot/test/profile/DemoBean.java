package com.study.springboot.test.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service("demoBean")
//@Profile("dev")
public class DemoBean {
	private String content;
	
	public DemoBean(String content){
		this.content = content;
	}

	/**
	 * @return the content
	 */
	
	public String getContent() {
		return this.content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
 
}
