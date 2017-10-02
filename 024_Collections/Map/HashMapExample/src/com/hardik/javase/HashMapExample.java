package com.hardik.javase;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMap Example
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "ABC");
		map.put(2, "DEF");

		Set<Entry<Integer, String>> entries = map.entrySet();
		Iterator<Entry<Integer, String>> setIterator = entries.iterator();

		while (setIterator.hasNext()) {
			Map.Entry<Integer, String> entry = setIterator.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
