package SumanthSir;

public class ThirdMax 
{
	public static void main(String[] args)
	{
		int[] a= {5,6,72,22,311,3334,88,6};
		int max=Integer.MIN_VALUE;
		int sec_max=Integer.MIN_VALUE;
		int third_max=Integer.MIN_VALUE;
		
		for(int i=0; i<a.length;i++)
		{
			if(max<a[i])
			{
				third_max=sec_max;
				sec_max=max;
				max=a[i];
			}
			if((sec_max<a[i]) && max!=a[i])
			{
				third_max=sec_max;
				sec_max=a[i];
			}
			if((third_max<a[i]) && max!=a[i] && sec_max!=a[i])
			{
				third_max=a[i];
			}
		}
		System.out.println(third_max);
	}
}
