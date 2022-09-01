package Array;

import java.util.Arrays;

public class LeftRotate {
	public static void main(String[] args)
	{   
		 //Initialize array  
        int [] inputArray = new int [] {1, 2, 3, 4, 5};  
        //n determine the number of times an array should be rotated  
        int n = 4;  
       int temp;
       System.out.println("Input Array Before Rotation :");
       System.out.println(Arrays.toString(inputArray));

        for (int i = 0; i < n; i++)
   {

            temp = inputArray[0];

             

            for (int j = 0; j < inputArray.length-1; j++) 

            {

                inputArray[j] = inputArray[j+1];

            }

             

            inputArray[inputArray.length - 1] = temp;

        }
        System.out.println("Input Array After Left Rotation By "+n+" Positions :");

         

        System.out.println(Arrays.toString(inputArray));

    }

	}

	

