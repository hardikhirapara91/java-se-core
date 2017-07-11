package com.hardik.javase;

import java.io.ByteArrayOutputStream;

/**
 * Byte Array Output Stream Example
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ByteArrayOutput {

	public static void main(String[] args) {

		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		for (int i = 0; i < 50; i++) {
			baos.write((byte) (Math.random() * 100));
		}

		byte[] data = baos.toByteArray();
		for (byte b : data) {
			System.out.print(b + " ");
		}
	}

}
