package Arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class homogenousArray
{
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		al.add("shiny");
		al.add(5);
		al.add(null);
		al.add(0.5f);
		al.add("ingrid");
		System.out.println(al);
		
		TreeSet<String> ts = new TreeSet<>();
		for(int i=0;i<al.size();i++)
		{
			Object obj=al.get(i);
			if(obj!=null)
			{
				String val=obj.toString();
			ts.add(val);
			}
		}
		System.out.println(ts);
	}
}
