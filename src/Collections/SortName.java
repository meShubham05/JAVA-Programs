package Collections;


import java.util.*;

class Name
{
	String name;
	
	public Name()
	{		
		
	}
	
	public Name(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}


class SortNameDesc implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		
		Name n1 = (Name)o1;
		Name n2 = (Name)o2;
		
		if(n1.getName().compareTo(n2.getName())>0)
		{
			return -1;
		}
		else if( n1.getName().compareTo(n2.getName())<0)
		{
			return 1;
		}
		else
		{
		return 0;
		}
	}
	
}

public class SortName {
	
	
	public static void main(String x[])
	{
		List<Name> list = new ArrayList<Name>();
		
		list.add(new Name("Meera"));
		
		list.add(new Name("Jyoti"));
		
		list.add(new Name("Shubham"));
		
		list.add(new Name("Meena"));
		
		list.add(new Name("Aniket"));
		 
		
		
		System.out.println("Before sorting \n");
		
		System.out.println(list);
				
		SortNameDesc sort = new SortNameDesc();
		
		Collections.sort(list, sort);
		
		System.out.println("\n After Sorting : \n ");
		
		System.out.println(list);
		
	}
		
		
}
