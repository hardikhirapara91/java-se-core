/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hardik.javase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Counter Class
 * 
 * @author HARDIK HIRAPARA
 */
class Counter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int counter = 0;

	public Counter() {
		this.counter++;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}

/**
 * Deep Cloning Example
 * 
 * @author HARDIK HIRAPARA
 */
public class DeepCloningDemo implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String branch;
	private Counter counter;

	public DeepCloningDemo(String name, String branch) {
		this.name = name;
		this.branch = branch;
		this.counter = new Counter();
	}

	/**
	 * Clone Method
	 * 
	 * @return Object
	 * @throws CloneNotSupportedException
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {

		DeepCloningDemo obj = (DeepCloningDemo) super.clone();
		Object object = null;

		try {
			object = getDeepCloningDemoObject(obj);
			this.counter.setCounter(3);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return object;
	}

	/**
	 * Write Object into Buffer
	 * 
	 * @param object
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object getDeepCloningDemoObject(Object object) throws IOException, ClassNotFoundException {

		// Write Object into Buffer Reader
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(object);

		// Read Object into Buffer Reader
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);

		DeepCloningDemo obj = (DeepCloningDemo) ois.readObject();
		return obj;
	}

	public static void main(String[] args) {

		DeepCloningDemo obj = new DeepCloningDemo("Hardik", "Computer");

		try {
			obj = (DeepCloningDemo) obj.clone();
			System.out.println(obj.counter.getCounter());

		} catch (CloneNotSupportedException ex) {
			Logger.getLogger(DeepCloningDemo.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}