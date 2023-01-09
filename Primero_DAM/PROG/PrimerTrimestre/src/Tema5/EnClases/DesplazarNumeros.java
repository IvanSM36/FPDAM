/**
 * 
 */
package Tema5.EnClases;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class DesplazarNumeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] num = new int[5];
		int[] arrayAux = new int[5];
		int aux = 0;
		int j = 1;

		// Rellenamos el array
		for (int i = 0; i < num.length; i++) {
			System.out.print("Introduzca un numero: ");
			num[i] = scan.nextInt();
		}
		// Cogemos el numero de la ultima posicion para guardarlo y no se pierda.				
		aux = aux + num[num.length-1];
					
		// Mostramos el array original
		System.out.println();
		System.out.println("Array Original num.");
		System.out.println("-------------------");
		System.out.printf("%2s", "Indice");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%4s", i);
		}
		System.out.println();
		System.out.printf("%-6s", "Valor");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%4s", num[i]);
		}
		
		// Mostramos el array desplazados
		System.out.println();
		System.out.println();
		System.out.println("Array desplazado.");
		System.out.println("-------------------");
		System.out.printf("%2s", "Indice");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%4s", i);
		}
		System.out.println();
		System.out.printf("%-6s", "Valor");
		for (int i = num.length-2; i >= 0; i--) {		
				num[i+1] = num[i];		
		}
		num[0] = aux;
		for (int i = 0; i < (num.length); i++) {
			System.out.printf("%4s", num[i]);				
		}
		
	}

}
