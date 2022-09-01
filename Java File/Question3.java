package Method.java;
import java.util.Scanner;


/*
 * Write a value-returning method, isVowel that returns the value true if a given character is a vowel,
 *  and otherwise returns false. In main() method accept a string from user and count number of vowels in that string.
 */
public class Question3 
{
	static Scanner console = new Scanner(System.in);
	public static void main( String[] args)
	{
		
		System.out.print("Enter the sentence");
		String sentence ;
		sentence = console.next();
		int count = 0 ;
		
      for(int i = 0 ; i < sentence.length() ; i++ )
      {
    	  if(isVowel(sentence.charAt(i)))
    	  {
    	  count++ ;
    	  }		
      System.out.println("Number of vowels: " + count);    
	}
	}
	
	
	public static boolean isVowel(char letter) 
	
	{
	
		switch(letter) 
	
		{
		case 'a': 
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			return true;
			default: 
				return false;
				
		
		}
	}

}
