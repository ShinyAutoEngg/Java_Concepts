package LambdaExpressions;

public class MultipleStatementsImplementingI1 
{
	public static void main(String[] args) 
	{
		I1 ref=()->
		{
			System.out.println("Hello");
			System.out.println("Hi");
			System.out.println("Hey");
		};
		ref.demo();
		
		I1 ref1=()->System.out.println("welcome");
		ref1.demo();
	}
}
