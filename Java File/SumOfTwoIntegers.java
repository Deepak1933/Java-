package Method.java;
import java.util.Scanner;
/*
 Write a program with a method named getTotal that accepts two integers as an argument and return its sum. Call this method from main( ) and print the results.
 */
public class SumOfTwoIntegers {
	static Scanner d = new Scanner(System.in);
	public static void main(String[] args) 
	{
	
		
		System.out.print("Enter the first number");
		int a = d.nextInt();
		
		System.out.print("Enter the second number");
		int b = d.nextInt();
		
		
		int sum = getTotal(a,b);
		System.out.println("Sum of two Integer is " + sum);
	}
public static int getTotal(int a,int b)
 {

	int sum = a + b;
	return sum ;
	
 }
}
