package com.hardik.javase;

import java.util.regex.Pattern;

/**
 * Java Regular Expression Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));// true

		// false (more than 6 char)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));// true

		// false ($ is not matched)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));
	}
}
