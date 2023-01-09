/**
 * 
 */
package Tema6Funciones.Bird;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej03Pag115 {

	/**
	 * @param args
	 */
	// Funciones
	/*
	 * Comprueba el maximo de 3 parametros
	 * 
	 * @param int int
	 * 
	 * @return int
	 */
	public static int maximo(int a, int b, int c) {
		int max;
		if (a > b && a > c) {
			max = a;
		} else {
			if (b > a && b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		int num = scan.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		int num2 = scan.nextInt();
		System.out.print("Introduzca el tercer numero: ");
		int num3 = scan.nextInt();
		System.err.println("El maximo es: " + maximo(num, num2, num3));
	}

}
