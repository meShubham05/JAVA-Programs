package Function_Recursion;


import java.util.*;

public class Diameter_Circumference_Area {

	public static int calDiameter( int radius ,int multiplier)
	{
		if(multiplier ==2)
		{
			return multiplier*radius;
			
		}
		
		return calDiameter(radius,multiplier+1);
		
	}
//	public static float calCircumference(int radius,float pi,int multiplier)
//	{
//		if(pi==3.14 && multiplier==2)
//		{
//			return radius*pi*multiplier;
//		}
//		
//		return calCircumference(radius,pi+0.2, multiplier+1);
//	}
//	
//	public static int calArea(int radius,float pi,int multiplier)
//	{
//		if(pi==3.14*)
//		return 
//	}
//	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Radius :");
		
		int radius = sc.nextInt();
		
	int diameter =calDiameter(5, 0);
		
		System.out.println("The Diameter of a Circle having radius "+radius +" is :"+diameter); 
		
				
	}

}
