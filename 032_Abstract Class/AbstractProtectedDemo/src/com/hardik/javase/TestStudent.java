package com.hardik.javase;

/**
 * Test Student
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class TestStudent {

	public static void print(Student s) {
		int marks = s.getMarks();

		s.print();

		if (marks > 80)
			System.out.println("A");
		else if (marks > 70)
			System.out.println("B");
		else
			System.out.println("C");

	}

	public static void main(String[] args) {

		// OracleStudent s1 = new OracleStudent("Larry", "9988776655", 80);
		// print(s1);

		JavaEEStudent jes = new JavaEEStudent("AAA", "654321684313213", 45, 56);
		print(jes);

	}
}
