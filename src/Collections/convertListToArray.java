package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertListToArray {

	public static void main(String[] args) 
	{
		// Create a Collection
		//ArrayList music = new ArrayList<>(); this also works similar to List<String> return type
		List<String> music=new ArrayList<>();
		music.add("violin");
		music.add("Guitar");
		music.add("keyboard");
		System.out.println(music);
		
		//convert collection to arrayList
		String[] musicArray=music.toArray(new String[0]);
		System.out.println(Arrays.toString(musicArray));
		//System.out.println(musicArray); gives the address
		for(String s: musicArray)
		{
			System.out.println(s);
		}
		
		List<Integer> intList=Arrays.asList(1,2,3,4,5,6);
		System.out.println(intList);
		System.out.println(intList.get(1));
	}

}
