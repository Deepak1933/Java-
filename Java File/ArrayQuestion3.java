package Array;
//Write a program that creates an array of 10 elements size. Your program should prompt the user to input numbers in array and then display the sum of all array elements.

import java.util.Scanner;
public class ArrayQuestion3 {
	 static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
	   
	    
		int arr[] = new int[10];
		int sum = 0;
		//for loop declaration
		for(int i = 0; i < 10; i++)
		{
			System.out.print("enter the number " + i);
			 arr[i] = in.nextInt();
			 // sum of all element
             sum += arr[i];
		}
		System.out.println("sum of the array elements:" + sum);
	}

}
