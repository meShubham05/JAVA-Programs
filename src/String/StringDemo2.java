package String;

public class StringDemo2 {

	public static void main(String[] args) 
	{		
		String str = "Hello";
		String str2 = "Hello";
		
		int obj1 = str.hashCode();
		int obj2 = str2.hashCode();	
		
		System.out.println("Object 1 reference is :"+obj1);
		System.out.println("Object 2 reference is :"+obj2);
	}
}
