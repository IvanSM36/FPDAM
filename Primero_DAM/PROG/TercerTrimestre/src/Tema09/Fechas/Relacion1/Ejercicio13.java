package Tema09.Fechas.Relacion1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ejercicio13 {

	public static void main(String[] args) {

		LocalDate fecha1 = LocalDate.of(2000, 01, 01);
		LocalDate fecha2 = LocalDate.of(2022, 03, 20);
		
		int anio1 = fecha1.getYear();
		int anio2 = fecha2.getYear();
		System.out.println("Diferencia en años: " + (anio2 - anio1));
		int mes1 = fecha1.getMonthValue();
		int mes2 = fecha2.getMonthValue();
		System.out.println("Diferencia en meses: " + (mes2 - mes1));
		int dia1 = fecha1.getDayOfMonth();
		int dia2 = fecha2.getDayOfMonth();
		System.out.println("Diferencia en dias: " + (dia2 -dia1));
	}

}
