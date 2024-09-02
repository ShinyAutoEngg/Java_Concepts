package StringConcepts;

public class StrrevStringExceptSpecialChar 
{
	public static void main(String[] args) 
	{
		String s="sh$in@y^23ing%7r!i2d3";
		String s1=s.replaceAll("", "");
		int l =s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if((ch>='a'&&ch<='z') || (ch>='0'&&ch<='9'))
			{
				System.out.print(s1.charAt(l--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
