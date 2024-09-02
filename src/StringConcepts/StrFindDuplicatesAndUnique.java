package StringConcepts;

import java.util.*;

public class StrFindDuplicatesAndUnique 
{
	public static void main(String[] args)
	{
		String s="abcabcdehsabcsjhss";
		HashMap<Character, Integer> hmap = new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(hmap.containsKey(s.charAt(i)))
			{
			    hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
			}
			else
			{
			    hmap.put(s.charAt(i),1);
			}
		}
		System.out.println(hmap);
		
		for(Map.Entry<Character,Integer> data:hmap.entrySet())
		{
		    if(data.getValue()>1)
		    {
		        System.out.print(data.getKey()+" ");
		    }
		}
		System.out.println();
		for(Map.Entry<Character,Integer> data:hmap.entrySet())
		{
		    if(data.getValue()==1)
		    {
		        System.out.print(data.getKey()+" ");
		    }
		}
	}
}
