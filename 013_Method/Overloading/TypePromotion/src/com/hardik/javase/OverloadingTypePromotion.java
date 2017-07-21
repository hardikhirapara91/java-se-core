package com.hardik.javase;

/**
 * Overloading Type Promotion Rule
 * 
 * The byte can be promoted to short, int, long, float or double.
 * The short datatype can be promoted to int,long,float or double.
 * The char datatype can be promoted to int,long,float or double.
 * The int datatype can be promoted to long,float or double.
 * The long datatype can be promoted to float or double.
 * The float datatype can be promoted to double.
 * The double datatype can not be promoted with any datatype.
 * 
 * @author HARDIK
 *
 */
public class OverloadingTypePromotion {

	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		
		cal.sum(10, 10);	// Now second int literal will be promoted to long
		cal.sum(12, 20, 33);
	}
}
