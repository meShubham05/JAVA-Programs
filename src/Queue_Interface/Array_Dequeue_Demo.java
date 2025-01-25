package Queue_Interface;

import java.util.*;
public class Array_Dequeue_Demo {

	public static void main(String[] args) {
		
		Deque <String> dequeue = new ArrayDeque<>();
		
		//  ArrayDequeue is faster than linked_list and Stack
		
		dequeue.add("Amit");
		dequeue.add("zakir");
		dequeue.add("Shubham");
		dequeue.add("Omkar");
		dequeue.add("RadhaRani");
		
		System.out.println(dequeue);
		
		System.out.println("Fetching the Data using the Dequeue :");
		
		for(String str:dequeue)
		{
			System.out.print(" "+str);
		}
		
		// Here the dequeue have a aditional functionality like it can remove the element from both side like first and last
		
		// by using the pollFirst & pollLast
		
		System.out.println("Removing the element from first end :");
		
		System.out.println("First End :"+dequeue.pollFirst());
		
		System.out.println("Last End : "+dequeue.pollLast());
		
		System.out.println("After pollFirst() and pollLast() :");
	
		System.out.println(dequeue);	
		
	}
}
