package com.study.springboot.test.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String msg;

	public DemoEvent(Object source,String msg) {
		super(source);
		this.msg = msg;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
