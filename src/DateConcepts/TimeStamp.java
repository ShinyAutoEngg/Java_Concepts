package DateConcepts;

import java.util.Date;

public class TimeStamp
{
	public static void main(String[] args)
	{
		//Conventinal method to get all the details
//		Date dateObj = new Date();
//		System.out.println(dateObj);
		
		//Getting details by replacing : with _
		String AllDetails = new Date().toString().replace(" ", "_").replace(":", "_");
		System.out.println(AllDetails);
		
		
		
		
	}
}
