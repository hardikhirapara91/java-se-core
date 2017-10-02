package com.hardik.javase;

import java.util.ArrayList;
import java.util.List;

/**
 * App Main Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class AppMain {

	public static void main(String[] args) {

		List<String> listA = new ArrayList<>();
		listA.add("A");
		listA.add("B");
		listA.add("C");
		listA.add("D");
		List<String> listB = new ArrayList<>();
		listB.add("C");
		listB.add("D");
		listB.add("E");
		listB.add("E");

		// listA.retainAll(listB); // Intersection
		// listA.addAll(listB); // Union
		listA.removeAll(listB); // Negation

		System.out.println(listA);
		System.out.println(listB);
	}

}
