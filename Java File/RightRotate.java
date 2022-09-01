package Array;

import java.util.Arrays;

public class RightRotate {
	public static void main(String[] args)
	{
		//Initialization of array a
		int a[]= new int[] {1,2,3,4,5,6,7,8,9,};
		// declare n
		int n = 7;
		int temp;
		// print the array a
		System.out.println("input array before right rotation:");
		System.out.println(Arrays.toString(a));
		
		// main body 
		for(int i = 0 ; i <= n; i++)
		{
	          temp = a[a.length -1];
	             for(int j= a.length-1 ; j >0 ; j--)
	             {
	            	a[j] = a[j-1];
	            	
	             }
	       a[0] = temp;
		}
		System.out.println("input array after right rotation:" + n + "Postion");
		System.out.println(Arrays.toString(a));
		
	}

}
