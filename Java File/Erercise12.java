package String;
//Write a Java program to check whether a given string ends with the contents of another string. 
/*
 * Sample Output:

"Python Exercises" ends with "se"? false                                                                      
"Python Exercise" ends with "se"? true
 */
public class Erercise12 {
	public static void main(String[] args)
	{
		String str1 ="Python Exercises";
		String str2 ="Python Exercise";
		System.out.println("Orginal string of str1:"+str1);
		System.out.println("Orginal string of str2:"+str2);
		String str3 ="se";
		boolean end1 = str1.endsWith(str3);
		boolean end2 = str2.endsWith(str3);
		
		System.out.println("\"" + str1 + "\" ends with " +
	            "\"" + str3 + "\"? " + end1);
		System.out.println("\"" + str2 + "\" ends with " +
	            "\"" + str3 + "\"? " + end2);

	}
}
