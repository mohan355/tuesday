package Practise;

import java.util.ArrayList;
import java.util.Collections;


public class ArraylistClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> myNumber= new ArrayList<Integer>();
		myNumber.add(10);
		myNumber.add(8);
		myNumber.add(15);
		myNumber.add(18);
		myNumber.add(20);
		myNumber.remove(3);
		
		Collections.sort(myNumber);
		
		for(int i:myNumber) {
			System.out.println(i);
		}
		
		
		
		
		for(int i=0; i<myNumber.size();i++) {
			System.out.println(myNumber.get(i));
		}
		
		
		
	}

}
