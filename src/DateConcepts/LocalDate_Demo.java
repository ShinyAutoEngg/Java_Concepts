package DateConcepts;

import java.time.*;
import java.util.Date;
public class LocalDate_Demo
{
	public static void main(String[] args) 
	{
		LocalDate ld = LocalDate.now();
		LocalDateTime ldt=LocalDateTime.now();
		LocalTime lt=LocalTime.now();
		
		System.out.println("LocalDate :"+ld);
		System.out.println("LocalDateTime :"+ldt);
		System.out.println("LocalTime:"+lt);
		
	}
}
