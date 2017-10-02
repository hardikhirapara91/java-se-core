package com.hardik.javase;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example2 {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");

		System.out.println("Displaying synchronized ArrayList Elements:");

		// Synchronized block is not required in this method
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
