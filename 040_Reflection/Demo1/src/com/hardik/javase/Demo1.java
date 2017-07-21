package com.hardik.javase;

import java.lang.reflect.Method;

/**
 * Demo1 Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Demo1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException {

		Class<Object> objClass = (Class<Object>) Class.forName("java.lang.Object");
		System.out.println("Object Class: " + objClass);

		// Methods
		Method[] objectClsMethods = objClass.getDeclaredMethods();
		for (Method method : objectClsMethods) {
			System.out.println(method.toString());
		}
	}
}
