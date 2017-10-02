package com.hardik.javase;

/**
 * Method Return Value Example
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class MethodReturnValue {

	public static void main(String[] args) {

		Box b1 = new Box();

		b1.setVolumeData(23, 44, 67);

		System.out.println("Volume is: " + b1.getVolume());
	}

}
