package Collections;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ram");
		list.add("Shyam");
		list.add("Om");
		list.add("Sanket");
		list.add("Amit");
		
		Iterator<String> iterator =list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			
		}
		
		// another way to iterate the ArrayList
		
		
		System.out.println("Iterating the list using for loop :");
		for(String str :list)
		{
			System.out.println(str);
		}
		
		// by using get() and set() methods we can retrive and modify the arraylist elements :
		
		
		list.set(2,"Omkar");
		
		System.out.println("After setting the particular index of the ArrayList :");
		
		System.out.println(list);
		
		// now get() for getting the values at the particular index :
		
		
	String getValue=	list.get(2);
	
	System.out.println("Element at particular index is :"+getValue);
	
	
	// Now sorting the arraylist using sort() method :
	
	System.out.println("Before sorting :");
	System.out.println("\n===============\n");
	
	System.out.print(list);
	
	
	Collections.sort(list);
	
	System.out.println("\n After sorting :");
	System.out.println("\n===============\n");
	
	
	System.out.print(list);
		
	}
}
