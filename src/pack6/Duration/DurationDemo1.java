package pack6.Duration;

import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo1 
{
	public static void main(String[] args) 
	{
		Duration d = Duration.between(LocalTime.parse("12:14"),LocalTime.parse("13:15"));
		System.out.println(d);
		
	}

}
