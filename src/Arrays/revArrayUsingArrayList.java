package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class revArrayUsingArrayList 
{
	public static void main(String[] args) 
	{
		int[] a= {5,6,3,2,1,8,9};
		ArrayList<Integer> al= new ArrayList<>();
		
		for(int i=a.length-1;i>=0;i--)
		{
			al.add(a[i]);
		}
		System.out.println(al);
		
	}
}
