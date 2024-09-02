package Integers;

public class palindromeNumber 
{
	public static void main(String[] args) 
	{
		int num = 121;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;    //0+1
			num=num/10;        //1/10
		}
		if(num==rev)
		{
			System.out.println(num+" is a palindrome");
		}
	}
}
