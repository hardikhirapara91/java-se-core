package com.hardik.javase;

/**
 * Class Counter
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Counter {

	public static int counter = 0;

	public Counter() {
		counter++;
		System.out.println("Counter: " + counter);
	}
}

/**
 * JavaStaticCounter Main Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class JavaStaticCounter {

	public static void main(String[] args) {

		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
	}
}
