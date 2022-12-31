package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class Program {
	public static void main (String [] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		
		LocalDate d01 = LocalDate.now(); 
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); 
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		LocalDate d12 = LocalDate.parse("2022-07-20");
		LocalDateTime d13 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d14 = Instant.parse("2022-07-20T01:30:26Z");
		
		System.out.println("Local Date (local): "+d01.toString());
		System.out.println("Local Date Time (local): "+d02.toString());
		System.out.println("Local Date (Global): " +d03.toString());
		System.out.println("Texto ISO 8601 -> Data Hora: " +d04.toString());
		System.out.println("Texto ISO 8601 -> Data Hora Time: " +d05.toString());
		System.out.println("Texto ISO 8601 -> Instant: " +d06.toString());
		System.out.println("Texto ISO 8601 -> Instant -3GMT: " +d07.toString()); 
		System.out.println("Texto formato customizado -> Data Hora: " +d08.toString());
		System.out.println("Texto formato customizado -> Data Hora: " +d09.toString());
		System.out.println("dia, mês, ano -> Data Hora: " +d10.toString());
		System.out.println("dia, mês, ano, hora, minuto -> Data Hora: " +d11.toString());
		
		System.out.println("____________________________________________\n");
		
		System.out.println("Texto formatado: " +d12.format(fmt1));
		System.out.println("Texto formatado: " +fmt1.format(d12));
		System.out.println("Texto formatado: " +d12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Texto formatado c/ hora: " +d13.format(fmt2));
		System.out.println("Texto formatado c/ hora with Zone (Instant): " +fmt3.format(d14));
		System.out.println("ISO DATE TIME: " +d13.format(fmt4));
		System.out.println("ISO INSTANT: " +fmt5.format(d14));
		
	}

}
