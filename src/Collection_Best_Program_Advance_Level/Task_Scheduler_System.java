package Collection_Best_Program_Advance_Level;

import java.util.*;
//  Design a task scheduler that assigns tasks to employees based on priority. 
//    Each task has a priority (high, medium, low), 
//  and the tasks should be executed in the order of their priority.

/*
Implementation Flow:
1.	Use a PriorityQueue to store tasks with custom priority logic.
2.	Implement a Task class with attributes like id, name, and priority.
3.	Add tasks to the queue and process them in priority order.
4.	Ensure thread safety for concurrent task assignment.
 */

class Task implements Comparable<Task>
{
	private  int taskId ;
	private String name;
	private String priority;
	
	public Task()
	{
		
	}
	
	public Task(int taskId , String name, String priority)
	{
		this.taskId=taskId;
		this.name=name;
		this.priority=priority;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	

	@Override
	public int compareTo(Task o) {

		

		return 0;
	}
	
	
}
public class Task_Scheduler_System {

	public static void main(String[] args) {
		
	
	Queue<Task> queue = new PriorityQueue<Task>();
	
	Task t1 = new Task(5,"TASK1","High");
	Task t2 = new Task(2,"TASK2","Medium");
	Task t3 = new Task(10,"Task3","Low");
	
	queue.add(t1);
	queue.add(t2);
	queue.add(t3);
	
	System.out.println("Display the Queue :");
	
	Task t = new Task();
	
	
	Collections.sort(queue,t);
	
	System.out.println();
	
	System.out.println(queue);
	
	}
}
