package Blueprint;

public class compareToMethodDemo implements Comparable
{
	String name;
	int id;
	
	compareToMethodDemo(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public String toString()
	{
		return name+"\t"+id;
	}
	
	
	public int compareTo(Object o)   //compareTo take argument of Object
	{
		compareToMethodDemo obj=(compareToMethodDemo)o;  //downcasting 
		if(this.id>obj.id)
		{
			return 1;
		}
		else if(this.id<obj.id)
		{
			return -1;
		}
		else	
		return 0;
	}
}
