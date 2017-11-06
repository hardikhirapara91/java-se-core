package com.hardik.javase;

import java.util.HashSet;
import java.util.Set;

/**
 * Check Duplicate Value in Array
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CheckDuplicateInArray {
	/**
	 * Check Duplicate using Normal For-Loop
	 * 
	 * @param data
	 * @return
	 */
	public static boolean checkDuplicateWithNormal(String[] data) {
		for (int i = 0; i < data.length; i++) {
			String valueToCheck = data[i];

			// Remove blank string
			if (valueToCheck == null || valueToCheck.isEmpty())
				continue;

			for (int j = 0; j < data.length; j++) {

				if (i == j) // Same line ignore
					continue;

				String valueToCompare = data[j];
				if (valueToCheck.equals(valueToCompare)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Check Duplicate using Set
	 * 
	 * @param data
	 * @return
	 */
	public static boolean checkDuplicateWithSet(String[] data) {
		Set<String> valueSet = new HashSet<String>();

		for (String value : data) {
			if (valueSet.contains(value)) {
				return true;
			} else {
				if (value != null && !value.equals("")) {
					valueSet.add(value);
				}
			}
		}

		return false;
	}

	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] data = { "A", "B", "C", "D", null, "", "E", "C", "A" };

		if (checkDuplicateWithNormal(data)) {
			System.out.println("Duplicate value found!");
		}

		if (checkDuplicateWithSet(data)) {
			System.out.println("Duplicate value found!");
		}
	}
}
