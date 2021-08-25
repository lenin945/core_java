package org.collection_set;
import java.util.*;

public class ques2 {
	public static void main(String[] args) {
		//question 2.1
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		System.out.println("2.1 Input: List: "+l1);
		Set<Integer> s1=new TreeSet<>();
		s1.addAll(l1);
		System.out.println("Output: TreeSet: "+s1);
		//question 2.2
		List<Integer> l2=new ArrayList<>();
		l2.add(105);
		l2.add(205);
		l2.add(305);
		l2.add(405);
		l2.add(505);
		l2.add(605);
		l2.add(705);
		l2.add(805);
		l2.add(505);
		l2.add(605);
		System.out.println("2.2 Input: List: "+l2);
		Set<Integer> s2=new HashSet<>();
		s2.addAll(l2);
		System.out.println("Output: HashSet: "+s2);
		//question 2.3
		List<Integer> l3=new ArrayList<>();
		l3.add(100);
		l3.add(200);
		l3.add(300);
		l3.add(400);
		l3.add(500);
		l3.add(600);
		l3.add(700);
		l3.add(100);
		l3.add(300);
		l3.add(500);
		System.out.println("2.1 Input: List: "+l3);
		Set<Integer> s3=new TreeSet<>();
		s3.addAll(l3);
		System.out.println("Output: Set: "+s3);
		
	}

}
