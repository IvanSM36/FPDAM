package Tema09.Fechas.Relacion1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ejercicio07 {

	public static void main(String[] args) {
				
		LocalDate fecha = LocalDate.of(2020, 10, 22);
		LocalDate fecha2 = LocalDate.parse("2020-10-22");
		LocalTime hora = LocalTime.now();
		
		System.out.println(hora.atDate(fecha2));
		System.out.println(hora.atDate(LocalDate.of(2020, 10, 22)));
		System.out.println(hora.atDate(LocalDate.parse("2020-10-22")));
		
	}

}
