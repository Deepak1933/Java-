package Array;
/*
 Question 1

Write Java statements that do the following:
a) Declare an array numArray of 15 elements of type int.
b) Output the value of the tenth element of the array alpha.
c) Set the value of the fifth element of the array alpha to 35.
d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
 */
public class ArrayQuestion1 {
	public static void main( String[] args)
	{ 
		//Output the value of the tenth element of the array alpha.
	    int alpha[]= new int[10]; 
		alpha[9] = 10;
		System.out.println(alpha[9]);
		
		//Set the value of the fifth element of the array alpha to 35.
		alpha[4]=35;
		//d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
		alpha[8] = alpha[6] + alpha[12];	
	}

}
