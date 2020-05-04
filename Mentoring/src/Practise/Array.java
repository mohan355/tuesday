package Practise;

import java.util.ArrayList;
import java.util.Collections;

public class Array {

	public static void main(String[] args) {
		
		String[] cars= {"Toyota","Nissan","Mazda","Ford"};
		
		System.out.println(cars[0]);
		
		for(int i=0;i<cars.length;i++)            // for loop
		{
		System.out.println(cars[i]);
	}
	
	
	for (String i:cars)                              // for each loop
	{
			System.out.println(i);
			
		}
	
		
	ArrayList<Integer> mynumber= new ArrayList<Integer>();
	mynumber.add(10);
	mynumber.add(5);
	mynumber.add(15);
	mynumber.add(17);
	mynumber.add(2);
	
	Collections.sort(mynumber);
	
	for ( int i:mynumber) {
		System.out.println(i);
		
	}
	
	for(int b=0;b<mynumber.size();b++) {
		System.out.println(mynumber.get(b));
		
	}
		

	}

}
