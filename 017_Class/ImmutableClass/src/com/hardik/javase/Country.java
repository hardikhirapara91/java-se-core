package com.hardik.javase;

import java.util.List;

/**
 * Immutable Class Country
 * 
 * @author HARDIK HIRAPARA
 *
 */
public final class Country {

	private final String name;
	private final List<String> states;

	public Country(String name, List<String> states) {
		this.name = name;
		this.states = states;
	}

	public String getName() {
		return name;
	}

	public List<String> getStates() {
		return states;
	}
}
