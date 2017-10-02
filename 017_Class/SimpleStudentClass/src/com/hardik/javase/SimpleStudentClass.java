package com.hardik.javase;

/**
 * Simple Student Class Example
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class SimpleStudentClass {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student(100, "Devin");

		s1.setId(200);
		s1.setName("Parth");

		System.out.println(s1);
		System.out.println(s2);
	}
}
