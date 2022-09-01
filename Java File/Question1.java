package Condition.java;
import java.util.Scanner;

public class Question1 {
//	1. Write a Java program to get a number from the user and print whether it is positive or negative. Go to the editor

//	Test Data
	//Input number: 35
  static	Scanner console = new Scanner(System.in);
	public static void main( String[] args)
	{
		
		System.out.print("Enter the number:");
		int num = console.nextInt();
		if(num>0)
		{
			System.out.println("Postive Number");
		
		}
		else if(num<0)
		{
			System.out.println("Negative Number");	
		}
	}
}
