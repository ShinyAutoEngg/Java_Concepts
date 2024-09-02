package Pratice;

public class printingLetterOrDigitFromString 
{
	public static void main(String []args) 
	{
		String s ="shiny23ingrid";
		
		String s1 = new String("shin34y@$");
		char[] carray = s1.toCharArray();
		System.out.println(carray);
		
		for(char c: carray)
		{
			if(Character.isLetterOrDigit(c))
			{
				System.out.println(c);
			}
		
				
		}
	}

	
}
