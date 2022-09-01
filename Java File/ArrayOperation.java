package Array;


	import java.util.Scanner;

	/**
	 * This class contains common methods to
	 * manipulate array.
	 */
	public class ArrayOperation
	{
	   /**
	    * The fillArray method accepts an array and number of
	    * elements as an argument. Each of its Element is filled by user.
	    */
		 static Scanner console = new Scanner(System.in);
	   private static void fillArray(int[] list, int n)
	   {
	      // Create a Scanner object for keyboard input.
	     

	      for (int i = 0; i < n; i++)
	      {
	         list[i] = console.nextInt();
	      }
	   }

	   /**
	    * The printArray method accepts an array and number of
	    * elements as argument and displays its contents.
	    */
	   public static void printArray(int[] list, int n)
	   {
	      for (int i = 0; i < n; i++)
	      {
	         System.out.print(list[i] + " ");
	      }
	   }

	   /**
	    * The sumArray method adds the sum of elements and return it.
	    */
	   public static int sumArray(int[] list, int n)
	   {
	      int sum = 0;

	      for (int i = 0; i < n; i++)
	      {
	         sum += list[i];
	      }

	      return sum;
	   }

	   /**
	    * The largestElement method returns the index of largest element.
	    */
	   public static int largestElement(int[] list, int n)
	   {
	      int max = 0;    // store index number of first element

	      for (int i = 1; i < n; i++)
	      {
	         if (list[max] > list[i])
	         {
	            max = i;
	         }
	      }

	      return max;
	   }
	

	   public static void main(String[] args)
	   {
	      final int SIZE = 4;    // Size of the array

	      // Create an array.
	      int[] array = new int[SIZE];

	      // Read into array.
	      System.out.println("Enter numbers ");
	      ArrayOperation.fillArray(array, SIZE);

	      // Print the array.
	      System.out.println("Numbers are :");
	      ArrayOperation.printArray(array, SIZE);
	      System.out.println();

	      // Display the sum of the elements of array.
	      System.out.println("The sum of the elements is: "
	                         + ArrayOperation.sumArray(array, SIZE));

	      // Display the index of largest element of array.
	      System.out.println("Largest element is at index "
	                         + ArrayOperation.largestElement(array,
	                            SIZE));
	   }
	}          
