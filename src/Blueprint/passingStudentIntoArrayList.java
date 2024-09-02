package Blueprint;

import java.util.ArrayList;

public class passingStudentIntoArrayList
{
	public static void main(String[] args) 
	{
		ArrayList a= new ArrayList<>();
		a.add(new Student("Vivek",20));
		a.add(new Student("Sindhu",30));
		System.out.println(a);
	}
}
