package StringConcepts;

import java.util.Arrays;

public class StrAnagram 
{
	public static void main(String[] args) 
	{
	  String s1="pot";
	  String s2="top";
	  char[] ch1=s1.toCharArray();
	  char[] ch2=s2.toCharArray();
	  if(s1.length()==s2.length())
	  {
		  Arrays.sort(ch1);
		  Arrays.sort(ch2);
		  if(Arrays.equals(ch1, ch2))
		  {
			  System.out.println("Anagram");
		  }
	  }
	  else
	  {
		  System.out.println("Not an anagram");
	  }
	}
}
