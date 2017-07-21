package com.hardik;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * HashTable Example
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class HashTableExample {

	public static void main(String[] args) {

		Hashtable<Integer, String> table = new Hashtable<>();
		table.put(1, "AAA");
		table.put(2, "CCC");
		table.put(3, "BBB");

		Enumeration<Integer> keys = table.keys();

		while (keys.hasMoreElements()) {
			Integer key = keys.nextElement();
			System.out.println(key + " = " + table.get(key));
		}
	}
}
