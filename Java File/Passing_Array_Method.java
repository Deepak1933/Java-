package Array;

public class Passing_Array_Method 
{
	public static int min(int arr[])
	{
		int min = arr[0];
		for(int i = 1 ;i < arr.length; i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
				
			}
		}
			System.out.print(min);
			return min;
		
	}
		public static void main(String[] args)
		{
			int a[] = { 33 ,3,4,5 };
			min(a);
		}
	}


