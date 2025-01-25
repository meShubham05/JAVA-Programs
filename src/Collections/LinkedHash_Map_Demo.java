package Collections;

import java.util.*;

public class LinkedHash_Map_Demo {

	public static void main(String[] args) {
		
		Map <Integer,String> map = new LinkedHashMap<Integer,String>();
		
		map.put(null, null); // LinkedHashMap allow the Null key once and more than Null Values:
		
		map.put(null, "Ram");
		
		map.put(9, "Ramesh");

		map.put(1, "Shyam");
		
		map.put(3, "Madhav");

		System.out.println("After Putting more than one Null key ");
		
		System.out.println(map);
		
		System.out.println("Fetching the map collections using 2 ways :");
		
		System.out.println("1 : by using the keySet() for loop :");
		
		Set<Integer> set = map.keySet();
		
		Iterator<Integer> it =set.iterator();
		
		for(Integer key :set)
		{
			 // Integer key=it.next();
		
			
			System.out.println("Map Key :"+key+" Map Values :  "+map.get(key));
		}
		
		System.out.println("Fetching the map collection using keySet() using while loop ");
		
		while(it.hasNext())
		{
			Integer key=it.next();
			
			System.out.println(" Map Key : "+key+" Map Values : "+map.get(key) );
		}
		
	}
}
