package StringConcepts;

public class StrCountOfUpperAndLowerCaseCharacter 
{
	public static void main(String[] args) 
	{
		String s="I am a traVeLLer";
		String s1=s.replaceAll(" ", "");
		System.out.println(s1);
		int count=0;
		int count1=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(Character.isUpperCase(c))
			{
				count++;
			}
			if(Character.isLowerCase(c))
			{
				count1++;
			}
		}
		System.out.println("Upper case count :"+count);
		System.out.println("Lower case count :"+count1);
	}
}
