package Array;

//Program to find the frequency of each element in the array

//   In this program, we have an array of elements to count the occurrence of its each element. 
//   One of the approaches to resolve this problem is to maintain one array to store the counts of each element of the array.
//   Loop through the array and count the occurrence of each element as frequency and store it in another array fr[].

public class FrequencyArray {
	
	public static void main(String[] args)
	{
	int arr[] = new int[] { 1,2,3,4,1,2,5,8,6,1,4,7};
	int fr[] = new int[arr.length];
	int visited = -1;
	for(int i = 0; i< arr.length;i++)
	{
		int count = 1;
		for ( int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				fr[j] = visited;	
			}
			 if(fr[i]!= visited)
			 {
				 fr[i] = count;
				 
			 }
		}
	}
			 System.out.println("-----------------------");
			 System.out.println("Element|Frequency");
			 System.out.println("-----------------------");
			 
			 for(int i = 0; i < fr.length; i++)
			 {  
		            if(fr[i] != visited)  
		            	
		     System.out.println("    " + arr[i] + "    |    " + fr[i]);  
		     }  
		       
             System.out.println("----------------------------------------");  
             
		    }
	} 
			 
			 



