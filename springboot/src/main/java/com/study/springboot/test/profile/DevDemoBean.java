package com.study.springboot.test.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevDemoBean implements ParentProfileInter {

	/**
	 * @return the content
	 */
	public String getContent() {
		return "dev";
	}

}
