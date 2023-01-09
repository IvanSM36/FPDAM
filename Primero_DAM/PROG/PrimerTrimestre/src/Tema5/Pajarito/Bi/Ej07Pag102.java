/**
 * 
 */
package Tema5.Pajarito.Bi;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej07Pag102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] matriz = new int[5][9];
		int[][] matriz2 = new int[9][5];

		// Rellenamos matriz
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random() * 10);
			}

		// Volcamos contenido a matriz2
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				matriz2[j][i] = matriz[i][j];
			}
		}

		// Mostramos contenido de Matriz
		System.out.println("Tabla matriz.");
		System.out.print("-------------");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%2s", matriz[i][j], " ");
			}
		}

		System.out.println();
		System.out.println();

		// Mostramos contenido de matriz2
		System.out.println("Tabla matriz2.");
		System.out.print("-------------");
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf("%2s", matriz2[i][j], " ");
			}
		}

	}

}
