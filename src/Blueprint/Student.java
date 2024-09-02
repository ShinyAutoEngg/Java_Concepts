package Blueprint;

public class Student 
{
	String name;
	int id;
	
	Student(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public String toString()
	{
		return name+"\t"+id;
	}
	/*
	 * This can be written like this and also by using driver class - refer driverForStudentClass
	 */
//	public static void main(String[] args) 
//	{
//		Student obj = new Student("Sumanth",78);
//		System.out.println(obj.toString());
//
//	}
}
