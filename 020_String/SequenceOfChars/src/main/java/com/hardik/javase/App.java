package com.hardik.javase;

/**
 * Java string sequence of chars example
 * 
 * In java, string is an object and sequence of characters.
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	/**
	 * App Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		char[] chars = { 'J', 'A', 'V', 'A' };
		String str = new String(chars); // Same as String str = "JAVA";

		System.out.println(str);
	}

}
