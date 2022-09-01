package String;
//Write a Java program to get the character at the given index within the String.

//Sample Output:

//Original String = Java Exercises!                                                                             
//The character at position 0 is J                                                                              
//The character at position 10 is i 
public class Exercise1 {
	public static void main(String[] args)
	{
		String orginal ="Java Exercises!";
		System.out.println("Orginal String =" +orginal);
		int index1 =orginal.charAt(0);
		int index2 =orginal.charAt(10);
		
		System.out.println("The Character at position 0 is  =" +" "+(char)index1);
		System.out.println("The character at position 10 is =" +" " +(char)index2);
		
	}

}
