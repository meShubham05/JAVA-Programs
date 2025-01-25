package Collections;

import java.util.*;
public class LinkedList_Deo {

	public static void main(String[] args) {
		
		List <String> list = new LinkedList<String>();
		
		list.add("Meera");
		list.add("Shubham");
		list.add("Aniket");
		list.add("Gajanan");
		
		ListIterator<String> i = list.listIterator();
		
		while(i.hasNext())
		{
			i.next();
		}
		ListIterator<String> i2 = list.listIterator();
		
		while(i.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		
		
		
		
		
		
		
		
	}
}
