package com.teja.SpringMay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
    public static void main( String[] args )
    {
    	//ApplicationContext is an interface
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	
//    	Vehicle obj = (Vehicle)context.getBean("bike");//getBean() returns Object of Object , so type cast it
//    	obj.drive();
    
    	Tyre t = (Tyre)context.getBean("tyre");
    	System.out.println(t);
    }
}
