package Array;

import java.util.Scanner;

//Write a Java program to find the largest and smallest element of an array.

public class ArrayQuestion6 {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{  
		int size ;
		
		System.out.print("Enter the size of the array: ");
	      size = console.nextInt();

	      int[] list = new int[size];

	      System.out.println("Enter " + list.length + " integers.");
	      for (int i = 0; i < list.length; i++)
	      {
	         list[i] = console.nextInt();
	      }

	      int max = list[0];
	      int min = list[0];
	      
	      for(int i = 0; i < list.length ; i++)
	      {
	    	  if(list[i] > max)
	    	  {
	    		  max = list[i];
	    	  }
	    	  if(list[i] < min)
	    	  {
	    		  min = list[i];
	    	  }
	    	  
	      }
	      System.out.print("Largest element in the array:" + max + "\n" );
	      System.out.print("Smallest element in the array:" + min + "\n");
		
	}

}
