package Pratice;

import java.util.Scanner;

abstract
public class fibonacciSeries {

	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int upto= sc.nextInt();
		
		for(int i=0;i<=upto;i++)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
	}
}
