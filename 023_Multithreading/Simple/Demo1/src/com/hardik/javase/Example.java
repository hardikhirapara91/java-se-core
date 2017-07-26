package com.hardik.javase;

/**
 * Thread Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
class ThreadDemo extends Thread {

	private static int threadID = 0;

	public ThreadDemo() {
		super("ID:" + (++threadID));
	}

	@Override
	public String toString() {
		return super.getName();
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

		ThreadDemo td1 = new ThreadDemo();
		ThreadDemo td2 = new ThreadDemo();
		td1.run();
		td2.run();

	}
}
