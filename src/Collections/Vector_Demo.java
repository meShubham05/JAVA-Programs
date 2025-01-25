package Collections;

import java.util.*;

class ArrayListDemo
{
	    public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>();

	        // Thread 1 adds numbers to the list
	        Thread thread1 = new Thread(() -> {
	            for (int i = 1; i <= 5; i++) {
	                list.add(i);
	                System.out.println("Thread 1 added: " + i);
	                try {
	                    Thread.sleep(100); // Simulate some processing
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        // Thread 2 iterates through the list
	        Thread thread2 = new Thread(() -> {
	            try {
	                Thread.sleep(50); // Let Thread 1 start adding elements
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            for (Integer num : list) {
	                System.out.println("Thread 2 reading: " + num);
	                try {
	                    Thread.sleep(100); // Simulate some processing
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        thread1.start();
	        thread2.start();

	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Final List: " + list);
	    }
	}


public class Vector_Demo 
{
	
	public static void main(String[] args) 
	{
		 
			        //Create a vector  
			          Vector<String> vec = new Vector<String>();  
			          //Adding elements using add() method of List  
			          vec.add("Tiger");  
			          vec.add("Lion");  
		          vec.add("Dog");  
			          vec.add("Elephant");  
			          //Adding elements using addElement() method of Vector  
			          vec.addElement("Rat");  
			          vec.addElement("Cat");  
			          vec.addElement("Deer");  
			            
		          System.out.println("Elements are: "+vec);  
		       }  


	
	
	
}
