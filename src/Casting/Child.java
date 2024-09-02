package Casting;

public class Child extends Parent
{
	public void cMtd1()
	{
		System.out.println("Child method 1");
	}
	
	public static void main(String[] args) 
	{
		Parent p=new Child();  // we can get properties of par only
	    p.pmtd1(3,5);
	    p.pmtd2("suhas");
	    System.out.println(p.a);
	
		Child c=(Child)p;// both
		c.pmtd1(7,7);
		c.pmtd2("ansari");
		c.cMtd1();
		
	}
}
