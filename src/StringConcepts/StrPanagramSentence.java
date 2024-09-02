package StringConcepts;

import java.util.LinkedHashSet;

public class StrPanagramSentence 
{
	 public static void main(String[] args) 
	    {
	       
	       String s="the quick brown fox jumps over the lazy dog";
	       String s1=s.replaceAll(" ","");
	       LinkedHashSet<Character> lhs=new LinkedHashSet<>();
	       for(int i=0;i<s1.length();i++)
	       {
	           lhs.add(s1.charAt(i));
	       }
	       System.out.println(lhs);
	       int count=lhs.size();
	       System.out.println(count);
	       if(count==26)
	       {
	           System.out.println("Sentence is a panagram");
	       }
	       else
	       {
	           System.out.println("sentence is not a panagram");
	       }
	    }
}
