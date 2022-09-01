
package Method.java;
import java.util.Scanner;

/*
 * Write a method named isEven that accepts an int argument. 
 * The method should return true if the argument is even, or false otherwise. Also write a program to test your method.
 */
public class Question2 {
	static Scanner f = new Scanner( System.in);
	public static void main(String[] args)
	{   
		
		System.out.print("Enter The Number:");
	     int num = f.nextInt();
	
      if(isEven(num))
      {
    	  System.out.println("The number is even");    	  
      }
      else 
      {
    	  System.out.println("The number is odd");
      }
}

public static boolean isEven(int number)
{
		
	if( number % 2 == 0)
	{
		return true;
	}
	else
	{
		return false; 
	}


   }
}
