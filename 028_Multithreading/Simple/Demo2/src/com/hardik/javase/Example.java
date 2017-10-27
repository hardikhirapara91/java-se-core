package com.hardik.javase;

/**
 * Thread Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
class ThreadDemo implements Runnable {

	@Override
	public String toString() {
		return Thread.currentThread().getName();
	}

	@Override
	public void run() {
		System.out.println(this);
	}
}

/**
 * Example Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Example {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new ThreadDemo(), "First");
		Thread thread2 = new Thread(new ThreadDemo(), "Second");

		thread1.start();
		thread2.start();

	}
}
