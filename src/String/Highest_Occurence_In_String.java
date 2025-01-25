package String;

public class Highest_Occurence_In_String {

	public static void main(String[] args) {

		String str = "java programming ";
		
		char ch[] = new char[str.length()];
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i] = str.charAt(i);
		}
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		System.out.println("After sorting :");
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(" "+ch[i]);
		}
	
		System.out.println();
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
								
				if(ch[i]==ch[i+1])
				{
					count++;
				}
				else
				{					
					System.out.println(ch[i]+" Count => "+count);
					count=0;
				}
		}
		
	}

}
