package oops;

public class OverridingExample {
	public static void main(String[] args) {
		 //differnce between overriding and method hiding
		//Example of Overriding Method with no static keyword
//		P p = new P();
//	    p.m1(10);  // Parent Child
//		
//		C c = new C();
//		c.m1(10); // Child Class 
//		
//		P p1 = new C();
//		p1.m1(10); // child Class
//		
		P p = new P();
		System.out.println(p.s);
		
		C c = new C();
		System.out.println(c.s);
		
		P p1 = new C();
		System.out.println(p1.s);
	}
//		//Example of Method hiding with static keyword
//		
//		P p = new P();
//		p.m1();  // Parent Child
//		
//		C c = new C();
//		c.m1(); // Child Class 
//		
//		P p1 = new C();
//		p1.m1(); // Parend Class
//		
//	} 
}

// Example of Overriding Method 
//class P{
//	public  void m1(int... i)
//	{
//		System.out.println("Parent Class");
//	}
//
//}
//class C extends P
//{
//	public  void m1(int... i)
//	{
//		System.out.println("Child Class");
//	}
//}
class P{
	 String s = "Parent";

}
class C extends P
{
	String s = "Child";	
	
}

// Example of Method Hiding 

//class P{
//	public  static void m1()
//	{
//		System.out.println("Parent Class");
//	}
//
//}
//class C extends P
//{
//	public static void m1()
//	{
//		System.out.println("Child Class");
//	}
//}

