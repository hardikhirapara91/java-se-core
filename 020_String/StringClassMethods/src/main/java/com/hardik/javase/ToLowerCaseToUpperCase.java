package com.hardik.javase;

/**
 * Java String toLowerCase() and toUpperCase() Method
 * 
 * The java string toLowerCase() method returns the string in lowercase letter.
 *
 * The java string toUpperCase() method returns the string in uppercase letter.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ToLowerCaseToUpperCase {
	public static void main(String[] args) {

		String s1 = "Hello JAVA Programming.";

		/**
		 * ToLowerCase()
		 */
		String str = s1.toLowerCase();
		System.out.println(str);

		/**
		 * ToUpperCase()
		 */
		str = s1.toUpperCase();
		System.out.println(str);
	}
}