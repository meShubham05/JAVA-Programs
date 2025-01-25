package Collections;

import java.util.*;


class India
{
	private int id;
	private String name;
	private int run;
	
	public India(int id, String name, int run) 
	{
	
		this.id = id;
		this.name = name;
		this.run = run;
	}

	public String toString()
	{
		return     ""+id+ "        "+name+"      "+run;
	}
	
	
}


	class Australia
	{
		
		private int id;
		private String name;
		private int run;
		
		public Australia(int id, String name, int run) {
		
			this.id = id;
			this.name = name;
			this.run = run;
		}

		public String toString()
		{
			return +id+" "+name+" "+run;
		}
		
		
	}

class Employee
{
	private int empId;
	private String empName;
	private int empSalary;
	public Employee(int empId, String empName, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}

public class Map_Sorting {

	public static void main(String[] args) 
	{	
		
		Map<Integer,Employee>  map= new LinkedHashMap<>();
		
		map.put(101, new Employee(1, "Ram", 1000));
		map.put(102, new Employee(2,"Shyam",2000));
		
		
		System.out.println(map);
		
		for(Map.Entry<Integer, Employee> data :map.entrySet())
		{
			System.out.println("Key :"+data.getKey()+" Value :"+data.getValue());
		}
			
		
		Map<String,India> indiaList = new LinkedHashMap<>();
		
		indiaList.put("I001", new India(1, "Shyam", 10000));
		indiaList.put("I002", new India(2, "Ram", 20000));
		
		
		System.out.println("INDIAN Player List :");
		System.out.println("Player Team Id :  Id       Name     Runs");
		
		for(Map.Entry<String, India> list: indiaList.entrySet())
		{
			System.out.println(list.getKey()+"   "+list.getValue());
		}
		
		
		Map<String, Australia> ausList =  new LinkedHashMap<>();
		
		
		ausList.put("A101", new Australia(1, "Steve Smith", 1000));
		
		ausList.put("A102", new Australia(2, "David Warner", 20000));
		
		
		System.out.println("Australian Player List :");
		System.out.println("Player Team Id :  Id       Name     Runs");
		
		for(Map.Entry<String, Australia> list2 : ausList.entrySet())
		{
			System.out.println(list2.getKey()+" "+list2.getValue());
		}
	}
	
	
}
