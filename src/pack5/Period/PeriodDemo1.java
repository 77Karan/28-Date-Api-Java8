package pack5.Period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo1 
{
	public static void main(String[] args)
	{
		Period period = Period.ofDays(5);
		System.out.println(period);
		
	    period = Period.ofMonths(5);
		System.out.println(period);
		
		period = Period.ofYears(2);
		System.out.println(period);
		
		System.out.println("Finding Diffrencr bw 2 dates");
		Period p = Period.between(LocalDate.parse("1991-05-20"),LocalDate.now());
		System.out.println("The diffrence is "+p);
		
		
		
		
	}

}
