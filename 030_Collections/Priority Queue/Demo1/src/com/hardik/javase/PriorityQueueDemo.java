package com.hardik.javase;

import java.util.PriorityQueue;

/**
 * Priority Queue Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

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
