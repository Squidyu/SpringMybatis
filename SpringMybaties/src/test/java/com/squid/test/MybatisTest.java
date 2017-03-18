package com.squid.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.squid.bean.Student;
import com.squid.dao.StudentDao;

public class MybatisTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext(
				new String[]{"/conf/spring-mybatis.xml"});
		 StudentDao bean = (StudentDao) beanFactory.getBean("studentDao");
		 Student stu = bean.getStuById("1");
		 System.out.println(stu);
		
	}
}
