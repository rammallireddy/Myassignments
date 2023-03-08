package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ram= new ArrayList<Integer>();
			ram.add(3);
			ram.add(2);
			ram.add(11);
			ram.add(4);
			ram.add(6);
			ram.add(7);
			Collections.sort(ram);
			System.out.println(ram);
			int secondLarg= ram.get(4);
			
			System.out.println(secondLarg);
		
	}

}
