/**
 * 
 */
package Tema6Funciones.Clases;

import java.util.Scanner;

import Funciones.*;

/**
 * @author IvanSM
 *
 */
public class Prueba1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * System.out.print("Introduzca un numero entero positivo: "); int num =
		 * scan.nextInt();
		 * 
		 * if (funciones.esPrimo(num)) { System.out.println("El " + num + " es primo.");
		 * } else { System.out.println("El " + num + " no es primo."); }
		 */

		// Pedimos los valores.
		System.out.print("Introduzca un numero: ");
		int num = scan.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		int num2 = scan.nextInt();

		// Mostramos la suma
		System.out.println("La suma es: " + Funciones.suma(num, num2));

		// Mostramos la resta
		System.out.println("La resta es: " + Funciones.resta(num, num2));

		// Mostramos la multiplicacion
		System.out.println("La multiplicacion es " + Funciones.multi(num, num2));

		// Mostramos mensaje
		operaciones obj = new operaciones();
		obj.bien();

	}

}
