package Array;

import java.util.Scanner;  //Needed for Scanner class

/**
 * This program shows values being read into an array's
 * elements and then displayed its sum
 */
public class ArrayDemo2
{
	 static Scanner console = new Scanner(System.in);
   public static void main(String[] args)
   {
      int size;

      // Create a Scanner object for keyboard input.
    

      System.out.print("Enter the size of the array: ");
      size = console.nextInt();

      // Create an array to hold integers.
      int[] list = new int[size];

      System.out.println("Enter " + list.length + " integers.");
       int sum = 0;
      // Get integers.
      for (int i = 0; i < list.length; i++)
      {
         list[i] = console.nextInt();
         sum += list[i];
      }

      

      // Display the sum of array elements.
      System.out.println("The sum of array :" + sum);
   }
}