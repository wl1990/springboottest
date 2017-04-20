package com.test.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClasspathXmlApplicationContext extends ClassPathXmlApplicationContext{
		public MyClasspathXmlApplicationContext(String... configLocations){
			super(configLocations);
		}
		
		protected void initPropertySources(){
			// 添加验证
			getEnvironment().setRequiredProperties("VAR");
		}
	
}
