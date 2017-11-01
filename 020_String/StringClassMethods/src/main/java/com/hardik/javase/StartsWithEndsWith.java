package com.hardik.javase;

/**
 * Java String startsWith() and endsWith() Method
 * 
 * The java string endsWith() method checks if this string ends with given
 * suffix. It returns true if this string ends with given suffix else returns
 * false.
 * 
 * The java string startsWith() method checks if this string starts with given
 * suffix. It returns true if this string starts with given suffix else returns
 * false.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class StartsWithEndsWith {
	public static void main(String[] args) {

		String s1 = "I love java programming.";

		// Starts With
		System.out.println(s1.startsWith("I"));
		System.out.println(s1.startsWith("love"));

		// Ends With
		System.out.println(s1.endsWith("."));
		System.out.println(s1.endsWith("programming"));

	}
}