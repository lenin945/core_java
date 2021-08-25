package org.singleton;

public class Client {
public static void main(String[] args) {
	
	Employee r = Employee.createobj();
	System.out.println(System.identityHashCode(r));
}
}
