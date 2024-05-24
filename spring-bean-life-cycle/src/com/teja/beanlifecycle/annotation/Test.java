package com.teja.beanlifecycle.annotation;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	StudentDAO student = (StudentDAO)context.getBean("studentDAO");
	student.selectAllRows();
	
	}

}
