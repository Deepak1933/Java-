package Method.java;
import java.util.Scanner ;

/*
 * 5. Write a Java method to count all words in a string. Go to the editor
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:

Number of words in the string: 9
 */
public class Question6
{
	static Scanner t = new Scanner(System.in);
public static void main(String[] args)
{
	
	System.out.print("Enter the String ");
	String str = t.nextLine();
	System.out.println("Number of words in the string: " + count_Words(str) + "\n");
	
}
	
	public static int count_Words(String str) 
	{
	
        int count = 0;
        if (!(" "== (str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
          {
              for (int i = 0; i < str.length(); i++)
                     {
                        if (str.charAt(i) == ' ')
                             {
                                  count++;
                              }
                       }
                 count = count + 1; 
             }
return count; // returns 0 if string starts or ends with space " ".
}
}