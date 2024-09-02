package Collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo 
{
	public static void main(String[] args)
	{
		//Duplicates are not allowed
		//Sorting is done  
		TreeSet<String> ts = new TreeSet<>();
		ts.add("shiny");
		ts.add("Ingrid");
		ts.add("Stoney");
		ts.add("Armando");
		ts.add("shiny");
		System.out.println(ts);
		
		String[] s=new String[ts.size()];
		int i=0;
		for(String n : ts)
		{
			s[i++]=n;
		}
		System.out.println(Arrays.toString(s));
		System.out.println(s[3]);
		
	}
}
