package zaula;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Programa {
	
	public static void main(String[] args) {
		
		
		LocalDate d01 = LocalDate.parse("2024-10-14");
		LocalDateTime d02 = LocalDateTime.parse("2024-10-14T10:00:00");
		
		
		LocalDate semanaPassadaLocalDate = d01.minusDays(7);
		LocalDate proximaSemanaLocalDate = d01.plusDays(7);
		
		System.out.println(semanaPassadaLocalDate);
		System.out.println(proximaSemanaLocalDate);
		
		
		LocalDateTime semanaPassadaLocalDateTime = d02.minusHours(10);
		LocalDateTime proximaSemanaLocalDateTime = d02.plusHours(7);
		
		System.out.println(semanaPassadaLocalDateTime);
		System.out.println(proximaSemanaLocalDateTime);
		
		Duration t1 = Duration.between(semanaPassadaLocalDate.atTime(0,0), d01.atTime(0,0));
		System.out.println(t1.toDays());

		
		
	}
}
