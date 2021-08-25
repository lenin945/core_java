package org.constructor;

public class B extends C{
	public B() {
		super(12);
	    System.out.println("Default const...");
	  }

	  public static void main(String[] args) {
	    B b = new B();
	  }

}
