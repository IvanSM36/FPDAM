/**
 * 
 */
package Tema4;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej06Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa resuelve ecuaciones de primer grado tipo ax +b = 0");
		System.out.println("Introduzca el valor de a: ");
		double valorA = scan.nextInt();
		System.out.println("Introduzca el valor de b: ");
		double valorB = scan.nextInt();

		double solucion = (-valorB / valorA);

		if (valorA == 0) {
			System.out.println("La ecuacion no tiene solucion real.");
		}else {
			System.out.println("La solucion es: " + solucion);
		}
	}

}
