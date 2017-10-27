package com.hardik.javase;

import java.util.regex.Pattern;

/**
 * Java Regular Expression Example
 * 
 * Create a regular expression that accepts 10 digit numeric characters starting
 * with 7, 8 or 9 only
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		System.out.println("by character classes and quantifiers ...");
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));// true
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));// true

		// false (11 characters)
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));
		// false (starts from 6)
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));// true

		System.out.println("by metacharacters ...");
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));// true
		// false (starts from 3)
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));

	}
}
