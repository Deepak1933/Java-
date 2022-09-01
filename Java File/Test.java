package oops;
//import Method.java.ClassQuestion;
//  public class Test {
//	public static void main(String[] args) 
//	{
//		
//	{
//		System.out.println("a and b");
//	}
// }
// 
//	class A
//	{
//		public static void main(String[] args) 
//		{
//			System.out.println("a and c");
//	   }
//	}
//	class C{
//		public static void main(String[] args) 
//		{
//			System.out.println("a and e");
//	   }
//	}
//	class D{
//		public static void main(String[] args) 
//		{
//			System.out.println("a and d");
//	   }
//	}
//	class E{
//		
////	}
//	ClassQuestion c= new ClassQuestion();
//	
//	System.out.println("a and b");
//	c.equals(c);
//  }


abstract class Test{
	
   public abstract void m1();
   public abstract void m2();
   public static void main(String[] args)
   {
   SubTest s = new SubTest();
   System.out.println("Abstract Method is going on for method 1");
   s.m1();
   System.out.println("*****************************");
   System.out.println("Abstract Method is going on for method 2");
   s.m2();
   System.out.println("*****************************");
   }
   
  }
 class SubTest extends Test{
	public void m1() {
		System.out.println("Abstract Method is going on for method 1");
		
	}
	public void m2() 
	{
		
		System.out.println("Abstract Method is going on for method 2");
	}
	
 }
 

