package StringConcepts;

public class FirstLetterToUpperCase {
	public static void main(String[] args) {
		String s="welcome to chennai";
		String[] str= s.split(" ");
		for(int i =0;i<str.length;i++)
		{
			String word=str[i];
		word=Character.toUpperCase(word.charAt(0))+word.substring(1);
		System.out.print(word+" ");
			
		}
		
	}

}
