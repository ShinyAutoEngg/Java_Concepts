package Casting;

public class Parent 
{
	int a=10;
	public void pmtd1(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
		System.out.println("parent method 1");
	}
	
	public void pmtd2(String name)
	{
		System.out.println("Parent method 2 :"+name);
	}
}
