/**
 * 
 */
package Tema6Funciones.Bird;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej04Pag115 {

	/**
	 * @param args
	 */
	// Funciones
	/*
	 * Comprueba el mayor de un array
	 * @param int[]
	 * @return int
	 */
	public static int mayor (int array[]) {
		int mayor = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}
		return mayor;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] mayor = new int[5];

		for (int i = 0; i < mayor.length; i++) {
			System.out.print("Introduzca un numero: ");
			mayor[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("El mayor del array es: " + mayor(mayor));

	}

}
