package StreamConcepts;

import java.util.Arrays;

public class Stream_UsageOfFilterMethod 
{
	public static void main(String[] args)
	{
		int[] a= {45,77,22,32,56,11,73};
		
		//========Print a specific number from array==========
		int[] num=Arrays.stream(a).filter(n-> n==22).toArray();
		System.out.println(Arrays.toString(num));
		
		
		//==============To find even numbers in an array=========
		int[] even =Arrays.stream(a).filter(n->n%2==0).toArray();
		
		//To print as array
		System.out.println(Arrays.toString(even));
		
		//To print each element in the array
		for(int e : even)
		{
			System.out.print(e+",");
		}
		System.out.println();
		
		//=========To find odd number in an array============
		int[] odd =Arrays.stream(a).filter(n->n%2!=0).toArray();
		System.out.println(Arrays.toString(odd));
	}
}
