package Method.java;
import java.util.Scanner;

/*
 A nonnegative integer is called a palindrome if it reads forward and backward in the same way. 
 For example, the numbers 5, 121, 3443, and 123454321 are palindromes. Write a method that takes as input a nonnegative integer 
 and returns true if the number is a palindrome; otherwise, it returns false. Also write a program to test your method.
 */

public class Question5 {
	static Scanner console = new Scanner( System.in);
	public static void main(String[] args)
	{   int num ;
		
		
		System.out.print("Enter The number");
		num = console.nextInt();
		
		if(isPalindrome(num))
		{
			System.out.println("the number is palindrome");
			
		}
		else
		{
			System.out.println("the number is not a  palindrome");		
	     }
	}
             public static boolean isPalindrome(int number) 
     {    
	          int temp = number;
	          int remainder ;
	           int reversed = 0;
    
	               while(temp > 0)
	                      {
	                        	remainder = temp % 10;
	                             temp = temp / 10;	
		                         reversed = reversed * 10  + remainder ;
	                       }
	
                  return reversed == number ;
	
        }	
}
