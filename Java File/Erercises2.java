package String;
// Write a Java program to get the character (Unicode code point) at the given index within the String
/*
 Sample Output:

Original String : w3resource.com                                                                              
Character(unicode point) = 51                                                                                 
Character(unicode point) = 101 
 */
public class Erercises2 {
	

		   public static void main(String[] args) {
		  
		    String str = "w3resource.com";
		    System.out.println("Original String : " + str);
		        
		    // codepoint at index 1
		    int val1 = str.codePointAt(1);
		    
		    // codepoint at index 9
		    int val2 = str.codePointAt(10);
		        
		    // prints character at index1 in string
		    System.out.println("Character(unicode point) = " + val1);
		    // prints character at index9 in string
		    System.out.println("Character(unicode point) = " + val2);
		  }

}
