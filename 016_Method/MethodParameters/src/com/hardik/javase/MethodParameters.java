package com.hardik.javase;

/**
 * Java Method Parameters Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class MethodParameters {

	/**
	 * Method that takes parameter called no
	 * 
	 * @param no
	 * @return
	 */
	public int calculateSquare(int no) {
		return no * no;
	}

	/**
	 * Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MethodParameters mp = new MethodParameters();
		System.out.println("Square: " + mp.calculateSquare(25));
	}
}
