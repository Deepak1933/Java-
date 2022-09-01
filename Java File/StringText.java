package Utility.java;

public class StringText {
	public static void main(String[] args)
	{
		String text = "Jack      Hammer";
//		text =text.toLowerCase();
	//	System.out.println(text) ;
		System.out.println(text.replace(" ","_")) ;
		
		//problem3
		String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);
	}

}
 