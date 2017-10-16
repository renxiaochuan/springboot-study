package com.study.springboot.test.fortest;

 

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.springboot.test.profile.ParentProfileInter;
import com.study.springboot.test.profile.ProFileConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ProFileConfig.class})
@ActiveProfiles("dev")
public class ForTest {
	@Autowired
	private ParentProfileInter bean;
	
	@Test
	public void testFun(){
		String a = bean.getContent();
		String b = "dev";
		Assert.assertEquals(a, b);
	}
}
