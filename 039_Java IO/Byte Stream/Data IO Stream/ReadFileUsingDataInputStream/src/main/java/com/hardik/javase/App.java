package com.hardik.javase;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Read File using Data Input Stream
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {
	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		FileInputStream fileInputStream = null;
		BufferedInputStream bufferedInputStream = null;
		DataInputStream dataInput = null;

		try {
			fileInputStream = new FileInputStream("/tmp/abc.txt");
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			dataInput = new DataInputStream(bufferedInputStream);

			while (dataInput.available() != 0) {
				System.out.println(dataInput.readLine());
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {

			// Close Input-Stream
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}

			// Close Buffered-Input-Stream
			if (bufferedInputStream != null) {
				try {
					bufferedInputStream.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}

			// Close Data-Input-Stream
			if (dataInput != null) {
				try {
					dataInput.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
