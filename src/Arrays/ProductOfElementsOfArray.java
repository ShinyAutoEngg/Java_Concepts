package Arrays;

public class ProductOfElementsOfArray 
{
	
	public static void main(String[] args)
	{
	int []arr = {1,2,3,4,5,6,7,8,9,10};
	int product =1;
	for(int i=0;i<arr.length;i++)
	{
		product = product*arr[i];
	}
	System.out.println(product);

	
	}	
}
