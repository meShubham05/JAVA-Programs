package Arrays;

public class SecondMax_Without_Sorting {

	public static void main(String[] args) {
		
		int array[] = new int[] {1,6,8,3,2,3,7,1,9,12,81,21,38};
		
		int max=array[0];
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(max<array[j])
				{ 
					max=array[j];
				}
			}
		}
		
		System.out.println("max is :"+max);
		
		int secondMax =array[0];
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j] < max && secondMax < array[j])
					
				{
					secondMax = array[j];					
				}
			} 
		}
		
		System.out.println("Second max is : "+secondMax);
		
	}
	
	
}
