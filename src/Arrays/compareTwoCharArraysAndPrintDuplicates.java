package Arrays;

public class compareTwoCharArraysAndPrintDuplicates 
{
	public static void main(String[] args)
	{
		String[] s1 = {"hi","hello","welcome"};
		String[] s2 = {"bangalore","chennai","hello"};
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s2.length;j++)
			{
				if(s1[i]==s2[j])
				{
					System.out.println(s1[i]+" is a duplicate");
					break;
				}
			}
		}
	}
}
