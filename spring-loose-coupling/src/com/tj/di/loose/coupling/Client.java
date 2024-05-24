package com.tj.di.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client { 

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
		Student student = (Student)context.getBean("student");
		student.cheating();
		
		
	}
}
