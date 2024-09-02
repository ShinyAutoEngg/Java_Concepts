package Blueprint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Assignment_Driver
{
	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList<>();
		al.add(new Assignment_Student("Louis",56,97));
		al.add(new Assignment_Student("Harry",57,95));
		al.add(new Assignment_Student("Zayn",55,94));
		
		System.out.println("========ARRAY LIST=======");
		System.out.println(al);
		
		Comparator c=(o1,o2)->
		{
			Assignment_Student obj1=(Assignment_Student)o1;
			Assignment_Student obj2=(Assignment_Student)o2;
			if(obj1.id<obj2.id)
			{
				return -1;
			}
			else if(obj1.id>obj2.id)
			{
				return 1;
			}
			else
			return 0;	
		};
		
		System.out.println("=========AFTER SORTING BY ID==========");
		Collections.sort(al,c);
		System.out.println(al);
		
		Comparator c1=(o3,o4)->
		{
			Assignment_Student obj3=(Assignment_Student)o3;
			Assignment_Student obj4=(Assignment_Student)o4;
			if(obj3.per<obj4.per)
			{
				return -1;
			}
			else if(obj3.per>obj4.per)
			{
				return 1;
			}
			else
			return 0;	
		};

		System.out.println("=========AFTER SORTING BY ID==========");
		Collections.sort(al,c1);
		System.out.println(al);
		
		Comparator c2=(o5,o6)->
		{
			Assignment_Student obj5=(Assignment_Student)o5;
			Assignment_Student obj6=(Assignment_Student)o6;
			if(obj5.name.compareTo(obj6.name)>1)
			{
				return 1;
			}
			else if(obj5.name.compareTo(obj6.name)<1)
			{
				return -1;
			}
			else
			return 0;	
		};
		System.out.println("=========AFTER SORTING BY NAME==========");
		Collections.sort(al,c2);
		System.out.println(al);
		
		
		System.out.println("=========AFTER REPLACING VALUE AT INDEX 0==========");
		al.set(0, new Assignment_Student("Styles",34,66));
		System.out.println(al);
	}
}
