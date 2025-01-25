package Function_Recursion;


import java.util.*;

public class Fibonacci_Pattern {

	
		
		public static void pattern(int a,int b,int c, int row,int col,int i,int j)
		{
						
//			if(i>=row)
//			{
//				return;  	for Stack Overflow
//			}	
			
			
			
			if(i<row)
			{
				
				if(j==0)
				{
					c=a+b;					
					a=b;
					b=c;
					System.out.print(a);					
				}			
				
				if(a-1>=j)
				{
					
					System.out.print("*");
					pattern(a,b,c,row,col,i,j+1);
				}
				
				else
				{					
					System.out.println();					
					pattern(a,b,c,row, col, i+1, 0);
				}
			}
			
		}
		
		
		public static void main(String[] args) {
			
		
		Scanner sc = new Scanner(System.in);
		
		pattern(0,1,0,5, 5, 0, 0);
		
		sc.close();
		
		}
	}


