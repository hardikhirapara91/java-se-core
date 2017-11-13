package com.hardik.javase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/**
 * Sequence Input Stream Class Example
 * 
 * Java SequenceInputStream class is used to read data from multiple streams. It
 * reads data sequentially (one by one).
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

		InputStream file1 = null, file2 = null, seqInput = null;

		try {
			file1 = new FileInputStream("/tmp/abc.txt");
			file2 = new FileInputStream("/tmp/def.txt");

			seqInput = new SequenceInputStream(file1, file2);

			int i = 0;
			while ((i = seqInput.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (file1 != null)
					file1.close();
				if (file2 != null)
					file2.close();
				if (seqInput != null)
					seqInput.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
