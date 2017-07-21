package com.hardik.javase;

/*
 * This is simple java variables example.
 * Declare one variable called number.
 * Assign value 500 and print number variable.
 * Then multiply number with 2 and print variable.
 */
public class Variables {

	public static void main(String[] args) {

		int number; // Declare variable as Integer type.
		number = 500; // Assign value to variable

		System.out.println("Number Before: " + number); // Print variable

		number *= 2; // Multiply variable with 2

		System.out.println("Number After: " + number);
	}
}
