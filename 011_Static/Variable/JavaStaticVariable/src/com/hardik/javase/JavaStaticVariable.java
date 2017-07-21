package com.hardik.javase;

/**
 * Student Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Student {

	private int rlno;
	private String name;
	private static String collage = "IIT-B";

	public Student(int rlno, String name) {
		this.rlno = rlno;
		this.name = name;
	}

	public void printStudentData() {
		System.out
				.println("Student [Rollno=" + this.rlno + ", Name=" + this.name + ", Collage=" + Student.collage + "]");
	}
}

/**
 * Java Static Variable Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class JavaStaticVariable {

	public static void main(String[] args) {

		Student s1 = new Student(25, "Devin Dhaduk");
		Student s2 = new Student(90, "Parth Sakhiya");

		s1.printStudentData();
		s2.printStudentData();
	}

}