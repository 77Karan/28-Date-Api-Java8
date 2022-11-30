package pack1.LocalTime;

import java.time.LocalTime;

public class LocalTimeDemo1 
{
	public static void main(String[] args) 
	{
		LocalTime lt1 = LocalTime.now();
		System.out.println("Current time >> "+lt1);
		System.out.println("======================================");
		
		
		lt1 = LocalTime.of(8,30,13);
		System.out.println("My time >> "+lt1);
		System.out.println("======================================");
		
		
		  lt1 = LocalTime.parse("09:30:21"); 
		  System.out.println("My time time >> "+lt1);
		  System.out.println("======================================");
		 
		
		lt1 = lt1.plusSeconds(12);
		System.out.println("Adding 12 seconds to my time >> "+lt1);
		System.out.println("======================================");
		
		lt1 = lt1.plusMinutes(10);
		System.out.println("Adding 10 minutes to my time >> "+lt1);
		System.out.println("======================================");
		
		lt1 = lt1.plusHours(2);
		System.out.println("Adding 2 hours to my time >> "+lt1);
		System.out.println("======================================");
		
		
		
		  boolean isAfter =
		  LocalTime.parse("08:30:30").isAfter(LocalTime.parse("13:30:31"));
		  System.out.println("Is My Time after 13:30:31 >> "+isAfter);
		  System.out.println("======================================");
		  
		  
		  boolean isBefore =
		  LocalTime.parse("08:30:30").isBefore(LocalTime.parse("13:30:31"));
		  System.out.println("Is My Time before 13:30:31 >> "+isBefore);
		  System.out.println("======================================");
		 
		
		
	}

}
