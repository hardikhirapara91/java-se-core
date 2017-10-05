package com.hardik.javase;

/**
 * Interface FirstTest
 * 
 * @author HARDIK HIRAPARA
 *
 */
public interface Test {
	public void print();

	default void display() {
		System.out.println("This is default-display method in Test interface.");
	}
}
