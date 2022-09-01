package Array;

import java.util.Arrays;

// Write a Java program to remove a specific element from an array.

public class Deletion {
	public static int delete(int arr[]) 
	{
		int removeIndex =4;
		for(int i= removeIndex ; i< arr.length-1;i++)
		{
			arr[i] = arr[i+1];
		}
		System.out.println("after the value 6 and index at 4 remove, array should look like :" +Arrays.toString(arr) );
		return arr[removeIndex];
	}
	public static void main(String[] args)
	{
		int arr1[] = { 10,25,35,45,6,49,65,48};
	    System.out.println("orginal array:" + Arrays.toString(arr1));
	    System.out.println("-------------------" );
        Deletion.delete(arr1);
	    
	}

}
