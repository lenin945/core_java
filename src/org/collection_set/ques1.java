package org.collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ques1 {
public static void main(String[] args) {
	Set<Integer> s1=new HashSet<>();
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(40);
	s1.add(50);
	s1.add(60);
	s1.add(70);
	s1.add(80);
	s1.add(90);
	s1.add(10);
	s1.add(20);
	System.out.println("1.1 HashSet: "+s1);
	Set<Integer> s2=new LinkedHashSet<>();
	s2.add(10);
	s2.add(20);
	s2.add(30);
	s2.add(40);
	s2.add(50);
	s2.add(60);
	s2.add(70);
	s2.add(80);
	s2.add(90);
	s2.add(10);
	s2.add(20);
	System.out.println("1.2 Linked HashSet: "+s2);
	Set<Integer> s3=new TreeSet<>();
	s3.add(10);
	s3.add(20);
	s3.add(30);
	s3.add(40);
	s3.add(50);
	s3.add(60);
	s3.add(70);
	s3.add(80);
	s3.add(90);
	s3.add(10);
	s3.add(20);
	System.out.println("1.3 TreeSet: "+s3);
}
}
