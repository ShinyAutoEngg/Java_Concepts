package Integers;

public class PrimeNumber_Complex 
{
	public static void main(String[] args) 
	{
		
		int num = 6;
		
		boolean flag = false;

		for (int i = 2; i < num; i++) 
		{
			if (num%i==0)
			{
				flag=true;
				break;
			}
		}
		
		if (num==1) 
		{
			flag = true;
		}
		
		if (flag) 
		{
			System.out.println(num+" --> is not a prime number");
		}else {
			System.out.println(num+" --> is a prime number");
		}
	}
}
