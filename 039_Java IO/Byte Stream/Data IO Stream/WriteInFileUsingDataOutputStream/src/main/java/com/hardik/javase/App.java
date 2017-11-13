package com.hardik.javase;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Write in File using DataOutputStream
 * 
 * Java DataOutputStream class allows an application to write primitive Java
 * data types to the output stream in a machine-independent way.
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		OutputStream outputStream = null;
		DataOutput dataOutput = null;

		try {
			outputStream = new FileOutputStream("E:\\Hardik\\temp\\abc.txt");
			dataOutput = new DataOutputStream(outputStream);
			dataOutput.writeInt(52);
			outputStream.flush();

			System.out.println("Success!");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (outputStream != null)
					outputStream.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
