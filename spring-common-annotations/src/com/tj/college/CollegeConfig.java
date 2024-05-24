package com.tj.college;


import org.springframework.context.annotation.Configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages = "com.tj.college")
public class CollegeConfig {
	
	@Bean
	public College collegeBean() { //collegeBean  - bean id
		
		College college = new College();
		return college;
	}
}