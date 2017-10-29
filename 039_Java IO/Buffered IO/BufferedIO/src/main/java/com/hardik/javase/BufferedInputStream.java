package com.hardik.javase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Java Buffered Input Stream Class Example
 *
 */
public class BufferedInputStream {
	public static void main(String[] args) {
		try {
			InputStream inputStream = new java.io.BufferedInputStream(new FileInputStream("E://Hardik//temp//abc.txt"));

			int i = 0;
			while ((i = inputStream.read()) != -1) {
				System.out.print((char) i);
			}
			inputStream.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
