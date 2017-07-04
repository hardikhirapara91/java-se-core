package com.hardik.javase;

/**
 * Java if-else ladder example.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class IfElseIfExample {

	public static void main(String[] args) {

		int marks = 55;
		String grade = "";

		if (marks < 50) {
			grade = "F";
		} else if (marks >= 50 && marks <= 60) {
			grade = "D";
		} else if (marks > 60 && marks <= 70) {
			grade = "C";
		} else if (marks > 70 && marks <= 80) {
			grade = "B";
		} else if (marks > 80 && marks <= 90) {
			grade = "A";
		} else if (marks > 90 && marks <= 100) {
			grade = "A+";
		} else {
			System.out.println("Invalid Input.");
		}

		if (grade.equals("F")) {
			System.out.println("Sorry, You are Fail.");
		} else {
			System.out.println("Congratulations, Your Grade is: " + grade);
		}
	}
}
