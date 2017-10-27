package com.hardik.javase;

import java.util.StringTokenizer;

/**
 * String Tokenizer Class Example
 * 
 * StringTokenizer class is deprecated now. It is recommended to use split()
 * method of String class or regex (Regular Expression).
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

		StringTokenizer tokenizer = new StringTokenizer("I love India.", " ");

		while (tokenizer.hasMoreTokens())
			System.out.println(tokenizer.nextToken());

		System.out.println("---------------------");

		tokenizer = new StringTokenizer("My-name-is-Hardik-Hirapara", "-");
		while (tokenizer.hasMoreElements())
			System.out.println(tokenizer.nextElement());

		System.out.println("----------------------");

		tokenizer = new StringTokenizer("Hello World!");
		System.out.println("First Token: " + tokenizer.nextToken(" "));
		System.out.println("Second Token: " + tokenizer.nextToken(" "));
		
		System.out.println("----------------------");
		
		// Get total number of tokens
		tokenizer = new StringTokenizer("I love Java Programming."," ");
		System.out.println("Total Tokens: " + tokenizer.countTokens());
	}

}
