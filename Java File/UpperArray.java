package Array;
/*
 *
Write a user defined method named Upper-half() which takes a two dimensional array A,
 with size N rows and N columns as argument and prints the upper half of the array.
e.g.,
 2 3 1 5 0                                  2 3 1 5 0
 7 1 5 3 1                                    1 5 3 1
 2 5 7 8 1     The output will be               7 8 1
 0 1 5 0 1                                        0 1
 3 4 9 1 5                                          5
  */

public class UpperArray {
	public static void main(String[] args) {    
        int rows, cols;    
            
        //Initialize matrix a    
        int a[][] = {       
        		     {2,3,1,5,0},
        		     {7,1,5,3,1},
        		     {2,5,7,8,1},
        		     {0,1,5,0,1},
        		     {3,4,9,1,5}
                       };    
              
          //Calculates number of rows and columns present in given matrix    
          rows = a.length;    
        cols = a[0].length;    
            
        if(rows != cols){    
            System.out.println("Matrix should be a square matrix");    
        }    
        else {    
            //Performs required operation to convert given matrix into upper triangular matrix    
            System.out.println("Upper triangular matrix: ");    
            for(int i = 0; i < rows; i++){    
                for(int j = 0; j < cols; j++)
                {    
                  if(i > j)    
                    System.out.print("  "); 
                    
                  else    
                    System.out.print(a[i][j] + " ");    
                }
                System.out.println();    
            }    
        }    
    }    

}
