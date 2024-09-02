package StringConcepts;

public class StrExpandString 
{
	public static void main(String[] args) {
		String s="a2m4h1k2l1f2";
		
		for(int i=0;i<s.length()-1;i=i+2)
		{
			int count=s.charAt(i+1)-'0';
			for(int j=0;j<count;j++)
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}

