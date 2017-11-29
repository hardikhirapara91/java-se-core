package com.hardik.javase;

import java.util.Arrays;

/**
 * Sort Array using Arrays.sort() method
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Sorting {
	/**
	 * Application Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] no = { 100, 45, 67, 90, 200, 2, 5 };

		Arrays.sort(no);

		System.out.println(Arrays.toString(no));
	}
}
