package Pratice;

public class smallestNum 
{
	
public static void main(String[] args)
{
	int[] a={1,5,7,2,8,9};
	int l=a.length;
	int smallest=a[0];
	
	for(int i=1;i<=l-1;i++)
	{
		if(smallest>a[i])
		
			smallest=a[i]; 
		
	}
	
	System.out.println(smallest);
}
	
}
