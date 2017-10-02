package com.hardik.javase.model;

/**
 * Game
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Game {

	public String name;
	public int ranking;

	public Game(String name, int ranking) {
		this.name = name;
		this.ranking = ranking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

}
