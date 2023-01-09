/**
 * 
 */
package Tema5.Pajarito;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej01Pag75 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numeros[] = new int[5];

		// Rellenamos el array numeros
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduca un numero para la posicion " + i + " del array: ");
			numeros[i] = scan.nextInt();
		}
		// Mostramos contenido del array numeros
		System.out.println();
		System.out.println("Contenido del array numeros.");
		System.out.println("---------------------------------");
		System.out.print("Indice: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%5s", i);
		}
		System.out.println();
		System.out.print("Valor:  ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%5s", numeros[i]);
		}
	}

}
