package StringConcepts;

import java.util.Arrays;

public class StrsortAString 
{
	public static void main(String[] args) 
	 {
	      String s="abshkdjuagsklw";
	      char[] ch=s.toCharArray();
	      
	      for(int i=0;i<ch.length;i++)
	      {   char temp=' ';
	          for(int j=i+1;j<ch.length;j++)
	          {
	          if(ch[i]>ch[j])
	          {
	              temp=ch[i];
	              ch[i]=ch[j];
	              ch[j]=temp;
	          }
	          }
	      }
	      System.out.println(Arrays.toString(ch));
		
	    }
}
