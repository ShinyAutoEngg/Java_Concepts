package Arrays;

public class minAndMax {

	public static void main(String[] args) 
	{
		int[] a = {20,10,30,100,50,40};
		
		int smallest = a[0];
		
		int largest =a[0];
		
		
		for(int i=1;i<=a.length-1;i++)
		{
			if(smallest>a[i])
			{
				smallest=a[i];
			}
			if(largest<a[i])
			{
				largest=a[i];
			}
		}
		
		System.out.println(smallest);
//		
//		int largest =a[0];
//		
//		for(int j=1;j<a.length-1;j++)
//		{
//			if(largest<a[j])
//			{
//				largest=a[j];
//			}
//		}
		
		System.out.println(largest);

	}

}
