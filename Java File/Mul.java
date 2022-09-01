package Array;

import java.util.Arrays;

public class Mul {
public static void main(String[] args) {
	int[][] arr = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	
	System.out.println(Arrays.deepToString(arr));
	for(int  i = 0 ;i<arr.length;i++) {
		int m=1;
		int j=0;
		try {
		for( j = 0 ;i<arr.length ;j++) {
			m*=arr[i][j];
		}
		arr[i][j]=m;
	}
	catch(Exception e){
		System.out.println(e);
	}
	System.out.println(Arrays.deepToString(arr));
	System.out.println("hello");
}
}
}
