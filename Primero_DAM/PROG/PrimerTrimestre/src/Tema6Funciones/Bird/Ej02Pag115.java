/**
 * 
 */
package Tema6Funciones.Bird;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej02Pag115 {

	/**
	 * @param args
	 */

	// Funciones
	/*
	 * Comprueba el maximo de 2 parametros
	 * 
	 * @param int int
	 * 
	 * @return int
	 */
	public static int maximo(int a, int b) {
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca un numero: ");
		int num = scan.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		int num2 = scan.nextInt();

		System.err.println("El maximo es: " + maximo(num, num2));
	}

}
