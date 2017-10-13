package com.hardik.javase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java Regular Expression Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		// Input for matching the regexe pattern
		String input = "This is an apple. These are 33 (thirty-three) apples";
		// Regexe to be matched
		String regexe = "Th";

		// Step 1: Allocate a Pattern object to compile a regexe
		Pattern pattern = Pattern.compile(regexe);
		// case-insensitive matching
		// Pattern pattern = Pattern.compile(regexe, Pattern.CASE_INSENSITIVE);

		// Step 2: Allocate a Matcher object from the compiled regexe pattern,
		// and provide the input to the Matcher
		Matcher matcher = pattern.matcher(regexe);

		// Step 3: Perform the matching and process the matching result
		// Use method find()
		while (matcher.find()) { // find the next match
			System.out.println("find() found the pattern \"" + matcher.group() + "\" starting at index "
					+ matcher.start() + " and ending at index " + matcher.end());
		}

		// Use method matches()
		if (matcher.matches()) {
			System.out.println("matches() found the pattern \"" + matcher.group() + "\" starting at index "
					+ matcher.start() + " and ending at index " + matcher.end());
		} else {
			System.out.println("matches() found nothing");
		}

		// Use method lookingAt()
		if (matcher.lookingAt()) {
			System.out.println("lookingAt() found the pattern \"" + matcher.group() + "\" starting at index "
					+ matcher.start() + " and ending at index " + matcher.end());
		} else {
			System.out.println("lookingAt() found nothing");
		}
	}
}
