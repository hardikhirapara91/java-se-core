package com.hardik.javase;

import java.util.regex.Pattern;

/**
 * Java Regular Expression Character Class Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		// false (not a or m or n)
		System.out.println(Pattern.matches("[amn]", "abcd"));
		// true (among a or m or n)
		System.out.println(Pattern.matches("[amn]", "a"));
		// false (m and a comes more than once)
		System.out.println(Pattern.matches("[amn]", "ammmna"));

	}
}
