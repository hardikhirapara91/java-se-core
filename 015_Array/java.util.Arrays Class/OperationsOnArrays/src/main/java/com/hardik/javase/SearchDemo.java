package com.hardik.javase;

import java.util.Arrays;

/**
 * Search element in Array demo
 * 
 * Arrays.binarySearch() method works when all array element is sorted order,
 * That
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class SearchDemo {
	/**
	 * Application Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] no = { 100, 45, 67, 90, 200, 2, 5 };

		System.out.println(Arrays.binarySearch(no, 2)); // -1 because array
														// elements is
														// not sorted

		Arrays.sort(no);

		System.out.println(Arrays.binarySearch(no, 2)); // 0
		System.out.println(Arrays.binarySearch(no, 200)); // 6
		System.out.println(Arrays.binarySearch(no, 900)); // -8
	}
}
