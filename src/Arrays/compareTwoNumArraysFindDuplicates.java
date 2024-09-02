package Arrays;

public class compareTwoNumArraysFindDuplicates
{
	public static void main(String[] args)
	{
		int[] a= {1,6,8,9,3};
		int[] b= {2,4,6,9,8,5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]+" is a duplicate");
					break;
				}
			}
		}
	}
}
