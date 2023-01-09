/**
 * 
 */
package Tema5.ArrayACEJ.Bi;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 *///
public class Ej02Pag150 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] numeros = new int[4][5];
		int sumaTotal = 0;
		int sumaFila ;
		int sumaColum ;

		// Rellenamos array numeros
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				System.out.print("Introduzca valor en la fila " + i + " posicion " + j + ": ");
				numeros[i][j] = scan.nextInt();
			}
		}
		System.out.println();
		System.out.println("Matriz numneros.");
		System.out.print("---------------------");
		System.out.println();
		// Sumamos las filas y las mostramos		
		for (int i = 0; i < numeros.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < numeros[0].length; j++) {
				sumaFila += numeros[i][j];
				System.out.printf("%3s", numeros[i][j], " ");//Mostramos el contenido del array
			}
			//Calculamos el Total
			sumaTotal += sumaFila; 
			System.out.println(" | " + sumaFila);
		}
		//Mostramos el separador para las columnas
		System.out.print("---------------------");
		System.out.println();
		//Sumamos las columnas
		for (int j = 0; j < numeros[0].length; j++) {
			sumaColum = 0;			
			for (int i = 0; i < numeros.length; i++) {			
				sumaColum = sumaColum + numeros[i][j];
			}
			sumaTotal += sumaColum; 
			System.out.printf("%3s", sumaColum);
		}
		System.out.println(" | Total: " + sumaTotal);
	}

}
