package com.hardik.javase.model;

/**
 * Teacher Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Teacher extends Person {

	public String subjects;

	public Teacher(String name, String email, String subjects) {
		super(name, email);
		this.subjects = subjects;
	}

	@Override
	public void printPersonInfo() {
		super.printPersonInfo();
		System.out.println("Subjects: " + subjects);
	}

	@Override
	public String getOccupation() {
		return "Teaches " + subjects;
	}

}
