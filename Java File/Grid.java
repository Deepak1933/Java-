package Array;


//Write a Java program to print the following grid
/*
  - - - - - - - - - -                                                                                           
  - - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -  
 */
public class Grid
{
	public static void main(String[]args)
	{
	
	int arr[][] = new int[10][10];
	for(int a = 0 ; a < arr.length; a++)
	{
		for(int b = 0 ; b < arr.length; b++)
		{
			
			System.out.print(arr[a][b]  +"\t");
		}
		System.out.println();
	}		
	}
}
