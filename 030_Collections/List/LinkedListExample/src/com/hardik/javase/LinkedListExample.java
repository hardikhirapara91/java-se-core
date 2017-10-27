package com.hardik.javase;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Lined List Example
 * 
 * @author HARDIK HIRAPARA
 */
public class LinkedListExample {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		list.add("Hardik");
		list.add("Hirapara");

		System.out.println(list);

		Iterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
