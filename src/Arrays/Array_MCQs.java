package Arrays;

import java.util.*;
public class Array_MCQs {
	
	public static void main(String[] args) {
		
		int array [] = new int[5];
		int array1 [ ]= {1,2,3,4,5,6};
		
		int j=2;
		int value = array1[++j];
		
		int value2 = array1[j++];
		
		
		System.out.println("Value is  value : "+value);
		
		System.out.println("Value is  value2 : "+value2);
				
		int array2 [] = new int[] {1,2,3,4,5};
		
		int array3 [], array4[];
		
		array3 = new int[3];
		
		array4 =  new int[] {1,2,3};
		
		
		int array5 [] = new int[5];
		
		Arrays.fill(array5, 10);
		
		int [][] multiArray = new int[3][4];

	}

}
