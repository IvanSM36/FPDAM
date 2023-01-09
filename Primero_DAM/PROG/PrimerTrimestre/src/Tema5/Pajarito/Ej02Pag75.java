/**
 * 
 */
package Tema5.Pajarito;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej02Pag75 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numeros[] = new int[5];

		// Rellenamos el array numeros
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduzca un numero para la posicion " + i + " del array: ");
			numeros[i] = scan.nextInt();
		}
		// Mostramos contenido del array numeros
		System.out.println();
		System.out.println("Contenido del array numeros original.");
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
		System.out.println();
		// Mostramos contenido del array numeros invertido.
				System.out.println();
				System.out.println("Contenido del array numeros invertido.");
				System.out.println("---------------------------------");
				System.out.print("Indice: ");
				for (int i = numeros.length -1; i >= 0; i--) {
					System.out.printf("%5s", i);
				}
				System.out.println();
				System.out.print("Valor:  ");
				for (int i = numeros.length -1; i >= 0; i--) {
					System.out.printf("%5s", numeros[i]);
				}
	}

}
