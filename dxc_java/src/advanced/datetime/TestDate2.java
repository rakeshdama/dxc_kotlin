package advanced.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;

public class TestDate2 {
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.of(2021, 04, 18);
		LocalDate dob = LocalDate.of(2000, 04, 18);
		
		Period period = Period.between(dob, today);
		
		System.out.println(period.getYears());
		
		ZoneOffset zoneOffset = ZoneOffset.UTC;
		
		Temporal temp = zoneOffset.adjustInto(ZonedDateTime.now());
		
		System.out.println(temp);
	}

}
