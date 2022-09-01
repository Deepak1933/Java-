package Array;
/*
 Write user defined methods for square matrix to calculate


Left diagonal sum
Right diagonal sum
*/

import java.util.Scanner;

public class DiagonalSum {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int m, n;
		System.out.print("Enter the size of row:");
		m = in.nextInt();
		System.out.print("Enter the size of column:");
		n = in.nextInt();
		
		
		// read the matrix 
		int matrix[][] = new int[m][n];
		System.out.println("Enter the elements of the array: ");  
		for(int i = 0 ;i < m; i++)
		{
			for(int j = 0 ;j < n; j++)
			{
				matrix[i][j] = in.nextInt();
			}
		}
		
		// display the matrix 
		for(int i = 0 ;i < m; i++)
		{
			for(int j = 0 ;j < n; j++)
			{
	           System.out.println(matrix[i][j] + " " );
			}
			System.out.println();
		}
		printDiagonalSums(matrix,m );
	}
		
		
	
		// leftDiagonal sum
		static void printDiagonalSums(int [][]mat, int n)
   {
                 int leftSum = 0, rightSum = 0;
                 for (int i = 0; i < n; i++)
                   {
                     for (int j = 0; j < n; j++)
                        {

                              // Condition for principal
                              // diagonal
                                         if (i == j)
                                         leftSum += mat[i][j];

                              // Condition for secondary
                              // diagonal
                                        if ((i + j) == (n - 1))
                                           rightSum += mat[i][j];
                            }
                       }

               System.out.println("Principal Diagonal:"  + leftSum);
            
               System.out.println("Secondary Diagonal:"  + rightSum);
       }
	}
		
			


