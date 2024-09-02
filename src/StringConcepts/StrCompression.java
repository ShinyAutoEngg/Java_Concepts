package StringConcepts;

public class StrCompression {

	public static void main(String[] args) 
	{
		String s="aaaabbbbgggskkklly";
	       int count=1;
	       String temp="";
	       int i;
	       
	       for(i=0;i<s.length()-1;i++)
	       {
	           if(s.charAt(i)==s.charAt(i+1))
	           {
	               count++;
	           }
	           else
	           {
	               temp=temp+s.charAt(i)+count;
	               count=1;
	           }
	       }
	       if(i==s.length()-1)
	       {
	           temp=temp+s.charAt(i)+count;
	       }
	       System.out.println(temp);
	    
	}

}
