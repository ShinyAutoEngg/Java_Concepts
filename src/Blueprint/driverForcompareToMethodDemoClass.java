package Blueprint;

import java.util.ArrayList;
import java.util.Collections;

public class driverForcompareToMethodDemoClass
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList<>();
		al.add(new Student("Vivek",89));
		al.add(new Student("Sindhu",78));
		
		System.out.println(al);
		
		Collections.sort(al);
		Collections.reverse(al);
		System.out.println(al);
		
		/*
		 * Comparable --->class implements comparable type
		 * String, Integer, Boolean, etc of Wrapper Class are comparable type
		 * To do sorting - elements should be of homogenous and implement comparable interface
		 * Convert HashSet to TreeSet =====> to sort a set
		 * Convert HashMap into TreeMap==>to sort a map based on key
		 */
	}
}
