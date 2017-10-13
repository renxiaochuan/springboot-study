package com.study.springboot.test.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	public void onApplicationEvent(DemoEvent event) {
		 String msg = event.getMsg();
		 System.out.println("DemoListener 接收到了DemoEvent发布的消息"+msg);
	}

}
