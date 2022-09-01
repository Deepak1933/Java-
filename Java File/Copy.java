package Array;


	import java.util.Scanner;

	public class Copy
	{
		static Scanner console = new Scanner(System.in);
	   public static void main(String[] args)
	   {
	      final int SIZE = 5;

	      int[] list1 = new int[SIZE];
	      int[] list2 = new int[SIZE];

	      
	      System.out.println("Enter " + SIZE + " numbers.");

	      // Get value in list1
	      for (int i = 0; i < SIZE; i++)
	      {
	          list1[i] = console.nextInt();
	      }

	      // Copy elements in list2.
	      for (int i = 0; i < SIZE; i++)
	      {
	          list2[i] = list1[i];
	      }
	      
	      // Display elements of list2.
	      System.out.println("Elements of list2 are: ");
	      for (int i = 0; i < SIZE; i++)
	      {
	          System.out.println(list2[i]);
	      }
	   }
	}

