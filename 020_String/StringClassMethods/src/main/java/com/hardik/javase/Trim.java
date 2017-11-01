package com.hardik.javase;

/**
 * Java String trim() Method
 * 
 * The java string trim() method eliminates leading and trailing spaces. The
 * unicode value of space character is '\u0020'. The trim() method in java
 * string checks this unicode value before and after the string, if it exists
 * then removes the spaces and returns the omitted string.
 * 
 * The string trim() method doesn't omits middle spaces.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Trim {
	public static void main(String[] args) {

		String s1 = "  Hello World!   ";
		
		System.out.println(s1 + "- How are you?");
		System.out.println(s1.trim() + "- How are you?");

	}
}