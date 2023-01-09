/**
 * 
 */
package Tema5.Pajarito.Bi;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej08Pag102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] matriz = new int [8][6];
		
		//Rellenamos matriz
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(i == 0|| i == 7)
					matriz[i][j] = 1;	
				if(j == 0 || j == 5)
					matriz[i][j] = 1;
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
	}

}
