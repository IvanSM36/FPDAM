package Tema09.Fechas.Relacion1;

import java.time.LocalDate;

public class Ejercicio01 {

	public static void main(String[] args) {

		LocalDate fecha = LocalDate.parse("2020-11-13");
		
		System.out.println("Año: " + fecha.getYear());
		System.out.println("Mes: " + fecha.getMonth());
		System.out.println("Dia: " + fecha.getDayOfMonth());
	}

}
