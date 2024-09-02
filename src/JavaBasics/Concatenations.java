package JavaBasics;

public class Concatenations 
{
	public static void main(String[] args) 
	{
		String s1="Madhuri";
		String s2 ="Sindhu";
		char c1 = 'a';
		char c2='b';
		int n1 = 10;
		int n2=20;
		char x=100;
		
		//String + String = String
		String s3 = s1+s2;
		System.out.println(s3);//MadhuriSindhu
		
		//String + Char = String
		System.out.println(s1+c1);//Madhuria
		
		//String + Number = String 
		System.out.println(s2+n1); //Sindhu10
		
		//Number + Number = Number 
		System.out.println(n1+n2); //30
		
		//Character + Character = Number
		System.out.println(c1+c2); //195
		/*
		 * Each character is associated with a unique 7-bit code,
		 *  ranging from 0 to 127. 
		 *  The ASCII values of the alphabet vary from 65 to 90 for uppercase letters and from 97 to 122 for lowercase letters
		 */
		
		//Character + Number = number
		System.out.println(c1+n1);
		
		//Char + num = number
		System.out.println(n2+x);
	}
}
