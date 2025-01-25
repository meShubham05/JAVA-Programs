package String;

public class Sort_Name_By_length_Descending {

	public static void main(String[] args) {

		String str[] ={"Rohan","Yashraj","Sanket","Shubham","Amit","abcdefgh"};
	
		System.out.println(" Before Sorting:");
		
		for(int i=0;i<str.length;i++)
		{
			System.out.print(" "+str[i]);
		}
		
		for(int i=0;i<str.length;i++)
		{
			char ch[]= str[i].toCharArray();
			
			for(int j=i+1;j<str.length;j++)
			{
				char ch2[] =str[j].toCharArray();
				
				if(ch.length>ch2.length)
				{
					String temp =str[i];
					str[i]=str[j];
					str[j]=temp;
					
				}
			}
			
		}
		
		System.out.println("\nAfter sorting the String Array :");
		
		
		for(int i=0;i<str.length;i++)
		{
			System.out.print(" "+str[i]);
		}
		
	}

}
