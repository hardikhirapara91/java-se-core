package com.hardik.javase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java Regular Expression (String Replace) Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		String input = "This is an apple. These are 33 (Thirty-three) apples";
		String regexe = "apple"; // pattern to be matched
		String replacement = "orange"; // replacement pattern

		// Step 1: Allocate a Pattern object to compile a regexe
		Pattern pattern = Pattern.compile(regexe, Pattern.CASE_INSENSITIVE);

		// Step 2: Allocate a Matcher object from the pattern, and provide the
		// input
		Matcher matcher = pattern.matcher(input);

		// Step 3: Perform the matching and process the matching result
		String output = matcher.replaceAll(replacement); // All matches
		System.out.println(output);
		output = matcher.replaceFirst(replacement); // First match only
		System.out.println(output);
	}
}
