package com.tj.college;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
	College college= (College)context.getBean("colege");
	System.out.println("the object created by spring is " + college);
	college.test();
	
	context.close();
	
	}
	
	
}
