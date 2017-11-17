package com.hardik.javase;

import java.util.regex.Pattern;

/**
 * Java Regular Expression Qquantifiers Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		System.out.println("? Quantifier ....");
		// true (a or m or n comes one time)
		System.out.println(Pattern.matches("[amn]?", "a"));
		// false (a comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "aaa"));
		// false (a m and n comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));
		// false (a comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "aazzta"));
		// false (a or m or n must come one time)
		System.out.println(Pattern.matches("[amn]?", "am"));

		System.out.println("+ Quantifier ....");
		// true (a or m or n once or more times)
		System.out.println(Pattern.matches("[amn]+", "a"));
		// true (a comes more than one time)
		System.out.println(Pattern.matches("[amn]+", "aaa"));
		// true (a or m or n comes more than once)
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));
		// false (z and t are not matching pattern)
		System.out.println(Pattern.matches("[amn]+", "aazzta"));

		System.out.println("* Quantifier ....");
		// true (a or m or n may come zero or more times)
		System.out.println(Pattern.matches("[amn]*", "ammmna"));
	}
}
