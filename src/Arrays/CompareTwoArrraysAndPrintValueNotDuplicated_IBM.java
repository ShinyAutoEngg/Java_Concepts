package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CompareTwoArrraysAndPrintValueNotDuplicated_IBM 
{
	public static void main(String[] args) 
	{
		  int[] a={10,20,30,40,50,60};
	      int[] b={20,25,30,40,50,65,70};
	      //  {10,25,60,65,70}
	        ArrayList<Integer> al = new ArrayList<>();
	      HashMap<Integer,Integer> hmap = new HashMap<>();
	      for(int i=0;i<a.length;i++)
	      {
	    	  if(hmap.containsKey(a[i]))
	    	  {
	    		  hmap.put(a[i], hmap.get(hmap));
	    	  }
	    	  else
	    	  {
	    		  hmap.put(a[i], 1);
	    	  }
	      }
	      for(int j=0;j<b.length;j++)
	      {
	    	  if(hmap.containsKey(b[j]))
	    	  {
	    		  hmap.put(b[j], hmap.get(b[j])+1);
	    	  }
	    	  else
	    	  {
	    		  hmap.put(b[j], 1);
	    	  }
	      }
	      
	      for(Map.Entry<Integer,Integer> data : hmap.entrySet())
	      {
	    	  if(data.getValue()==1)
	    	  {
	    		 al.add(data.getKey());
	    	  }
	      }
	      
	      Collections.sort(al);
	      System.out.println(al);
	}
}
