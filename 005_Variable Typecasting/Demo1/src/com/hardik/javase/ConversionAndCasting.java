package com.hardik.javase;

/**
 * Java Conversion and Casting Example
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ConversionAndCasting {

	public static void main(String[] args) {

		// Automatic Conversion (Widenning Conversion)
		int i = 1000;
		long l = i;

		System.out.println("i and l: " + i + " " + l);

		// Manually Conversion (Narrowing Conversion)
		long x = 1234567890l;
		int y = (int) x;

		System.out.println("x and y: " + x + " " + y);
	}

}
