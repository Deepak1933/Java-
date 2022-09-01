package String;
//Write a Java program to count the number of words ending in 'm' or 'n' (not case sensitive) in a given text.
/*
 * Sample Output:

The given string is: mam is in the room
The number of words ends eith m or n is: 3
 */
public class Erercise13 {
	
		public static int endWithmOrn(String stng) 
		{
		  int l = stng.length();
		  int ctr = 0;
		  stng = stng.toLowerCase();
		  for (int i = 0; i < l; i++) 
		  {
		    if (stng.charAt(i) == 'p' || stng.charAt(i) == 'n') 
			{
		      if (i < l-1 && !Character.isLetter(stng.charAt(i+1)))
		        ctr++;
		      else if (i == l-1)
		        ctr++;
		    }
		  }
		  return ctr;
		}
		public static void main(String[] args)
		{
			String s = "mam is in the room";
		
			System.out.println("The given string is:"+s);
			System.out.println("The number of words ends eith m or n is: "+Erercise13.endWithmOrn(s));

	}

}
