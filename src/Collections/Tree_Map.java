package Collections;

import java.util.*;

public class Tree_Map {

	public static void main(String[] args) {

		Map<Integer,String> map = new TreeMap<>();
		
		map.put(12, "Hare");
		map.put(2, "Ram");
		map.put(5, "Hare");
		map.put(8, "Ram");
		map.put(15, "Shyam");
		
		System.out.println(map);
		
		
		Set<Integer> set =map.keySet();
		
		Iterator <Integer> it=set.iterator();
		
		System.out.println("Data Fetching Using While Loop :");
		while(it.hasNext())
		{
			Integer key = it.next();
			
			System.out.println(" Key : "+key+" Value :"+map.get(key));
		}
		
		
		System.out.println("Iterating again: \n ");
		
		Iterator <Integer> it2=set.iterator();
		
		while(it2.hasNext())
		{
			Integer key = it2.next();
			
			System.out.println(" Key : "+key+" Value :"+map.get(key));
		}
		
		System.out.println("Fetching Collection Data using for loop :");
	
		for(Integer key:set)
		{			
			System.out.println("Key : "+key+" Value : "+map.get(key));
		}
			
	}

}
