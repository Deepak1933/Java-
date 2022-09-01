package Array;
//The variable list1 and list2 are reference arrays that each have 5 elements. Write code that copies the values in list1 to list2. Values in list1 are input by user.


import java.util.Scanner;

public class ArrayQuestion4 
{
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args)
	 {  
	        //declaring a source array  
		   int list1[] = new int[5];
		   int list2[] = new int[5];
		  
		   System.out.print("enter the  5 number ");
		   for(int i = 0; i < 5; i++)
			{
				
				 list1[i] = s.nextInt();
			}
		   System.out.println();
		   
		   for(int i = 0; i < 5; i++)
			{
				
				 list2[i] = list1[i];
			}   
		   
	        
		// Display elements of list2.
		      System.out.println("Elements of list2 are: ");
		      for (int i = 0; i < 5; i++)
		      {
		          System.out.println(list2[i]);
		      }
		   }
		}
	


