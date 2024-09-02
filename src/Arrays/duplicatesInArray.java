package Arrays;

public class duplicatesInArray {

	public static void main(String[] args) 
	{
		int count=0;
		int[] a= {10,20,30,40,10,20,100,80,100};
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					System.out.println(a[i]);
					
				}
				
			}
		}
		
		System.out.println("Number of duplicates found is : "+count);
	}

}
