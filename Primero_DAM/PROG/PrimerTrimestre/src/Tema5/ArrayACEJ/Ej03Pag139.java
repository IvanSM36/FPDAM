/**
 * 
 */
package Tema5.ArrayACEJ;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej03Pag139 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa pide 10 numeros y los muestra en orden inverso.");

		int numeros[] = new int[10];

		// Rellenamos el Array con numeros por teclado.
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduzca numero " + i + " : ");
			numeros[i] = scan.nextInt();
		}
		// Mostramos el contenido
		System.out.println();
		System.out.println("Contenido del Array numeros original:");
		System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
		System.out.print("│ Indice ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("│    %-4s", i );
		}
		System.out.printf("%37s", "│");

		System.out.println();
		System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

		System.out.print("│ Valor  ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("│    %-4s", numeros[i]);
		}
		System.out.printf("%37s", "│");
		System.out.println();
		System.out.print("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
		
		// Mostramos Array numeros con el contenido invertido
		System.out.println();
		System.out.println("Contenido del Array numeros original:");
		System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
		System.out.print("│ Indice ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("│    %-4s", i );
		}
		
		System.out.println();
		System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

		System.out.print("│ Valor  ");
		for (int i = numeros.length -1; i >= 0; i--) {
			System.out.printf("│    %-4s", numeros[i]);
		}
		System.out.printf("%1s", "│");
		System.out.println();
		System.out.print("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
	}

}
