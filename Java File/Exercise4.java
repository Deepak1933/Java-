package String;
//Write a Java program to count a number of Unicode code points in the specified text range of a String.
/*
 Original String : w3rsource.com                                                                               
 Codepoint count = 9
 */
public class Exercise4 {
	public static void main(String[] args)
	{
	String str = "Deepaksharma134200@gmail.com";
	System.out.println("The orginal String :" +str);
	
	int count = str.codePointCount(2, 20);
	int count1 = str.codePointCount(5, 18);
	
	System.out.println("Character (unicode point):" +count);
	System.out.println("Character (unicode point):" +count1);

}
}
