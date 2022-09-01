package Array;
import java.util.Scanner;

// 2. Write a Java program to sum values of an array.
public class Question1 {
	
	public static void main(String[] args) 
	{  
		int size;
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter the size of array");
			 size = in.nextInt();
			int my_array[] = new int[size] ;
			
			System.out.println(my_array.length);
			int sum = 0;

			for (int i = 0; i <= my_array.length; i++)
			{   
				my_array[i] = in.nextInt();
				sum += my_array[i];
			
			}
			System.out.println("The sum is " + sum);
		}
		}
		
	}
	


