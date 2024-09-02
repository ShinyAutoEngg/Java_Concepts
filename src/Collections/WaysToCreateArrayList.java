package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaysToCreateArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Object> al = new ArrayList<>();
		al.add(null);
		al.add(16);
		al.add("Ayaan");
		al.add(0.9f);
		System.out.println(al);
		
		
		List<String> ls = new ArrayList<>();
		ls.add("Anoukhi");
		ls.add("Ayaan");
		ls.add("Thamantha");
		ls.add("Thabitha");
		System.out.println(ls);
		
		List<Integer> iAl =Arrays.asList(10,34,56);   
	//	ArrayList<Integer> ial = (ArrayList<Integer>) Arrays.asList(10,20,30); //typecast
		System.out.println(iAl);
		for(int n:iAl)
		{
			System.out.println(n);
		}
	}
}
