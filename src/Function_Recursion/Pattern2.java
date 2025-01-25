package Function_Recursion;

import java.util.*;

public class Pattern2 {

	
	public static void pattern(int row,int col,int i,int j)
	{
		
		
//		if(i>=row)
//		{
//			return;  	for Stack Overflow
//		}
		
		
		if(i<row)
		{
			
			if(i>=j)
			{
				System.out.print("*");
				pattern(row,col,i,j+1);
			}
			
			else
			{
				System.out.println();
				pattern(row, col, i+1, 0);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	pattern(4, 4, 0, 0);
	
	sc.close();
	
	}
}
