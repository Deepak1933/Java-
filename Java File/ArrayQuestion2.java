package Array;
/*
  a) Write a statement that declares a string array initialized with the following strings:
"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
b) Write a loop that displays the contents of each element in the array that you declared.

 */
public class ArrayQuestion2 {
	public static void main(String[] args)
	{
		//a) Write a statement that declares a string array initialized with the following strings:
			//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
		
		String arr[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		//b) Write a loop that displays the contents of each element in the array that you declared.
		
		for(String day: arr)
		{
		System.out.println(day);
	    }
	}
}


