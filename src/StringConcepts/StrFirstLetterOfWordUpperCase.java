package StringConcepts;

public class StrFirstLetterOfWordUpperCase 
{
	public static void main(String[] args) {
		
		String s="where are you from";
		String[]  str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String word=str[i];
			word=Character.toUpperCase(word.charAt(0))+word.substring(1);
			System.out.print(word+" ");
		}
	}
	
}
