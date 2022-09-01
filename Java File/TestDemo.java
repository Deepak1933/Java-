package Array;
import java.util.Scanner;  //Needed for Scanner class

/**
 * This program shows values being read into an array's
 * elements and then displayed.
 */
public class TestDemo
{
	static Scanner console = new Scanner(System.in);
   public static void main(String[] args)
   {
      final int SIZE = 5;    // size of array

      // Create an array to hold employee salary.
      double[] salaries = new double[SIZE];

      // Create a Scanner object for keyboard input.
      

      System.out.println("Enter the salaries of " + SIZE
                         + " employees.");

      // Get employees' salary.
      for (int i = 0; i < SIZE; i++)
      {
         salaries[i] = console.nextDouble();
      }

      // Display the values stored in the array.
      System.out.println("The salaries are:");

      for (int i = 0; i < SIZE; i++)
      {
         System.out.println(salaries[i]);
      }
   }
}

