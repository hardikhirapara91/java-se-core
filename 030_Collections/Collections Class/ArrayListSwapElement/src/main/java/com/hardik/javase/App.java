package com.hardik.javase;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Swap Element using ArrayList
 *
 */
public class App {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Sachin");
		al.add("Rahul");
		al.add("Saurav");
		al.add("Sunil");
		al.add("Kapil");
		al.add("Vinod");

		System.out.println("Before: " + al);

		// Swapping 2nd(index 1) element with the 5th(index 4) element
		Collections.swap(al, 1, 4);

		System.out.println("After: " + al);
	}
}
