package StringConcepts;

public class StrExtractNumbersAndAdd 
{
	public static void main(String[] args)
	{
		String s="gkgkj23434%%@@k12g*&^";
		char[] ch=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			
			char c=ch[i];
			if(c>='0' && c<='9')
			{
				System.out.print(c);
				sum=sum+c-'0';
				
			}
			
		}
		System.out.println();
		System.out.println("sum :"+sum);
	}
}
