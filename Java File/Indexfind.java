package Array;


// Write a Java program to find the index of an array element. 
public class Indexfind {
	// method to find the index of an array
	public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
	// main method 
    public static void main(String[] args) {
    	//initialize the array 
      int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
      // to display the index through calling the method findIndex
      System.out.println("Index position of 36 is: " + findIndex(my_array, 36));
      System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
      System.out.println("Index position of 155 is: " + findIndex(my_array, 155));
      
       }
}
