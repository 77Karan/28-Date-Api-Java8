package pack1.LocalDate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo1 
{
	public static void main(String[] args)
	{
		LocalDate ld1 = LocalDate.now();
		System.out.println("Current Date 1 >>"+ld1);
		System.out.println("========================");
		
		ld1 = LocalDate.of(1994,12,11);
		System.out.println("My date 2 >>"+ld1);
		System.out.println("========================");
		
		ld1 = LocalDate.of(1994,Month.DECEMBER,12);
		System.out.println("My date 3 >>"+ld1);
		System.out.println("========================");
		
		
		ld1= LocalDate.parse("1947-08-15");
		System.out.println("Parse date 4 >>"+ld1);
		System.out.println("========================");
		
		ld1 = ld1.plusDays(10);
		System.out.println("Adding 10 days to my date >>"+ld1);
		System.out.println("========================");
		
		ld1 = ld1.plusMonths(12);
		System.out.println("Adding 12 months to My date >>"+ld1);
		System.out.println("========================");
		
		boolean isBefore = LocalDate.parse("1994-12-11").isBefore(LocalDate.parse("1991-01-12"));
		System.out.println("Is My birth date before 1991 ? >>"+isBefore);
		System.out.println("========================");
		
		boolean isAfter = LocalDate.parse("1994-12-11").isAfter(LocalDate.parse("1991-01-12"));
		System.out.println("Is My birth date after 1991 ? >>"+isAfter);
		System.out.println("========================");
		
		
		
	}

}
