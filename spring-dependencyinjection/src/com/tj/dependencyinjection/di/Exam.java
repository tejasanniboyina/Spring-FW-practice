package com.tj.dependencyinjection.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args ) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stu1 = (Student)context.getBean("student1", Student.class);
		stu1.displayStudentInfo(); 
	}
}
