package Tema09.Fechas.Relacion1;

import java.time.LocalDateTime;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		LocalDateTime fechaHora = LocalDateTime.now();
		
		System.out.println("Fecha y hora actual: " + fechaHora);
		System.out.println("Fecha quitando 11 meses: " + fechaHora.minusMonths(11));
		System.out.println("Fecha quitando 123 meses: " + fechaHora.minusMonths(123));
		System.out.println("Fecha y hora añadiendo 83000 min a la actual: " + fechaHora.plusMinutes(83000));	
		System.out.println("Fecha y hora añadiendo 323 semanas a la actual: " + fechaHora.plusWeeks(323) );
	}

}
