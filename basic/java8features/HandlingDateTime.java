package basic.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HandlingDateTime {
	public static void main(String[] args) {
		LocalDate curreDate = LocalDate.now();
		System.out.println("Current Date : " + curreDate);

		LocalTime currenTime = LocalTime.now();
		System.out.println("Currenrt Time :" + currenTime);

		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current Date and Time :" + current);

		LocalDate ownDate = LocalDate.parse("2011-12-25");
		System.out.println("Setting Date using String :" + ownDate);

		LocalDate ownDate2 = LocalDate.of(2015, Month.JANUARY, 25); // month.0
		System.out.println("Setting Date using int : " + ownDate2);
		

		// Retrieving yesterday and tommorow's day

		LocalDate yesterday = curreDate.minusDays(1);
		System.out.println("Yesterday date : " + yesterday);

		LocalDate tomorrow = curreDate.plusDays(1);
		System.out.println("Tomorrow date : " + tomorrow);

		System.out.println("is Leap year? :" + curreDate.isLeapYear());

		// changing date time format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy" + "HH.mm.ss");
		String formattedDate = current.format(formatter);
		System.out.println("Setting Date-Time pattern: " + formattedDate);

		// handling Zones
		ZonedDateTime currentZoned = ZonedDateTime.now();
		System.out.println("Current date and time with zone :" + currentZoned);

		System.out.println("current Zone : " + currentZoned.getZone());

		// setting tokyo Zone
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");

		ZonedDateTime tokyoZone = currentZoned.withZoneSameInstant(tokyo);
		System.out.println("Tokyo Zone Date Time : " + tokyoZone);
	}

}
