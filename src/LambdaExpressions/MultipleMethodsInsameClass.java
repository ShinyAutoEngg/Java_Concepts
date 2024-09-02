package LambdaExpressions;

public class MultipleMethodsInsameClass 

{
	public static void main(String[] args) 
	{
		I2 ref = (a,b)->
		{
			System.out.print(a+" ");
			System.out.print(b+" ");
			System.out.println(a+b);
		};
		ref.add(3,5);
		ref.add(6, 7);
		
		I2 ref2 =(a,b)->
		{
			System.out.println(a+b);
		};
		ref2.add(8, 2);
	}
}
