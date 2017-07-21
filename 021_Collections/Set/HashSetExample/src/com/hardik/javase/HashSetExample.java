package com.hardik.javase;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet Example
 * 
 * @author HARDIK HIRAPARA
 */
public class HashSetExample {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Hardik");
		set.add("Hirapara");

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("Size: " + set.size());
	}

}
