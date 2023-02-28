package week2.day1;

import java.util.Arrays;

public class ArrayFindSecondLargeNum {
	
public static void main(String[] args) {
	 int[] data= {3,2,11,4,6,7};
	 
	 Arrays.sort(data);
		 for (int i = 0; i < data.length; i++) {
		System.out.println(data[i]);
		 
	 	 }
		 System.out.println(data[data.length-2]);
}

}
