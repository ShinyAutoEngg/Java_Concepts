package StringConcepts;

public class StrRevSameAsString 
{
	public static void main(String[] args) 
	{
		String s="i am shiny";
		//op y ni hsmai
		
		String s1=s.replaceAll(" ", "");
		System.out.println(s1);   //iamshiny
		
		int l=s1.length()-1;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
			System.out.print(s1.charAt(l--));
			}
			//else(s.charAt(i)=='a')
			{
				System.out.print(s.charAt(i));
			}
		}
		
	}
}
