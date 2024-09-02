package StringConcepts;

public class StrAltLettersUpperCase 
{
	public static void main(String[] args) 
	{
		String s="shinyingrid";
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i%2==0)
			{
				temp=temp+Character.toUpperCase(ch);
			}
			else
			{
				temp=temp+ch;
			}
		}
		System.out.println(temp);
	}
}
