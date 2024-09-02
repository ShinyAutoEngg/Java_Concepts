package Arrays;

import java.lang.reflect.Array;

public class linearSearch {
	
	public static int search(int[]a,int s)
	{
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==s)
			{
				return i;
			}
		}
		
		return -1;
	}
	

	
	public static void main(String args[])
	{
		int[] a= {5,7,8,4,3,9};
		
		//static method search is called
		System.out.println("Element is present at :"+search(a,8));
		
		//to get the value at a specific index
		System.out.println("Element at index is:" + Array.getInt(a, 2));
		
		
	}
}