package com.hardik.javase;

import java.math.BigDecimal;

/**
 * Example Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Example {

	public static void main(String[] args) {

		BigDecimal bd1 = new BigDecimal(123456789.123456789);
		BigDecimal bd2 = new BigDecimal(123L);

		System.out.println("BD1: " + bd1);
		System.out.println("BD2: " + bd2);

		bd1 = bd1.add(bd2);
		System.out.println("BD1: " + bd1);

		System.out.println("Subtract by 2 BD2: " + bd2.subtract(new BigDecimal(100)));
		System.out.println("Multiply by 2 BD2: " + bd2.multiply(new BigDecimal(2)));
		System.out.println("Devide by 2 BD2: " + bd2.divide(new BigDecimal(2)));

	}
}
