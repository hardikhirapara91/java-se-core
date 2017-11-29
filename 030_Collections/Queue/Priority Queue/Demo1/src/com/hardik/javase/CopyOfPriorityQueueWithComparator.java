package com.hardik.javase;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Priority Queue Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CopyOfPriorityQueueWithComparator {

	public static void main(String[] args) {

		PriorityQueue<String> priorityQueue = new PriorityQueue<String>(new Comparator<String>() {
			@Override
			public int compare(String i, String j) {
				return i.compareToIgnoreCase(j);
			}
		});

		String[] alphabets = { "b", "e", "d", "h", "j", "a", "c", "f", "g", "i", "B", "E", "D", "H", "J", "A", "C", "F",
				"G", "I" };

		// Add Element
		for (String alphabet : alphabets) {
			priorityQueue.offer(alphabet);
		}

		// Get Element
		for (String alphabet : priorityQueue) {
			System.out.println("Alphabet: " + alphabet);
		}
	}
}
