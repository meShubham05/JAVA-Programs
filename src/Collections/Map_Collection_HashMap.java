package Collections;


import java.util.*;
import java.util.Map.Entry;

public class Map_Collection_HashMap {

	public static void main(String[] args) {
		
		Map <Integer,String> map = new HashMap<Integer,String>();
		
		map.put(5,"Shubham");
		map.put(2,"Aniket");
		map.put(3,"Meera");
		
		map.put(8,null);
		
		System.out.println(map);
		
		
		String value = map.get(5);
		
		System.out.println("The Value of the key is : "+value);
		
		
		Set<Entry<Integer,String>>  set = map.entrySet();
		
		Iterator<Entry<Integer, String>> it = set.iterator();
		
		System.out.println("Iterating the map collections using the Entry Interfaces : ");
		while(it.hasNext())
		{
//			System.out.println(it.next());
			Map.Entry<Integer,String> map2 = (Map.Entry<Integer,String>)it.next();
			System.out.println(" Key : "+map2.getKey()+" Value : "+map2.getValue()+"\n ");
		}
		
		
		// using for each loop
		
		System.out.println("Iterating the Map Collection using the For Each Loop :");
		
		for(Map.Entry<Integer,String> map3 :set )// or use set= map.entrySet()
		{
			System.out.println(" Key : "+map3.getKey()+" Value : "+map3.getValue());
			
		}
	
		
		
		// fetching the data without using the Entry Interface
		
		map.put(10, "Hare");
		map.put(11, "Krishna");
		map.put(12, "Hare");
		map.put(13, "Ram");
		
		
		
		Set<Integer> set2 = map.keySet();
		
		Iterator <Integer> iterator =set2.iterator();
		
		System.out.println("Fetching the data using the keySet() ");
		while(iterator.hasNext())
		{
		 	Integer keys =iterator.next();
			
			System.out.println("Map Key : "+keys+" Map Values : "+map.get(keys));
		}
		
	}
}
