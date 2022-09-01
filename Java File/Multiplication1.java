package Array;

import java.util.Scanner;

//Write a user-defined method in Java to display the multiplication of row element of two-dimensional array A[4][6] 
//containing integer.

public class Multiplication1 {
	static Scanner in = new Scanner(System.in);
	// main method 
	static ArrayQuestion9 operate = new ArrayQuestion9();
	public static void main(String[] args )
		{   
		
		int n,m;
		System.out.print("Enter the size of array");
		n =  in.nextInt();
		System.out.print("Enter the size of array");
		m =  in.nextInt();
		
		int[][] list = new int[n][m];
		Multiplication1.readArray(list);
		Multiplication1.displayArray(list);
		Multiplication1.rowMul(list);
		}
	static void readArray(int[][] array) 
    {
        for (int i = 0; i < array.length; i++)
        {
        	for(int j = 0; j < array.length; j++)
		    {
		     	array[i][j] = in.nextInt();				      
            }
        }
    }
	
static void displayArray(int[][] array)
{
  for(int row = 0 ; row < array.length ; row ++)
   {
      for(int col = 0; col < array.length; col++)
	    {
	     	System.out.print(array[row][col] + "\t");
	    }
     System.out.println("");	   
    }
}

	static void rowMul(int[][] array) {
		  

		//To display row-wise sum of matrix of size m x n

	      for(int row = 0; row < array.length;row++)
	        {
	             
	           for(int col = 0;col<array.length;col++)
	    	   {
	    		  array[row][col] *= array[row][col];	  
	    	   }  
	        }
	     
	  //    System.out.println(Arrays.deepToString(array));
		
	      for(int row = 0; row < array.length;row++)
	        {
	             
	           for(int col = 0;col<array.length;col++)
	    	   {
	    		 System.out.print(array[row][col]);	  
	    	   } 
	           System.out.println("");
	        }
	   
	 }
}
