package Tema09.Fechas.Relacion1;

import java.time.LocalDateTime;

public class Ejercicio09 {

	public static void main(String[] args) {

		LocalDateTime fechaHora = LocalDateTime.now();
		
		System.out.println("Mes: " + fechaHora.getMonth());
		System.out.println("Mes (numero): " + fechaHora.getMonthValue());
		System.out.println("Dia del mes:" + fechaHora.getDayOfMonth());
		System.out.println("Dia del año:" + fechaHora.getDayOfYear());
		System.out.println("Hora: " + fechaHora.getHour());
		System.out.println("Minutos: " + fechaHora.getMinute());
		System.out.println("Segundos: " + fechaHora.getSecond());
		System.out.println("Nanosegundos: " + fechaHora.getNano());
		
	}

}
