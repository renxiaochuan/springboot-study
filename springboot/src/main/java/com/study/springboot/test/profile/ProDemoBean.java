package com.study.springboot.test.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProDemoBean  implements ParentProfileInter{

	/**
	 * @return the content
	 */
	public String getContent() {
		return "prod";
	}

}
