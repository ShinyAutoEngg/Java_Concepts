package Arrays;

public class AscendingInArray {

	public static void main(String[] args)
	{
		int[] a= {20,30,100,50,40};
		
		 int l = a.length;
		 System.out.println(l);
		 
		for(int i=0;i<=a.length-1;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		for(int z: a)
		{
			System.out.println(z);
		}
	}

}
