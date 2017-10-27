package com.hardik.hirapara;

/**
 * String Demo2
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class StringDemo2 {

	public static void main(String[] args) {

		String str1 = "Hi";
		String str2 = "Hello";
		String str3 = str1;
		String str4 = new String("Hi");

		// Check Equality
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);

		// Length of the String
		System.out.println("Length of the str2 string: " + str2.length());

		// Get character at specific position.
		System.out.println(str1.charAt(1));
	}

}
