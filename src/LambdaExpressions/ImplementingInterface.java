package LambdaExpressions;

public class ImplementingInterface 
{
	public static void main(String[] args)
	{
		I1 ref = ()->System.out.println("Hello");
		ref.demo();
	}
}
