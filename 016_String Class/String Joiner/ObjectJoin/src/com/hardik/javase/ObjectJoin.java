package com.hardik.javase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.hardik.javase.model.Game;

/**
 * Sum of provided numbers
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ObjectJoin {

	public static void main(String[] args) {

		List<Game> games = Arrays.asList(new Game("AAA", 5), new Game("BBB", 9));

		String result = games.stream().map(x -> x.getName()).collect(Collectors.joining(", ", "{", "}"));

		System.out.println(result);
	}
}
