package Collections;

import java.util.*;

public class TreeSet_Demo {

	public static void main(String[] args) {
	
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(4);
		
		set.add(8);
		set.add(12);
		set.add(3);
		set.add(2);
		set.add(6);
		set.add(1);
		
		System.out.println(set);
		
		Iterator<Integer> it =set.iterator();
		
		for(Integer numbers :set)
		{
			System.out.println(numbers);
		}
		
	}

}
