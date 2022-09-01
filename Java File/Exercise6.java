package String;
//Write a Java program to compare two strings lexicographically, ignoring case differences. 
/*
 String 1: This is exercise 1                                                                                  
String 2: This is Exercise 1                                                                                  
"This is exercise 1" is equal to "This is Exercise 1"
 */
public class Exercise6 {
	public static void main(String[] args )
	{
		String str1 ="Hello is world!";
		String str2 = "Wello is world";
		System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 

       
        // Compare the two strings.
        int result = str1.compareToIgnoreCase(str2);

        // Display the results of the comparison.
        if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
    }
	}


