package String;
//Write a Java program to create a new String object with the contents of a character array.
//Sample Output:

//   The book contains 234 pages.

public class Exercise11 {
	public static void main(String[] args )
	{
		char array[] = { '1','2','3','4','5','6','7','8','9'};
		String str = String.copyValueOf(array, 1, 8);
		
		System.out.println("The first book contains " + str +" pages.\n");
		
	}

}
