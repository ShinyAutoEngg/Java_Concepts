package SumanthSir;

public class secMaxInArray 
{
	public static void main(String[] args) 
	{
		int[] a={1,3,5,23,12,45,7,33};
		int max=Integer.MIN_VALUE;
		int sec_max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				sec_max=max;
				max=a[i];
			}
			if((sec_max<a[i]) && max!=a[i])
			{
				sec_max=a[i];
			}
		}
		System.out.println(sec_max);
	}
}
