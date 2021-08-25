package org.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ques1 {
	public static void main(String[] args) {
		//question 1.1
		Map<Integer, String> m1=new HashMap<>();
		m1.put(10, "java");
		m1.put(20, "sql");
		m1.put(30, "oops");
		m1.put(40, "Sql");
		m1.put(50, "oracle");
		m1.put(60, "DB");
		m1.put(10, "selenium");
		m1.put(50, "pqsl");
		m1.put(40, "Handoop");
		System.out.println(m1);
		//question 1.2
		Map<Integer, Integer> m2=new LinkedHashMap<>();
		m2.put(10, 10);
		m2.put(20, 20);
		m2.put(30, 30);
		m2.put(40, 40);
		m2.put(50, 50);
		m2.put(60, 60);
		m2.put(10, 10);
		m2.put(50, 50);
		m2.put(40, 40);
		System.out.println("\n"+m2);
		//question 1.3
		Map<Character, Integer> m3=new TreeMap<>();
		m3.put('!', 10);
		m3.put('@', 20);
		m3.put('#', 30);
		m3.put('$', 40);
		m3.put('%', 50);
		m3.put('^', 60);
		m3.put('&', 10);
		m3.put('*', 50);
		m3.put('(', 40);
		System.out.println("\n"+m3);
		//question 1.4
		Map<String, String> m4=new Hashtable<>();
		m4.put("vel", "Selenium");
		m4.put("Ganesh", "framework");
		m4.put("Dinesh", "oracle");
		m4.put("vengat", "Corejava");
		m4.put("Subash", "jira");
		System.out.println("\n"+m4);
		
	
	}

}
