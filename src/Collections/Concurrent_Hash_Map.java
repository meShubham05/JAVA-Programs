package Collections;


import java.util.concurrent.ConcurrentHashMap;

import java.util.*;

public class Concurrent_Hash_Map {
	
	public static void main(String[] args) {
		
		   ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

		   map.put(4,"Hare");
		   map.put(9, "Ram");
		   map.put(1, "Hare");
		   map.put(6, "Krishna");
		
		   System.out.println(map);
		   
		   int hashcode = map.hashCode();
		   
		   System.out.println("The Hashcode of the map is :"+hashcode);
		   
		   map.computeIfAbsent(1,k->"Shyam");
		   
		   System.out.println("After compute if Absent :");
		   
		   System.out.println(map);
		   System.out.println(map);
		   
		   //merging the two concurrent hashmap collections 
		   
		   Map<Integer,String> map2 = new ConcurrentHashMap<>();
		   
		   map2.put(20, "Java");
		   map2.put(22, ".Net");
		   map2.put(24,"Python");
		   map2.put(26, "C++");
		   map2.put(28, "Spring Boot :");
		   map2.put(35, "React");
		   
		   System.out.println("Printing the Map of the concurrentHashMap ");
		   System.out.println(map2);
		   
		   
		   map.forEach((key,value)->map2.merge(key, value, (v1,v2)-> v1+" "+v2));
		   
		   System.out.println("After merging the Map into map2 :");
		   
		   System.out.println(map2);   
		
	}	
	
	   
}
