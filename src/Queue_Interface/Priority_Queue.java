package Queue_Interface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("Ram");
		queue.add("Shyam");
		queue.add("Aniket");
		queue.add("Darshan");
		queue.add("Zakir");
		
		System.out.println(queue);
		// First element as element()
		
		System.out.println("head :"+queue.element());
		
		// peek() return null if  element is not there in queue  
		System.out.println("Peek : "+queue.peek());
		
		
		System.out.println(queue);
		
		
		System.out.println("Before Poll (delete First) Queue is :");
		
		System.out.println(queue);
		
		queue.poll();

		System.out.println("After Poll (delete First) Queue is :");
		
		System.out.println(queue);
		
		System.out.println(queue);
		
		Deque <String> queue2 = new ArrayDeque<>();
		
		// peek() return null if  element is not there in queue  
		
		System.out.println("Peek : "+queue2.peek());  // result is : null 
			
		// fetching the data using the Iterator 
	
		queue2.add("Amit");
		queue2.add("Shyam");
		
		
		System.out.println(queue2);
		queue2.pollLast();
		
		System.out.println(queue2);
		System.out.println("Fetching the data using the Iteator :");
		Iterator<String> it =queue.iterator();
		
		while(it.hasNext())
		{
			System.out.print(" "+it.next());
		}
		
	}
}
