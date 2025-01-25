package Function_Recursion;

import java.util.*;

public class FindMax_Min {

	
	public static boolean isPrimeOrNot(int number,int i)
	{
		if(i<=number/2)
		{
			
			System.out.println("i => "+i);
			
			if(number%i==0)
			{
				return false;
			}
			else
			{
				return true;
			}
					
		}
		return isPrimeOrNot(number, i+1);
	}
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" \n Enter the Number to check Prime or Not :");
		
		int number = sc.nextInt();
		
		
		boolean result = isPrimeOrNot(number ,2);
		
		if(result)
		{
			System.out.println("The Number is Prime :");
		}
		else
		{
			System.out.println("The Number is Not Prime :");
		}
				
	}

}
