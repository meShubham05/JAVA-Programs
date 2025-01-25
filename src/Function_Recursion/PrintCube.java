package Function_Recursion;

import  java.util.*;
public class PrintCube {

	public static int showCube(int num, int count,int sum)  // 4 , 0 , 1
	{
		if(count==3)
		{
			return sum;
		}
		
		  return showCube(num,count+1,num*sum);
		
	}
	public static void main(String[] args) {

		

		System.out.println("Enter the Number :");

		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();
		
		
		int result =showCube(num,0,1);
		
		System.out.println("The cube of "+num+" is  :"+result);
		
		
				
	}

}
