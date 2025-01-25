package Collections;

import java.util.*;
public class HashSet_Demo {

	public static void main(String[] args) {
		
		Set<String>  set = new HashSet<String>();
		
		set.add("Amit");
		set.add("Aniket");
		set.add("Amit");
		set.add("Ram");
		set.add("Omkar");
		set.add("Rohan");
		set.add("Shubham");
		set.add("Shubham");
		
		
		System.out.println(set);
		
		Iterator<String> it =set.iterator();
		
		System.out.println("\nIterating with iterator(): ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		// remove
		
		set.remove("Shubham");
		
		System.out.println("After removing the Set : \n");
		
		System.out.println(set);
		
		// removeAll
		
//		set.removeAll(set);
//		
//		System.out.println("After removing all using set.removeAll() the Set : \n");
//		
//		System.out.println(set);
		
		set.removeIf(s->s.contains("Rohan"));
		
		System.out.println("After removeIf() : \n");
		
		System.out.println(set);
		
		// set.clear()
		
		
		set.clear();
		 
		
		System.out.println("after clear() method :"+set);
		
		
		// Adding the Another collection to the HashSet collection
		
		
		List <String> list = new ArrayList<String>();
		
		list.add("Meera");
		list.add("Gajanan");
		
		Set<String> set2 = new HashSet<String>(list);
		
		
		set2.add("Shubham");
		set2.add("Aniket");
		
		System.out.println("After adding the List collection to the HashSet Collection throught  constructor :");
		
		
		System.out.println(set2);
		
		
	}
}
