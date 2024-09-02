package StringConcepts;

import java.util.LinkedHashSet;

public class StrRemoveDuplicates 
{
	public static void main(String[] args) 
	{
		String s="abhjsssdkssskkljuuurr";
		
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			lhs.add(s.charAt(i));
		}
		
		System.out.println(lhs);
	}
}
