package com.hardik.javase;

/**
 * Java Array Class Name Example
 * 
 * In java, array is an object. For array object, an proxy class is created
 * whose name can be obtained by getClass().getName() method on the object.
 * 
 * @author HARDIK HIRAPARA
 */
public class App {

	public static void main(String[] args) {

		int[] id = { 10, 20, 30 };
		System.out.println("Name: " + id.getClass().getName()); // Output: [I

	}

}
