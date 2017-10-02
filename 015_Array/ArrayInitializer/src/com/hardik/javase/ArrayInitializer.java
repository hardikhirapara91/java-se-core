package com.hardik.javase;

/**
 * One Dimensional Array Initializer
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ArrayInitializer {

	public static void main(String[] args) {

		String days[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday" };

		for (String day : days) {
			System.out.println(day);
		}

		// System.out.println(days[8]); // Java ArrayIndexOutOfBoundsException
	}

}
