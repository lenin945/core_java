package org.collection_set;
import java.util.*;
public class ques4 {
public static void main(String[] args) {
	//question 4.1
	Set<Integer> s1=new HashSet<>();
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(90);
	s1.add(10);
	s1.add(10);
	s1.add(40);
	s1.add(50);
	System.out.println("Input: List1: "+s1);
	Set<Integer> s2=new HashSet<>();
	s2.add(30);
	s2.add(40);
	s2.add(50);
	s2.add(60);
	s2.add(80);
	System.out.println("Input: List2: "+s2);
	s2.retainAll(s1);
	System.out.println(s2);
	//question 4.2
	Set<Integer> s3=new LinkedHashSet<>();
	s3.add(10);
	s3.add(20);
	s3.add(60);
	s3.add(50);
	s3.add(40);
	s3.add(70);
	s3.add(80);
	s3.add(90);
	System.out.println("\nInput: List1: "+s1);
	System.out.println("Input: List2: "+s3);
	s3.retainAll(s1);
	System.out.println(s3);
	//question 4.3
	Set<Integer> s4=new TreeSet<>();
	s4.add(10);
	s4.add(20);
	s4.add(60);
	s4.add(50);
	s4.add(40);
	s4.add(70);
	s4.add(80);
	s4.add(90);
	System.out.println("\nInput: List1: "+s4);
	Set<Integer> s5=new TreeSet<>();
	s5.add(100);
	s5.add(200);
	s5.add(600);
	s5.add(500);
	s5.add(400);
	s5.add(700);
	s5.add(800);
	System.out.println("Input: List2: "+s5);
	s4.retainAll(s5);
	System.out.println(s4);
	
}
}
