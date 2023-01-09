/**
 * 
 */
package Tema5.Pajarito.Bi;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej03Pag102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int[][] matriz2 = new int[3][3];
		int[][] suma = new int[3][3];

		// Rellenamos matriz1
		System.out.println("Rellena el array matriz.");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("Introduzca un numero para la " + i + " fila columna " + j + ": ");
				matriz[i][j] = scan.nextInt();
			}
		}

		System.out.println();
		System.out.println("Rellena el array matrices2: ");

		// Rellenamos matriz2
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print("Introduzca un numero para la " + i + " fila columna " + j + ": ");
				matriz2[i][j] = scan.nextInt();
			}
		}

		// Sumamos las 2 matrices
		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < suma.length; j++) {
				suma[i][j] = matriz[i][j] + matriz2[i][j];
			}
		}

		// Mostramos el array matriz
		System.out.println();
		System.out.println("Tabla matriz ");
		System.out.print("---------------");
		for (int i = 0; i < suma.length; i++) {
			System.out.println();
			for (int j = 0; j < suma.length; j++) {
				System.out.printf("%3s", matriz[i][j], " ");
			}
		}
		// Mostramos el array matriz
		System.out.println();
		System.out.println();
		System.out.println("Tabla matriz2 ");
		System.out.print("---------------");
		for (int i = 0; i < suma.length; i++) {
			System.out.println();
			for (int j = 0; j < suma.length; j++) {
				System.out.printf("%3s", matriz2[i][j], " ");
			}
		}

		// Mostramos el array suma
		System.out.println();
		System.out.println();
		System.out.println("Tabla suma ");
		System.out.print("---------------");
		for (int i = 0; i < suma.length; i++) {
			System.out.println();
			for (int j = 0; j < suma.length; j++) {
				System.out.printf("%3s", suma[i][j], " ");
			}
		}
		System.out.println();
	}

}
