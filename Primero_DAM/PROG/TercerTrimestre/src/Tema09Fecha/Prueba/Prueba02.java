package Tema09Fecha.Prueba;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Prueba02 {

	public static void main(String[] args) {
		LocalDateTime fechaHora = LocalDateTime.now();
		LocalDate fechaActual = LocalDate.now();
		LocalDate hoy = LocalDate.parse("2020-07-06");
		
		LocalDate seisNov = LocalDate.parse("6/11/2020", DateTimeFormatter.ofPattern("d/M/yyyy"));
		System.out.println(hoy);
		System.out.println(seisNov);
		
		System.out.println("----------");
		
		System.out.println("Formatro iso 8601: " + fechaActual.format(DateTimeFormatter.ISO_DATE));
		DateTimeFormatter formatFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Formato espanol: " + fechaActual.format(formatFecha));
		
		System.out.println("----------");
		
		DateTimeFormatter esDateFormatLargo = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy").withLocale(new Locale("es", "ES"));
		System.out.println("Formato espanol (largo, localizado): " + fechaActual.format(esDateFormatLargo));
		
		System.out.println("----------");
		
		String idiomaLocal = System.getProperty("user.language");
		String paisLocal = System.getProperty("user.country");
		System.out.println("Formato actual del sistema " + idiomaLocal + "-" + paisLocal + " " + fechaHora.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(new Locale(idiomaLocal, paisLocal))));
	}

}
