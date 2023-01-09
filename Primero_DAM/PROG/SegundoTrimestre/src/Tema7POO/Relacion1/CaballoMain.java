/**
 * 
 */
package Tema7POO.Relacion1;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class CaballoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Datos caballo1
		System.out.println("Rellena datos caballo 1");
		System.out.println("-----------------------");
		System.out.print("Introduzca nombre: ");
		String nombre = scan.next();
		System.out.print("Introduzca raza: ");
		String raza = scan.next();
		System.out.print("Introduzca color: ");
		String color = scan.next();
		System.out.print("Introduzca edad: ");
		int edad = scan.nextInt();
		System.out.print("Introduzca carreras ganadas: ");
		int carrerasGanadas = scan.nextInt();
		// Creo el objeto y le doy los parametros
		Caballo horse1 = new Caballo(nombre, raza, color, edad, carrerasGanadas);
		System.out.println();
		// Datos caballo1
		System.out.println("Rellena datos caballo 1");
		System.out.println("-----------------------");
		System.out.print("Introduzca nombre: ");
		nombre = scan.next();
		System.out.print("Introduzca raza: ");
		raza = scan.next();
		System.out.print("Introduzca color: ");
		color = scan.next();
		System.out.print("Introduzca edad: ");
		edad = scan.nextInt();
		System.out.print("Introduzca carreras ganadas: ");
		carrerasGanadas = scan.nextInt();
		// Creo el objeto y le doy los parametros
		Caballo horse2 = new Caballo(nombre, raza, color, edad, carrerasGanadas);
		System.out.println();
		
		// Llamo a los metodos
		horse1.cabalga();
		horse1.rumia();
		horse1.relincha();
		horse1.trota();
		System.out.println();
		horse2.cabalga();
		horse2.rumia();
		horse2.relincha();
		horse2.trota();
	}

}
