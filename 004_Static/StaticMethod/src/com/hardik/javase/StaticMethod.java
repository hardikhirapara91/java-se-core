package com.hardik.javase;

/**
 * Static Method
 * 
 * @author HARDIK HIRAPARA
 * 
 */
public class StaticMethod {

	public static void main(String[] args) {

		Student s1 = new Student(12, "Devin Dhaduk");

		s1.printStudentData();
		Student.changeCollageName();
		s1.printStudentData();
	}
}
