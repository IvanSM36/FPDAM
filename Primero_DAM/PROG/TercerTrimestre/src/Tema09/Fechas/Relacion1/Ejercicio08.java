package Tema09.Fechas.Relacion1;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ejercicio08 {

	public static void main(String[] args) {

		LocalTime hora = LocalTime.now();
		
		System.out.println("Hora actual: " + hora);
		System.out.println("Hora restando 2h 10min 20seg: " + hora.minusHours(2).minusMinutes(10).minusSeconds(20));
		System.out.println("Hora sumando 12h: " + hora.plusHours(12));
		
	}

}
