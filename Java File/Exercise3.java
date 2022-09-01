package String;
//Write a Java program to get the character (Unicode code point) before the specified index within the String.
/*
 Original String : w3resource.com                                                                              
Character(unicode point) = 119                                                                                
Character(unicode point) = 99
 */
public class Exercise3 {
	public static void main(String[] args)
	{
	String str = "Deepaksharma134200@gmail.com";
	System.out.println("The orginal String :" +str);
	
	int value1 = str.codePointBefore(2);
	int value2 = str.codePointBefore(15);
	
	System.out.println("Character (unicode point):" +value1);
	System.out.println("Character (unicode point):" +value2);
	
	
	}

}
