package advanced.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestData {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		DayOfWeek day = localDate.getDayOfWeek();
		
		System.out.println(day);
		System.out.println(LocalDate.now());
		
		System.out.println(localDate.plusDays(12));
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println(localDateTime);
		
		System.out.println(localDateTime.plusMinutes(60));
		
		LocalTime time = LocalTime.of(18, 04);
		System.out.println(time);
		
	}

}
