package com.teja.di.ot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		/*Student student = new Student();
		MathCheat cheat = new MathCheat();
		student.setMathCheat(cheat);*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student1 = (Student)context.getBean("student", Student.class);
		student1.cheating();
		
		AnotherStudent student2 =(AnotherStudent)context.getBean("anotherStudent", AnotherStudent.class);
		student2.startCheating();   
	}
}
