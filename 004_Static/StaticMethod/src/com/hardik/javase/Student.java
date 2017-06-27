package com.hardik.javase;

/**
 * Student Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Student {

	public int rlno;
	public String name;
	public static String collage = "IIT-B";

	public Student(int rlno, String name) {
		this.rlno = rlno;
		this.name = name;
	}

	public static void changeCollageName() {
		Student.collage = "IIT-D";
	}

	public void printStudentData() {
		System.out
				.println("Student [Rollno=" + this.rlno + ", Name=" + this.name + ", Collage=" + Student.collage + "]");
	}
}
