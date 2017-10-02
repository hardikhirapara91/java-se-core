package com.hardik.javase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Synchronized Array List Example
 * 
 * @author HARDIK HIRAPARA
 */
public class Example1 {

	public static void main(String[] args) {

		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("AABBCC");
		list.add("DDEEFF");

		// Retrieve Element
		synchronized (list) {
			Iterator<String> iterator = list.listIterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}

}
