package Pratice;

public class string_charSep_InBuilt {

	public static void main(String[] args)
	{
		
		String s="hg435jjjkk@@@bjk##";
		String num="";
		String alpha="";
		String special="";
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch =s.charAt(i);
			
			if(Character.isAlphabetic(ch))
			{
				alpha=alpha+ch;
			}
			else if(Character.isDigit(ch))
			{
				num=num+ch;
			}
			else if(!(ch>='a' && ch<='z')  &&  !(ch>='0' && ch<='9') )
			{
				special=special+ch;
			}
		}
		System.out.println(num);
		System.out.println(alpha);
		System.out.println(special);

	}

}
