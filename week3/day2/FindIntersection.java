package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Integer> ram= new ArrayList<Integer>();
   ram.add(3);
   ram.add(2);
   ram.add(11);
   ram.add(4);
   ram.add(6);
   ram.add(7);
   System.out.println(ram);
   ArrayList<Integer> ram1= new ArrayList<Integer>();
   ram1.add(1);
   ram1.add(2);
   ram1.add(8);
   ram1.add(4);
   ram1.add(9);
   ram1.add(7);
   System.out.println(ram1);
   
   Collections.sort(ram);
   System.out.println(ram);
   Collections.sort(ram1);
   System.out.println(ram1);
   Object[] m0= ram.toArray();
   Object[] m1 = ram1.toArray();
      for (int i = 0; i < m0.length; i++) {
	   for (int j = 0; j < m1.length; j++) {	
   if(m0[i]==m1[j]) {
		System.out.println(m0[i]);
	}
  
	}
//   ram.retainAll(ram1);
//   System.out.println(ram);
}
	}

}
