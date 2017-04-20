package com.test.selftag;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.test.model.MyClasspathXmlApplicationContext;
import com.test.model.User;



public class SelfTagTest {
	public static void main(String[] args) {
		/*BeanFactory bf=new XmlBeanFactory(new ClassPathResource("selftagtest.xml"));
		ApplicationContext ac=new ClassPathXmlApplicationContext("selftagtest.xml");*/
		ApplicationContext ac1=new MyClasspathXmlApplicationContext("selftagtest.xml");
		User user=(User) ac1.getBean("testBean");
		System.out.println("---"+user.getUserName()+"---"+user.getEmail());
		
	}
}
