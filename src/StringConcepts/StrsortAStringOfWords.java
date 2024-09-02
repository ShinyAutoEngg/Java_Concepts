package StringConcepts;

import java.util.Arrays;

public class StrsortAStringOfWords 
{
	public static void main(String[] args)
	{
		 String s="she is a fantasy";
	        String[] str=s.split(" ");
	        for(int i=0;i<str.length;i++)
	        {
	            String temp="";
	            for(int j=i+1;j<str.length;j++)
	            {
	                if((str[i].compareTo(str[j]))>0)
	                {
	                    temp=str[i];
	                    str[i]=str[j];
	                    str[j]=temp;
	                }
	            }
	        }
	        System.out.println(Arrays.toString(str));
	}
}
