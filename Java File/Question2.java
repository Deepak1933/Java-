package Array;

import java.util.Scanner;

public class Question2 {
    static Scanner console = new Scanner(System.in);
	public static void main(String[]args)
	{
	 int size;

         // Create a Scanner object for keyboard input.


    System.out.print("Enter the size of the array: ");
    size = console.nextInt();

    // Create an array to hold integers.
    int[] list = new int[size];

    System.out.println("Enter " + list.length + " integers.");
    int sum = 0;
     double average = 0;
    // Get integers.
    for (int i = 0; i < list.length; i++)
     {
       list[i] = console.nextInt();
       sum += list[i];
       average = sum / list[i];
     }
    System.out.println("The sum of the array element:" +sum);
    System.out.println("The average of the array element:" +average);
	}
}
