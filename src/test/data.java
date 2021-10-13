package test;

public class data {
public static void main(String[] args) {
	
	StringBuffer s = new StringBuffer("Lenin");
	
	StringBuffer s1= s.append(8);
	
	System.out.println(s1);
	
//	int l = s.capacity();
//	System.out.println(l);
//	
//	StringBuilder s2 = new StringBuilder("Satz");
	
	int a = 0, b = 1; System.out.println(a); System.out.println(b);
	for (int i = 2; i <= 10; i++) { int c = a + b; System.out.println(c);
	a = b; b = c;
	}
	
		
}
}
