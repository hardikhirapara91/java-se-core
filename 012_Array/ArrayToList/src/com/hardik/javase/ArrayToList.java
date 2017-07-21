package com.hardik.javase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Convert Array to List
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ArrayToList {

	/**
	 * Convert Array to List using for loop
	 * 
	 * @param no
	 * @return List
	 */
	private static List<Integer> convertArrayToList(int[] no) {
		List<Integer> list = new ArrayList<Integer>();

		for (Integer i : no) {
			list.add(i);
		}
		return list;
	}

	public static void main(String[] args) {

		int[] no = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = null;

		/**
		 * Convert using for-each loop
		 */
		list = convertArrayToList(no);
		System.out.println("List: " + list);

		/**
		 * Convert using java stream API
		 */
		list = Arrays.stream(no).boxed().collect(Collectors.toList());
		System.out.println("List: " + list);
	}

}
