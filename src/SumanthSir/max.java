package SumanthSir;

public class max
{
	public static void main(String[] args) 
	{
		int[] a= {3,5,66,7,8,889,0};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
