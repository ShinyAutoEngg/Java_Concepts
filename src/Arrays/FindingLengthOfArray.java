package Arrays;

public class FindingLengthOfArray 
{
	public static void main(String[] args) 
	{
		int[] a= {2,3,45,5,6,7,8};
		int count=0;
		
		for(int i:a)
		{
			count++;
		}
		System.out.println("Length of array is :"+count);
	}
}
