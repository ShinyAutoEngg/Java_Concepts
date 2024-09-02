package Arrays;

public class addTwoInEqualArrays 
{
	public static void main(String[] args) 
	{
		int[] a= {2,4,6,7,8,9};
		int[] b= {5,6,7,2};
		int length=a.length;
		if(b.length>a.length)
		{
			length=b.length;
		}
	
		for(int i=0;i<length;i++)
		{
			try 
			{
				
					System.out.print(b[i]+a[i]+" ");
				
			}
			catch(Exception e)
			{
				if(a.length<b.length)
				{
					System.out.print(b[i]+" ");
				}
				else if(b.length<a.length)
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
