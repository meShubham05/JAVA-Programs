package Collections;

import java.util.*;

public class Stack_Demo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		Vector<Integer> vector= new Stack<Integer>();
		
		vector.add(50);
		
		System.out.println("Checking the Stack Empty or Not Before inserting into Stack");
		
		boolean result = stack.empty();
		
		System.out.println("Stack is Empty : True or False : "+result);
		
		stack.push(100);
		
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		
		System.out.println(stack);
		
		boolean resultAfterInserting = stack.empty();
		System.out.println("Stack is Empty : True or False : "+resultAfterInserting);
		
		Iterator<Integer> it = stack.iterator();
		
		System.out.println("Using iterator :");
		while(it.hasNext())
		{
			System.out.println(it.next());	
		}
		
		System.out.println("Using For Each Loop :");
		
		stack.forEach((s)->System.out.print(" "+s));
				
		ListIterator<Integer> listIt =stack.listIterator();
		
		System.out.println("\n Reverse List using the ListIterator :");
		
		while(listIt.hasNext())
		{
			listIt.next();
		}
		
		while(listIt.hasPrevious())
		{
			System.out.print(" "+listIt.previous());
		}
	}
}
