package Function_Recursion;


import java.util.*;

public class PrintPattern {

	public static void patter(int row,int col,int i,int j)
	{
		
		if(i>=row)
		{
			return;
		}
		
		
			if(i<row)
			{
				if(j<col)
				{
					System.out.print("*");
					
					patter(row, col, i, j+1);
					
				}
				else
				{
					System.out.println();
					patter(row, col, i+1, 0);
				}
			}	
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		
		patter(3, 3, 0, 0);		
		
	}
}
