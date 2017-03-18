package com.squid.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.squid.bean.Student;

public class SpringTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext(
				"/conf/spring-context.xml");
		Student student = (Student) beanFactory.getBean("stu");
		System.out.println(student);
	}
}
