package com.hardik.javase;

import java.util.ArrayList;
import java.util.List;

/**
 * Array List Example
 * 
 * @author HARDIK HIRAPARA
 */
public class ArrayListExample {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		list.add("Element 1");
		list.add("Element 2");
		list.add("Element 3");

		System.out.println("All: " + list);

		// Index based retrival
		System.out.println("Get Element at 0 index : " + list.get(0));

		// Iteration
		for (String element : list) {
			System.out.println(element);
		}

		// Remove a element using index
		list.remove(1);

		System.out.println("All: " + list);

		list2.add("Test Element 1");

		// Add another collection
		list.addAll(list2);
		System.out.println("Added Collections");

		// Iteration
		for (String element : list) {
			System.out.println(element);
		}
	}

}
