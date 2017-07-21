package com.hardik.javase;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Vector Example
 * 
 * @author HARDIK HIRAPARA
 */
public class VectorExample {

	public static void main(String[] args) {

		Vector<String> list = new Vector<String>();
		list.add("Hardik");
		list.add("Hirapara");

		System.out.println("Elements of vector: " + list);

		// Retrieve elements using enumerations
		Enumeration<String> elements = list.elements();
		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}

		// Retrieve elements using iterator
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("**************");
		System.out.println("Get first element: " + list.get(1));
	}

}
