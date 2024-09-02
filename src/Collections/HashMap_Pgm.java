package Collections;

import java.util.HashMap;

public class HashMap_Pgm 
{
	public static void main(String[] args)
	{
		HashMap<String, Object> hmap = new HashMap<>();
		hmap.put("name", "Shiny");
		hmap.put("age",35);
		hmap.put("city","Bangalore");
		System.out.println(hmap);
	}
}
