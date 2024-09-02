package Blueprint;

public class studentTypeArray 
{
	public static void main(String[] args)
	{
		Student[] s1=new Student[3];
		s1[0]=new Student("Shiny",35);
		s1[1]=new Student("Sindhu",25);
		for(Student s : s1)
		{
			System.out.println(s);    //3rd value will be null by default if no value is passed
		}
	}
}
