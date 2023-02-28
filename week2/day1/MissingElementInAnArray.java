package week2.day1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,7,6,8};
		
		//System.out.println(arr[0]);
		
		Arrays.sort(arr);
		for (int i = 0; i<= arr.length-1; i++) {
			//arr[i] = arr[i] +1;
			if(arr[i] != i+1) {
				System.out.println(i+1);
			//break;
		}
		}

	}

}
