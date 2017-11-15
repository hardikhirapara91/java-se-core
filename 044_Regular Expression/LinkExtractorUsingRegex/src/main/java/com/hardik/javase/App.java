package com.hardik.javase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java Link Extractor Example using Regular Expression
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {

	private static final String HTML_A_TAG_PATTERN = "(?i)<a([^>]+)>(.+?)</a>";
	private static final String HTML_A_HREF_TAG_PATTERN = "\\s*(?i)href\\s*=\\s*(\"([^\"]*\")|'[^']*'|([^'\">\\s]+))";

	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String input = "This is <a href='https://google.com/'>Google</a> Link.";

		Pattern patternTag = Pattern.compile(HTML_A_TAG_PATTERN);
		Matcher matcherTag = patternTag.matcher(input);

		if (matcherTag.find()) {

			String href = matcherTag.group(1);
			String linkText = matcherTag.group(2);

			Pattern patternTagAttr = Pattern.compile(HTML_A_HREF_TAG_PATTERN);
			Matcher matcherTagAttr = patternTagAttr.matcher(href);

			if (matcherTagAttr.find()) {
				System.out.println("Link Text: " + linkText);
				System.out.println("Link: " + matcherTagAttr.group(1).replace("'", ""));
			}
		}
	}

}
