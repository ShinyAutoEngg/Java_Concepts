package Arrays;

import java.lang.reflect.Array;

public class myDemo {

	public static void main(String[] args) 
	{
		
		int[] a= {3,4,5,7,8,2};
		System.out.println("Element is present at index :"+search(a,8));
		System.out.println("Element at given index is :"+Array.get(a, 2));
		
	}
	
	public static int search(int[]a, int s)
	{
		for(int i=0;i<a.length-1;i++)
			if(a[i]==s)
			{
		return i;
			}
		return -1;
	}
	


}
