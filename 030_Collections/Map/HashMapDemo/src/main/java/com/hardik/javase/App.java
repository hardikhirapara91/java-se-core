package com.hardik.javase;

import java.util.HashMap;
import java.util.Map;

/**
 * HashSet Example
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

		Map<String, String> mMap = new HashMap();

		mMap.put("PostgreSQL", "Free Open Source Enterprise Database");
		mMap.put("DB2", "Enterprise Database , It's expensive");
		mMap.put("Oracle", "Enterprise Database , It's expensive");
		mMap.put("MySQL", "Free Open SourceDatabase");

		for (Map.Entry<String, String> entry : mMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		mMap.put("Oracle", "Enterprise Database , It's free now ! (hope)");

		System.out.println("One day Oracle.. : " + mMap.get("Oracle"));
	}
}
