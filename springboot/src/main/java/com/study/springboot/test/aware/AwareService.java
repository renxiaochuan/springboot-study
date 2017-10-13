package com.study.springboot.test.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	
	private String beanName;
	private ResourceLoader loader;
	
	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println("把这个加载器给了bean");
		this.loader = resourceLoader;

	}
	
	public void setBeanName(String name) {
		System.out.println("设置了bean的名字");
		this.beanName = name;

	}

	public void outputResult(){
		System.out.println("bean的名字为"+beanName);
		Resource resource = loader.getResource("classpath:com/study/springboot/test/aware/test.txt");
		try{
			System.out.println(IOUtils.toString(resource.getInputStream()));
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
