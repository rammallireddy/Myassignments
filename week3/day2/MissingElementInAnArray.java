package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ram = new ArrayList<Integer>();
				ram.add(1);
				ram.add(2);
				ram.add(3);
				ram.add(4);
				ram.add(7);
				ram.add(6);
				ram.add(8);
				
				Collections.sort(ram);
				System.out.println(ram);
				
				for (int i = 0; i < ram.size(); i++) {
					int m = ram.get(i);
					if (m!=i+1) {
						System.out.println(i+1);
					}
				}
	}

}
