package Pratice;

public class string_charSeperation {

	public static void main(String[] args)
	{
		
		String s = "shi##dsdfsdy@#12%%%asdsad3";
		String digits ="";
		String alphabets="";
		String SpecialChar="";
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				digits=digits+ch;
			}
			else if(ch>='0' && ch<='9')
			{
				alphabets = alphabets+ch;
			}
			else if(!(ch>='a' && ch<='z') && !(ch>='0' && ch<='9'))
			{
				SpecialChar = SpecialChar+ch;
			}
			
		}
		System.out.println(digits);
		System.out.println(alphabets);
		System.out.println(SpecialChar);

	}

}
