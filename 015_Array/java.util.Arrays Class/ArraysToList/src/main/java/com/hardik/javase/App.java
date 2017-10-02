package com.hardik.javase;

import java.util.Arrays;
import java.util.List;

/**
 * Application Main Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {
	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Convert array to list
		List<Integer> intList = Arrays.asList(arr);

		System.out.println(intList);
	}
}
