package StringConcepts;

public class StrExtractNumbersFromAString 
{
	public static void main(String[] args) 
	{
		String s="hkhkh@#@#@23klnjk3422!!7";
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				System.out.print(ch[i]+" ");
			}
		}
		System.out.println();
		for(int j=0;j<ch.length;j++)
		{
			if(Character.isAlphabetic(ch[j]))
			{
				System.out.print(ch[j]);
			}
		}
		System.out.println();
		for(int n=0;n<ch.length;n++)
		{
			char c=ch[n];
			if(!(c>='a'&& c<='z') && !(c>='0'&&c<='9'))
			{
				System.out.print(c);
			}
		}
	}
}
