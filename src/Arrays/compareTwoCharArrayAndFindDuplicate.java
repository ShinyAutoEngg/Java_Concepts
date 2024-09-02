package Arrays;

public class compareTwoCharArrayAndFindDuplicate 
{
	public static void main(String[] args) 
	{
		char[] ch1= {'b','d','s','a','e','g'};
		char[] ch2= {'j','h','s','a','i','g'};
		
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i]==ch2[j])
				{
					System.out.println(ch1[i]+" is duplicate");
				}
			}
		}
	}
}
