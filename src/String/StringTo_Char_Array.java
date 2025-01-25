package String;

import java.io.Serializable;
import java.util.*;

public class StringTo_Char_Array implements Serializable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str ="Java Programming 222 ";
		
		System.out.println("Enter the String :");
	
		char ch[] = str.toCharArray();
		
		char ch2[];
		
		System.out.println("String length:"+str.length());
		
		System.out.println("Character Array Length:"+ch.length);
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print(" "+str.charAt(i));
		}
		
		

		String str2 = "I Love Java Development :";
		
		char ch3[] = new char[str2.length()];
		
		for(int i=0;i<str2.length();i++)
		{
			ch3[i] = str2.charAt(i);
			
			System.out.print(" "+ch3[i]);
		}
		
		
		
		
		System.out.println();
		
		String str3 = "I am Indian ";
		
		
		char ch4[] = new char[str3.length()];
		
		for(int i=0;i<ch4.length;i++)
		{
			System.out.print(" "+str3.charAt(i));
		}
		
	}

}
