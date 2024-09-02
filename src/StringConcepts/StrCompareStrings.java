package StringConcepts;

public class StrCompareStrings
{
	public static void main(String[] args)
	{
		String s1="Shinygjgj";
	       String s2="Zhfjfjh";  //comparison occurs with the 1st char
	      
	       if(s1.compareTo(s2)>0)
	       {
	           System.out.println("s1 is greater");
	       }
	       else if(s1.compareTo(s2)==0)
	       {
	           System.out.println("s1 and s2 are equal");
	       }
	       else if(s1.compareTo(s2)<0)
	       {
	           System.out.println("s2 is greater");
	       }
	}
}
