package com.hardik.javase;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * java.util.ArrayDeque Example
 * 
 * The java.util.ArrayDeque class provides resizable-array and implements the
 * Deque interface.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {
	/**
	 * Application Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Deque<Integer> queue = new ArrayDeque<Integer>();

		queue.add(11);
		queue.add(12);
		queue.add(13);
		queue.add(14);
		queue.add(10);
		queue.push(9);
		queue.offer(8);

		System.out.println("Queue: " + queue);

		System.out.println(queue.element()); // 9
		System.out.println(queue.remove(13)); // true
		System.out.println(queue.poll()); // 9
		System.out.println(queue.remove()); // 11
		System.out.println("peeked: " + queue.peek()); // peeked: 12
		System.out.println(queue.element()); // 12
		System.out.println(queue.pop()); // 12

		System.out.println(queue); // [14, 10, 8]
	}
}
