package Tema09Fecha.Prueba;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Prueba01 {

	public static void main(String[] args) {

		// Obtener la fecha de hoy (basada en el reloj del Sistema) 
		LocalDate fechaActual = LocalDate.now();	
		System.out.print("Fecha actual: " + fechaActual);
		
		System.out.println();
		
		// Obtener una fecha cualquiera indicada
		LocalDate fecha = LocalDate.of(1976, 11, 11);
		System.out.print("Fecha especifica: " + fecha);
		
		System.out.println();
		
		// Para obtener una fecha a partir de un String (formato "aaaa-mm-dd") 
		
		LocalDate fecha2 = LocalDate.parse("2007-12-03");
		System.out.println(fecha2);
		
		System.out.println("-----------------------------");
		
		System.out.println("La fecha actual es: " + LocalDate.now());
		System.out.println("La hota actual es: " + LocalTime.now());
		System.out.println("La fecha y hora actuales son: " + LocalDateTime.now());
		System.out.println("El instante actual es: " + Instant.now());
		System.out.println("La fecha y hora actuales con zona hotaria son: " + ZonedDateTime.now());
			
		System.out.println("-----------------------------");

		System.out.println("Fecha de mi cumpleaños: "  + LocalDate.of(1996, Month.NOVEMBER, 20));
		System.out.println("Con la hora exacta: " + LocalDateTime.of(1996, Month.NOVEMBER, 20, 3, 15, 30, 196));
		System.out.println("Dia bisiesto de 2019: " + LocalDate.of(2019,Month.FEBRUARY, 28));
		
		System.out.println("-----------------------------");
		
		LocalDate f = LocalDate.of(2022, 03, 21);	
		int dia = f.getDayOfMonth();
		int mes = f.getMonthValue();
		int anio = f.getYear();
		System.out.println(dia + "-" + mes + "-" + anio);
		
		System.out.println("-----------------------------");

		System.out.println("La fecha dentro de 20 dias: " + f.plusDays(20));
		System.out.println("Quitando 45 semana: " + f.minusWeeks(45));
		System.out.println("Dia quitando 45 semana: " + f.minusWeeks(45).getDayOfWeek());
		
		System.out.println("-----------------------------");
		
		System.out.println("El primer dia del proximo mes es: " + LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth()).getDayOfWeek());
		
		System.out.println("-----------------------------");

		System.out.println("Ultimo dia de año + 3 meses - 10 dias: " + LocalDate.now().plusMonths(3).minusDays(10).with(TemporalAdjusters.lastDayOfYear()).getDayOfWeek());
		System.out.println("Primer dia del mes mas 20 dias de la fecha 1999-03-03: " + LocalDate.of(1999, 03, 03).with(TemporalAdjusters.firstDayOfMonth()).plusDays(20).getDayOfWeek());
		
		System.out.println("-----------------------------");
		
		LocalDate cumple = LocalDate.of(1996, 11, 20);
		System.out.println("Tu edad es de " + ChronoUnit.YEARS.between(cumple, fechaActual) + " anios");
	
		System.out.println("-----------------------------");

		LocalDate finDeAnio = fechaActual.with(TemporalAdjusters.lastDayOfYear());
		Period hastaFinDeAnio = fechaActual.until(finDeAnio);
		int meses = hastaFinDeAnio.getMonths();
		int dias = hastaFinDeAnio.getDays();
		System.out.println("Faltan " + meses + " meses y " + dias + " dias hasta final de anio");
	
		System.out.println("-----------------------------");
		// Hora actual
		LocalTime horaActual = LocalTime.now();	
		// Almacenar una hora cualquiera ( 15:45:59)
		LocalTime hora = LocalTime.of(15, 45, 59);	
		//Almacenar una hora a partir de un String
		LocalTime hora2 = LocalTime.parse("23:12:59");	
		System.out.println(horaActual + " " + hora + " " + hora2);
		
		System.out.println("-----------------------------");
		LocalTime horaAlmacenada = LocalTime.of(23, 11, 32);
		// Sumar actual 20h y 13min
		System.out.println(horaActual.plusHours(20).plusMinutes(13));
		//Restar al almacenado 30h y suar 13 + 12
		System.out.println(horaAlmacenada.minusHours(30).plusMinutes(13).plusSeconds(12));
	
	}

}
