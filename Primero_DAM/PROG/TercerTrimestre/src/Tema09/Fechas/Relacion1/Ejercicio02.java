package Tema09.Fechas.Relacion1;

import java.time.LocalDate;

public class Ejercicio02 {

	public static void main(String[] args) {

		LocalDate fecha = LocalDate.parse("2020-11-13T15:47:29");
		
		System.out.println("Año: " + fecha.getYear());
		System.out.println("Mes: " + fecha.getMonth());
		System.out.println("Dia: " + fecha.getDayOfMonth());
	}

}
