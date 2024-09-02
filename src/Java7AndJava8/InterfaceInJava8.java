package Java7AndJava8;

public interface InterfaceInJava8 
{
	static void staticMtd()
	{
		System.out.println("Static Interface");
	}
	
	default void defaultMtd()
	{
		System.out.println("Default Method");
	}
}
