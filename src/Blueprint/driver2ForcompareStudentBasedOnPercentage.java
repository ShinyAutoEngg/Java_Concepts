package Blueprint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class driver2ForcompareStudentBasedOnPercentage
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList<>();
		al.add(new compareStudentBasedOnPercentage("Aditya",89,98));
		al.add(new compareStudentBasedOnPercentage("Becham",78,88));
		al.add(new compareStudentBasedOnPercentage("Sahana",91,23));
		
		//Using Comparator interface
		Comparator c=(o1,o2) ->{
			compareStudentBasedOnPercentage obj1 = (compareStudentBasedOnPercentage)o1;
			compareStudentBasedOnPercentage obj2 = (compareStudentBasedOnPercentage)o2;
			if(obj1.per<obj2.per)
			{
				return -1;
			}
			else if(obj1.per > obj2.per)
			{
				return 1;
			}
			else

				return 0;
		};
		
		System.out.println(al);
		
		Collections.sort(al,c);
		
		System.out.println(al);
	}
	
	
}
