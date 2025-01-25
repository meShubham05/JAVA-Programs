package String;

public class String_Buffer_Demo {
	
	public static void main(String[] args) {
		

	String str = new String("JAVA"); //  2 object  // sring cosntant pool // heap 
	
	
	StringBuffer string = new StringBuffer("JAVA_Language");
	
	
	
	int hashcode = str.hashCode();
	
	int stringbuffer = string.hashCode();
	
	System.out.println("Before Appending :"+string);
	System.out.println("The Hashcode of the String Object is : "+hashcode);
	
	System.out.println("The Hashcode of the StringBuffer Object  is : "+stringbuffer);
	
	
	
	string.append(" Is OOP ");
	
	System.out.println("After String Appending :"+string);
	
	

	}		

}
