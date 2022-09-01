package String;
/*
 * Write a Java program to compare a given string to the specified character sequence. 

Sample Output:

Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false
 */
public class Exercise9 {
	public static void main(String[] args)
	{
		String a = "example.com";
		String b = "Example.com";
		System.out.println("The Orginal string a :" +a);
		System.out.println("The Orginal string b :" +b);
		
		 System.out.println("Comparing example.com and example.com:" +" " +a.contains(a)); 
		 System.out.println("Comparing Example.com and example.com:" +" "+a.contains(b)); 	
	}
}
