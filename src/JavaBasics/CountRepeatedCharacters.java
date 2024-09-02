package JavaBasics;

public class CountRepeatedCharacters 
{
	public static void main(String[] args) 
	{
		
		String s ="animalkingdom";
		int l=s.length();
		for(char c='a';c<='z';c++)
		{
			
			int count = 0;
			
			for(int i=0;i<=l-1;i++)
			{
				if(c==s.charAt(i))
				count++;
			}
			
			if(count>1)
			{
				System.out.println("Count of "+c+" is "+count);
			}
			
		}
			

	}
}
