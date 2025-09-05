package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt3 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDate d09 = LocalDate.of(2022, 7, 20);
		LocalDateTime d10 = LocalDateTime.of(2022,  7, 20, 1, 30);

		
		System.out.println("D01 = " + d01);
		System.out.println("D02 = " + d02);
		System.out.println("D03 = " + d03);
		System.out.println("D04 = " + d04);
		System.out.println("D05 = " + d05);
		System.out.println("D06 = " + d06);
		System.out.println("D07 = " + d07);
		System.out.println("D08 = " + d08);
		System.out.println("D09 = " + d09);
		System.out.println("D10 = " + d10);
		
		System.out.println("D06 = " + fmt2.format(d06));
		System.out.println("D05 = " + fmt3.format(d03));
		
		
		System.out.println("-------------------------------");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println("-------------------------------");
		
		System.out.println("D04 dia = " + d04.getDayOfMonth());
		System.out.println("D04 mes = " + d04.getMonthValue());
		System.out.println("D04 ano = " + d04.getYear());
		
		System.out.println("-------------------------------");
		
		System.out.println("D05 hora = " + d05.getHour());
		System.out.println("D05 minutos = " + d05.getMinute());


		System.out.println("-------------------------------");

		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

		System.out.println("-------------------------------");

		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		System.out.println("-------------------------------");

		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		System.out.println("-------------------------------");

		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}

}
