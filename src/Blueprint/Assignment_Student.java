package Blueprint;

import java.util.Comparator;

public class Assignment_Student 
{
	String name;
	int id;
	double per;
	
	Assignment_Student(String name, int id,double per)
	{
		this.name=name;
		this.id=id;
		this.per=per;
	}
	
	public String toString()
	{
		return name+"\t"+id+"\t"+per;
	}
	
	
}
