
public class Default_Values_Of_Data_Types {


		
	
		    // Instance variables
		    byte b;
		    short s;
		    int i;
		    long l;
		    float f;
		    double d;
		    char c;
		    boolean bool;
		    String str; // Object type

		    public static void main(String[] args) {
		    	Default_Values_Of_Data_Types obj = new Default_Values_Of_Data_Types();
		        System.out.println("byte    : " + obj.b);  // 0
		        System.out.println("short   : " + obj.s);  // 0
		        System.out.println("int     : " + obj.i);  // 0
		        System.out.println("long    : " + obj.l);  // 0L
		        System.out.println("float   : " + obj.f);  // 0.0f
		        System.out.println("double  : " + obj.d);  // 0.0d
		        System.out.println("char    : " + obj.c);  // '\u0000' (prints as empty)
		        System.out.println("boolean : " + obj.bool); // false
		        System.out.println("String  : " + obj.str);  // null
		    }
		
}
