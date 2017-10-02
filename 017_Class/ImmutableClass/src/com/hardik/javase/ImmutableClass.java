package com.hardik.javase;

import java.util.ArrayList;
import java.util.List;

/**
 * Immutable Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ImmutableClass {

	public static void main(String[] args) {

		List<String> states = new ArrayList<String>();
		states.add("Gujarat");
		states.add("Maharastra");

		Country country = new Country("India", states);

		System.out.println("Country: " + country.getName());
		System.out.println("States: " + country.getStates());

		states.add("Karnataka");
		System.out.println("States: " + country.getStates());
	}
}
