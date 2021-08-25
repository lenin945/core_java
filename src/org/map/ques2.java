package org.map;
import java.util.*;
import java.util.Map.Entry;
public class ques2 {
public static void main(String[] args) {
			//HashMap
			/*
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
			//question 1.1
			System.out.println(m1);
			//question 2.1
			Set<Integer> k1 = m1.keySet();
			System.out.println("Keys: "+k1);
			//question 3.1
			Collection<String> v1= m1.values();
			System.out.println("Values: "+v1);
			//question 4.1
			System.out.println("\nIterate Map 1:");
			Set<Entry<Integer, String>> s1= m1.entrySet();
			for (Entry<Integer, String> i1 : s1) {
				System.out.println(i1);
			}
			System.out.println("\nIteration Map 2:");
			for (Entry<Integer, String> entry : s1) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
			
			//LinkedHashMap
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
			//question 1.2
			System.out.println("\n"+m2);
			//question 2.2
			Set<Integer> k2 = m2.keySet();
			System.out.println("Keys :"+k2);
			//question 3.2
			Collection<Integer> v2= m2.values();
			System.out.println("Values :"+v2);
			//question 4.2
			System.out.println("\nIterate Map 1:");
			Set<Entry<Integer, Integer>> s2=m2.entrySet();
			for (Entry<Integer, Integer> i2 : s2) {
				System.out.println(i2);
			}
			System.out.println("\nIterate Map 2:");
			for (Entry<Integer, Integer> entry : s2) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
			
			//TreeMap
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
			//question 1.3
			System.out.println("\n"+m3);
			//question 2.3
			Set<Character> k3 = m3.keySet();
			System.out.println("Keys :"+k3);
			//question 3.3
			Collection<Integer> v3= m3.values();
			System.out.println("Values :"+v3);
			//question 4.3
			System.out.println("\nIterate Map 1:");
			Set<Entry<Character, Integer>> s3=m3.entrySet();
			for (Entry<Character, Integer> i3 : s3) {
				System.out.println(i3);
			}
			System.out.println("\nIterate Map 2:");
			for (Entry<Character, Integer> entry : s3) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}*/
			
			//HashTable
			
			Map<String, String> m4=new Hashtable<>();
			m4.put("vel", "Selenium");
			m4.put("Ganesh", "framework");
			m4.put("Dinesh", "oracle");
			m4.put("vengat", "Corejava");
			m4.put("Subash", "jira");
			//question 1.4
			System.out.println("\n"+m4);
			//question 2.4
			Set<String> k4 = m4.keySet();
			System.out.println("Keys :"+k4);
			//question 3.4
			Collection<String> v4= m4.values();
			System.out.println("Values :"+v4);
			//question 4.4
			System.out.println("\nIterate Map 1:");
			Set<Entry<String, String>> s4=m4.entrySet();
			for (Entry<String, String> i4 : s4) {
				System.out.println(i4);
			}
			System.out.println("\nIterate Map 2:");
			for (Entry<String, String> entry : s4) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
			
		
		
}
}
