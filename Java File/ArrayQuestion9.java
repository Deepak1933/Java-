package Array;
import java.util.Scanner;

/*
 * Write a menu driven program to do following operation on two dimensional array A of size m x n. 
 * You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:

To input elements into matrix of size m x n
To display elements of matrix of size m x n
Sum of all elements of matrix of size m x n
To display row-wise sum of matrix of size m x n
To display column-wise sum of matrix of size m x n
To create transpose of matrix of size n x m
 */


public class ArrayQuestion9 
 {
	static Scanner in = new Scanner(System.in);
	// main method 
	static ArrayQuestion9 operate = new ArrayQuestion9();
	public static void main(String[] args )
		{   
		
		int size1,size2;
		System.out.print("Enter the size of array");
		size1 =  in.nextInt();
		System.out.print("Enter the size of array");
		size2 =  in.nextInt();
		
		int[][] list = new int[size1][size2];
			//taking the size of m and n from the user
		  
		  
		  int option ;
			
			do {
				System.out.println("Menu ");
		        System.out.println("1. Read Array");
		        System.out.println("2. Display Array");
		        System.out.println("3. row wise sum");
		        System.out.println("4. col wise sum");
		        System.out.println("5. transpose of matrix");
		        System.out.println("6. matrix element sum:");
		        System.out.println("7. Exit:");
		        System.out.print("Select an Option : ");
		        option = in.nextInt();
		        switch (option) 
		        {
		            case 1:
		                ArrayQuestion9.readArray(list);
		                break;
		            case 2:
		            	ArrayQuestion9.displayArray(list);
		                break;
		            case 3:
		            	ArrayQuestion9.rowSum(list);
		            case 4:
		            	ArrayQuestion9.colSum(list);
		                break;
		            case 5:
		            	ArrayQuestion9.transpose(list);
		            	break;
		            case 6:
		            	ArrayQuestion9.elementSum(list);
		            	break;
		        }
		    } while (option != 7);
		  
		}
	 // display element of matrix of size of m*n
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
		     System.out.println();	   
	        }
		  System.out.println();
		}
 
	    
static void transpose(int[][] array)
	{
	 //To create transpose of matrix of size n x m
	
     int transpose[][]= new int[4][4];
    	 
    for(int row = 0 ; row < array.length ; row ++)
	   {
	      for(int col = 0; col < array.length; col++)
		    {
		     	transpose[row][col] = array[col][row];
		    }
	        	   
       }
    System.out.println("Printing Matrix without transpose:");
    System.out.println();	
    
    for(int i=0;i<array.length;i++)
    {    
    	for(int j=0;j<array.length;j++)
    	{    
         	System.out.print(array[i][j]+" ");    
    	}    
    System.out.println();//new line    
   }    
    System.out.println();	
    System.out.println("Printing Matrix After Transpose:");  
    System.out.println();	
    	
    for(int i=0;i<array.length;i++)
    {    
    	for(int j=0;j<array.length;j++)
    	{    
    	  System.out.print(transpose[i][j]+" ");    
    	}    
    	System.out.println();//new line    
    }  
    System.out.println();	
	}
static void rowSum(int[][] array) {
  
	
	//To display row-wise sum of matrix of size m x n
	
		 
      for(int row = 0; row < array.length;row++)
        {
           int rowsum =0;  
           for(int col = 0;col<array.length;col++)
    	   {
    		  rowsum += array[row][col];	  
    	   }
    	    System.out.println("sum of " +(row+1) + "row" + " ----- " +rowsum);
    	    System.out.println();	
        }
     
      System.out.println();	
   
 }
static void colSum(int[][] array) {
	

       //To display column-wise sum of matrix of size m x n
        for(int row = 0; row < array.length; row++)                    //  method for column wise sum
         {
           int colsum = 0;
    	   for(int col = 0;col< array.length;col++)
    	     {
    		  colsum += array[col][row];
    	     }
    	  System.out.println("sum of " +(row+1) +"col"  + " ---- "+ colsum);
    	  System.out.println();	
        }
        System.out.println();	
}
     // Finding the sum
    
 static void elementSum(int array[][])
    	 {
    	  int sum = 0;
       for (int i = 0; i < array.length; ++i) 
        {
         for (int j = 0; j < array.length; ++j)
         {
           //Add the element
          sum += array[i][j];
          System.out.println("sum of all element :" +i +j + " :-----  " +sum);
         }
        System.out.println();	  
      }    
	}
  }
    
      
      
    
