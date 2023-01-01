package application;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;


public class Program {
	public static void main (String[] args) {
		//converter data-hora global p/ local
		//obter dados de uma data-hora local
		//calculos com data-hora
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); 
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
	/*	for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		*/
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("Convertendo instant em LocalDate: "+r1); 
		System.out.println("Convertendo instant em LocalDate de Portugal: "+r2); 
		System.out.println("Convertendo instant em LocalDate de Portugal: "+r3); 
		System.out.println("Convertendo instant em LocalDate de Portugal: "+r4); 
		
		System.out.println("Dia do mês: "+d04.getDayOfMonth());
		System.out.println("Mês: "+d04.getMonthValue()); 
		System.out.println("Ano: "+d04.getYear());
		System.out.println("Hora: "+d05.getHour());
		System.out.println("Minuto: "+d05.getMinute());
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		System.out.println ("Subtraindo uma semana de uma data: "+pastWeekLocalDate);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		System.out.println ("Adicionando uma semana de uma data: "+nextWeekLocalDate);
		System.out.println ("___________________________________________");
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		System.out.println ("Subtraindo uma semana de uma data TIME: "+pastWeekLocalDateTime);
		System.out.println ("Adicionando uma semana de uma data TIME: "+nextWeekLocalDateTime);
		System.out.println ("___________________________________________");
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println ("Subtraindo uma semana de uma data INSTANT: "+pastWeekInstant);
		System.out.println ("Adicionando uma semana de uma data INSTANT: "+nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05); 
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		Duration t5 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		System.out.println ("___________________________________________");
		System.out.println("Diferença: "+ t1.toDays());
		System.out.println("Diferença: "+ t5.toDays());
		System.out.println("Diferença: " + t4.toDays());
		System.out.println("Diferença: " + t3.toDays());
	}
}
