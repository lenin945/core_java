package org.singleton;

public class Employee {
	static Employee e;
	
	private Employee() {
	}
	
	public static  Employee createobj() {
		if (e==null) {
		 e=new Employee();
	}
		return e;}

	public void empId() {
		System.out.println("12345");
	}
	public void empName() {
		System.out.println("name");
	}
	public static void main(String[] args) {
		Employee e=createobj();
		Employee d=createobj();
		e.empId();
		d.empName();
		System.out.println(System.identityHashCode(e));
		System.out.println(System.identityHashCode(d));
		
		
	}
}
