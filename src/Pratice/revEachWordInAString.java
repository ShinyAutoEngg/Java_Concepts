package Pratice;

public class revEachWordInAString
{
	public static void main(String[] args)
	{
		String s="Life is beautiful";
		
		String[] s1=s.split(" "); // Life is beautiful
		
		String s2=" ";
		
		for(int i=0;i<=s1.length-1;i++)
		{
			s2=s1[i];//life
			
			for(int j=s2.length()-1;j>=0;j--)
			{
				System.out.println(s2.charAt(j));
			}
			
			//if(i<s1.length-1)
				System.out.println(" ");
		}

		

	}
}
