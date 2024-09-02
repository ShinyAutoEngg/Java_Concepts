package Pratice;

public class string_concepts 
{
	public static void main(String[] args) 
	{
		String s = "abracadabra";
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reversed String is :"+rev);
		System.out.println();
		
		//duplicates
		
		for(char ch='a';ch<='z';ch++)
		{ 	
			int count =0;
			
			for(int j=0;j<=s.length()-1;j++)
			{
				if(ch==s.charAt(j))
				{
					count++;
					
				}
				
			}
			if(count>1)
			{
			System.out.println(ch+" is a duplicate and has "+(count-1)+" duplicates");
			
			}
		}
		
		System.out.println();
		
		//finding the vowels
		
		String v ="aeiou";
		
		for(int m=0;m<=v.length()-1;m++)
		{
			int countSec=0;
			
			char ch1=v.charAt(m);
			
			for(int n=0;n<=s.length()-1;n++)
			{
				if(ch1==s.charAt(n))
				{
					countSec++;
				}
			}
			if(countSec>0)
			{
				System.out.println("The vowel present in the String is :"+ch1);
				System.out.println(ch1+ " is present "+countSec+" times");
			}
		}
		
	}
}
