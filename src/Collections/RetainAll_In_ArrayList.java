package Collections;

import java.util.*;
public class RetainAll_In_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(2);
		
		list.add("Sanket");
	    list.add("Amit");
	    list.add("Rohan");
	    list.add("Shubham");
	    
	    
	    int size = list.size();
	    
	    System.out.println("The size of the arraylist is :"+size);
	    
	   
	    ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("Suresh");
	    list2.add("Amit");
	    list2.add("Rajesh");
	    list2.add("Sanket");
	    
	    list.retainAll(list2);
	    
	    Iterator<String> i = list.iterator();
	    
	    System.out.println("After retaining the element from the list2 ");
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
	 	
	}
}
