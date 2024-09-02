package Java7AndJava8;

public class InterfaceImplementation implements InterfaceInJava8

{
	@Override
	public void defaultMtd() 
	{
		System.out.println("<=====printing defaukt method=====>");
	}

	public static void main(String[] args)
	{
		InterfaceImplementation obj = new InterfaceImplementation();
		obj.defaultMtd();
	}
	

	
}
