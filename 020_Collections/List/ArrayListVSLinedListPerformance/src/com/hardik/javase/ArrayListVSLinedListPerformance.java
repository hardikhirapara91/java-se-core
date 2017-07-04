package com.hardik.javase;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ArrayListVSLinedListPerformance Class
 * 
 * @author HARDIK HIRAPARA
 */
public class ArrayListVSLinedListPerformance {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// Add ArrayList
		long startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("ArrayList add:" + duration);

		// Add LinkedList
		startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			linkedList.add(i);
		}

		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList add:" + duration);

		// Get ArrayList
		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			arrayList.get(i);
		}

		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList get:" + duration);

		// Get LinkedList
		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			linkedList.get(i);
		}

		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList get:" + duration);

		// ArrayList removes
		startTime = System.nanoTime();

		for (int i = 9999; i >= 0; i--) {
			arrayList.remove(i);
		}

		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList remove:" + duration);

		// Remove LinkedList
		startTime = System.nanoTime();

		for (int i = 9999; i >= 0; i--) {
			linkedList.remove(i);
		}

		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList remove:" + duration);
	}
}
