package Tema09Fecha.Prueba;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Prueba03 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);	
		
		LocalDateTime fechaHora = LocalDateTime.now();
		LocalDate fechaActual = LocalDate.now();
		
		
		System.out.print("Introduzca fecha de cumpleano (dd-mm-aaaa): ");
		String cumpleano = scan.next();	
		LocalDate fechaCumple = LocalDate.parse(cumpleano);
		
		System.out.println("Tu dia fue un: " + fechaCumple.getDayOfWeek());
		
		System.out.println("Formatro iso 8601: " + fechaActual);	
		
		// Sumamos 1 dia	
		System.out.println("La semana que viene será: " + fechaActual.plusDays(1).plusWeeks(1));
		System.out.println("El año que viene: " + fechaActual.plusYears(1));
	}	

}
