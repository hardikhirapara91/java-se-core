package com.hardik.javase;

/**
 * Java Two Dimensional Array
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class TwoDimArray {

	public static void main(String[] args) {

		int[][] no = new int[3][4];
		int k = 0;

		for (int i = 0; i < no.length; i++) {
			for (int j = 0; j < no.length; j++) {
				no[i][j] = k;
				k++;
			}
		}

		for (int i = 0; i < no.length; i++) {
			for (int j = 0; j < no.length; j++) {
				System.out.print(no[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		// Explanation of Two Dimensional Array
		for (int i = 0; i < no.length; i++) {
			for (int j = 0; j < no.length; j++) {
				System.out.print("no[" + i + "][" + j + "]=" + no[i][j]);
				System.out.print("    ");
			}
			System.out.println();
		}
	}
}
