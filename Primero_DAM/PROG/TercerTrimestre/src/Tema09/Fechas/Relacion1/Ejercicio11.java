package Tema09.Fechas.Relacion1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ejercicio11 {

	public static void main(String[] args) {

		LocalDate fecha1 = LocalDate.of(2019, 05, 13);
		LocalDate fecha2 = LocalDate.of(2019, 05, 21);
		
		System.out.println("La diferencia entre las dos fechas es de: "
				+ ChronoUnit.YEARS.between(fecha1, fecha2) + " años."
				+ ChronoUnit.MONTHS.between(fecha1, fecha2) + " meses."
				+ ChronoUnit.DAYS.between(fecha1, fecha2) + " dias.");
		
	}

}
