package Blueprint;

public class compareStudentBasedOnPercentage implements Comparable
{
	String name;
	int id;
	double per;
	
	compareStudentBasedOnPercentage(String name, int id,double per)
	{
		this.name=name;
		this.id=id;
		this.per=per;
	}
	
	public String toString()
	{
		return name+"\t"+id+"\t"+per;
	}
	
	
	public int compareTo(Object o)   //compareTo take argument of Object
	{
		compareStudentBasedOnPercentage obj=(compareStudentBasedOnPercentage)o;  //downcasting 
		if(this.per>obj.per)
		{
			return 1;
		}
		else if(this.per<obj.per)
		{
			return -1;
		}
		else	
		return 0;
	}
}
