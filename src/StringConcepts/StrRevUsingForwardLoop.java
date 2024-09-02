package StringConcepts;

public class StrRevUsingForwardLoop 
{
	public static void main(String[] args) 
	{
		String s="Chennai";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
	}
}
