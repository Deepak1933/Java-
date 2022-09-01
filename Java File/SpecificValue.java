package Array;
//5. Write a Java program to test if an array contains a specific value
public class SpecificValue 
{
	public static boolean specific(int arr[],int item)
	{
		for(int n:arr)
		{
			if(item== n)
			{
				
			return true;
			}
			
		}
		return false;
	}
	public static void main(String[] args)
	{
		int array[]= new int[]{1020,2546,7546,2301,8542,5425,4586,45215,5415,8965,45215,6524,4859,4859};
		System.out.println("The array has be to found is 4586:" +"-------------");
		System.out.println(specific(array,4586));
		System.out.println();
		System.out.println("The array has be to found is 45215:" +"------------");
		System.out.println(specific(array,45215));
		System.out.println();
		System.out.println("The array has be to found is 10000:"+"-------------");
		System.out.println(specific(array,10000));
		
	}

}
