package StringConcepts;

public class StrRevWordAndRevChar 
{
	public static void main(String[] args)
	{
		String s="My love for you will never end"; 
		String[] str =s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			String word= str[i]; //end
			String rev="";
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			System.out.print(rev+" ");
		}
	}
}
