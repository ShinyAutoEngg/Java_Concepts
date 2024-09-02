package Pratice;

public class largestnum 
{

	public static void main(String [] args)
	{
		int[] a= {132,2,45,24,87,100,23};
		
		int l=a.length;
		int largest =a[0];
		
		for(int i=1;i<=l-1;i++)
		{
			if(largest<a[i])
				largest=a[i];
		}
		
		System.out.println(largest);
	}
}
