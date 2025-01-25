package Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_Demo {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new Hashtable<>(); // here String is key and the Integer is Value
		
		map.put("Ram", 1);
		map.put("Shyam",9);
		map.put("Omkar",7);
		map.put("Ramesh",1);
		
		
		
		System.out.println(map);		
		
		map.remove("Ramesh");
		
		System.out.println("After removing the Collection :");
		
		System.out.println(map);
		
		
	
	}
}
