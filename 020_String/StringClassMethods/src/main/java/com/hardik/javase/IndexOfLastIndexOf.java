package com.hardik.javase;

/**
 * Java String indexOf() and lastIndexOf() Method
 * 
 * The java string indexOf() method returns index of given character value or
 * substring. If it is not found, it returns -1. The index counter starts from
 * zero.
 * 
 * The java string lastIndexOf() method returns last index of the given
 * character value or substring. If it is not found, it returns -1. The index
 * counter starts from zero.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class IndexOfLastIndexOf {
	public static void main(String[] args) {

		/**
		 * IndexOf()
		 */
		String s1 = "This is java programming example.";

		// passing substring
		int index1 = s1.indexOf("is");// returns the index of is substring
		int index2 = s1.indexOf("java");// returns the index of index substring
		System.out.println(index1 + "  " + index2);// 2 8

		// passing substring with from index
		// returns the index of is substring after 4th index
		int index3 = s1.indexOf("is", 4);
		System.out.println(index3);// 5 i.e. the index of another is

		// passing char value
		int index4 = s1.indexOf('s');// returns the index of s char value
		System.out.println(index4);// 3

		/**
		 * LastIndexOf()
		 */
		System.out.println(s1.lastIndexOf("i"));//21 
	}
}