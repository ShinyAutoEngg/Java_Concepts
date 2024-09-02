package Blueprint;

import java.util.ArrayList;
import java.util.Collections;

public class driverForcompareStudentBasedOnPercentage
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList<>();
		al.add(new compareStudentBasedOnPercentage("Aditya",89,98));
		al.add(new compareStudentBasedOnPercentage("Becham",78,88));
		
		//System.out.println(al);
		
		Collections.sort(al);
		//Collections.reverse(al);
		System.out.println(al);
	}
	
	
}
