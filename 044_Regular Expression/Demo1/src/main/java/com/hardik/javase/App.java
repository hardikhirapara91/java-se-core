package com.hardik.javase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java Regular Expression Example
 *
 */
public class App {
	public static void main(String[] args) {

		String regx = ".s";
		String input = "as";

		// Method - 1
		Pattern pattern = Pattern.compile(regx);
		Matcher matcher = pattern.matcher(input);
		boolean foundMatches = matcher.matches();
		System.out.println(foundMatches);

		// Method - 2
		foundMatches = Pattern.compile(regx).matcher(input).matches();
		System.out.println(foundMatches);

		// Method - 3
		foundMatches = Pattern.matches(regx, input);
		System.out.println(foundMatches);

	}
}
