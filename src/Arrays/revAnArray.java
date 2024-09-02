package Arrays;

import java.util.ArrayList;

public class revAnArray 
{
	public static void main(String[] args) 
	{
		  int[] a={3,5,6,7,7,8,2};
	      String rev="";
	      for(int i=a.length-1;i>=0;i--)
	      {
	          rev=rev+a[i];
	      }
	     // System.out.println(rev);
	      ArrayList<Character> al= new ArrayList<>();
	      for(int j=0;j<rev.length();j++)
	      {
	          al.add(rev.charAt(j));
	      }
	      
	      System.out.println(al);
	    }
	}

