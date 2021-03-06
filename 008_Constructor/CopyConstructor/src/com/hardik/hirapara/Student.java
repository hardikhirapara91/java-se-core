package com.hardik.hirapara;

/**
 * Student Class
 * @author HARDIK HIRAPARA
 *
 */
public class Student {

	public int id;
	public String name;
	
	public Student(){}
	
	// A normal parametrized constructor
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Copy constructor
	public Student(Student s1) {
		System.out.println("Copy constructor called");
		this.id = s1.id;
		this.name = s1.name;
	}
	
	public void printStudentData() {
		System.out.println("Student Id and Name: " + id + " : " + name);
	}
}
