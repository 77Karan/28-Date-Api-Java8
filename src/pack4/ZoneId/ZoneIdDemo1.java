package pack4.ZoneId;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIdDemo1 
{
	public static void main(String[] args) 
	{
		ZoneId zi = ZoneId.of("America/Cuiaba");
		System.out.println(zi);
		System.out.println("=========================");
		
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		for(String zoneId : zoneIds)
		{
			System.out.println(zoneId);
		}
		System.out.println("=========================");

		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("Current Zone Date and Time:>> "+zdt);
		System.out.println("=========================");

		System.out.println("Year of my fetched Zone >> "+zdt.getYear());
		System.out.println("Month of my fetched Zone >> "+zdt.getMonthValue());
		System.out.println("Day of my fetched Zone >> "+zdt.getDayOfMonth());

		
	}
	

}
