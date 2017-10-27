package com.hardik.javase.model;

/**
 * Student Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Student extends Person {

	public String courses;

	public Student(String name, String email, String courses) {
		super(name, email);
		this.courses = courses;
	}

	@Override
	public void printPersonInfo() {
		super.printPersonInfo();
		System.out.println("Courses: " + courses);
	}

	@Override
	public String getOccupation() {
		return "Persuing  " + courses;
	}
}
