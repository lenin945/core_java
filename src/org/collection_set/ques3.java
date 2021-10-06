package org.collection_set;
import java.util.*;

public class ques3 {
	public static void main(String[] args) {
		//question 3.1.
				Set<Integer> s1=new HashSet<>();
				s1.add(105);
				s1.add(205);
				s1.add(305);
				s1.add(405);
				s1.add(505);
				s1.add(605);
				s1.add(705);
				s1.add(805);
				System.out.println("3.1 Input: Set= "+s1);
				for (Integer a1 : s1) {
					System.out.println(a1);
				}
				
				//question 3.2
				Set<Integer> s2=new TreeSet<>();
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
				System.out.println("3.2 Input: Set: "+s2);
				for (Integer a2 : s2) {
					System.out.println(a2);
				}
				//question 3.3
				Set<Integer> s3=new HashSet<>();
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
				System.out.println("3.2 Input: Set: "+s3);
				for (Integer a3 : s3) {
					System.out.println(a3);
				}
	}

}
