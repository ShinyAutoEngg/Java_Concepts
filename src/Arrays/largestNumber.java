package Arrays;

public class largestNumber {

	public static void main(String[] args)
	{
		int[] arr = {45,67,54,89,98,23};
			int largest = arr[0];
			int length = arr.length;
			
			for(int i=1;i<length;i++)
			{
				if(arr[i]>largest)
				{
					largest=arr[i];
				}
			}
			
			System.out.println(largest);
		

	}

}
