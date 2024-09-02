package Arrays;

import java.util.ArrayList;

public class RevIntArray 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6};
		
		ArrayList<Integer> al= new ArrayList<>();
		
		for(int i=a.length-1;i>=0;i--)
		{
			al.add(a[i]);
		}
		
		System.out.println(al);
	}
}
