package com.tj.dependencyinjection.di;

public class Student {
	int id;
	String studentName;
	
	
	/*
	 * using setter method 
	 * public void setId(int id) {
		this.id = id;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}*/
	
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}
	
	
	public void displayStudentInfo() {
		System.out.println("Sudent id is " +id);
		System.out.println("Student name is " +studentName);
	}

}
