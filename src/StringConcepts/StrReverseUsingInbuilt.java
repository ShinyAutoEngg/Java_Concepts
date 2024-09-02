package StringConcepts;

import java.util.ArrayList;
import java.util.Collections;

public class StrReverseUsingInbuilt 
{
	public static void main(String[] args) 
	{
		String s="Bangalore";
		char[] ch=s.toCharArray();
		ArrayList<Character> al= new ArrayList<>();
		for(int i=0;i<ch.length;i++)
		{
			al.add(ch[i]);
		}

		Collections.reverse(al);
		System.out.println(al);  //[e, r, o, l, a, g, n, a, B]
		
		StringBuffer sbr = new StringBuffer();
		for(int j=0;j<al.size();j++)
		{
			sbr.append(al.get(j));
		}
		System.out.println(sbr);   //erolagnaB
	}
}
