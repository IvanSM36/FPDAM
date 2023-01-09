/**
 * 
 */
package Tema4Bucles;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej14Pag78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Cálculo de una potencia");

		System.out.print("Introduzca la base: ");
		int base = scan.nextInt();
		System.out.print("Introduzca el exponente: ");
		int exponente = scan.nextInt();

		double potencia = 1;
		// Si el exponente introducido es 0 el resultado es 1
		if (exponente == 0) {
			potencia = 1;
		}
		// Si el exponente es mayo que 0, calcula la potencia
		if (exponente > 0) {
			for (int i = 0; i < exponente; i++) {
				potencia *= base;
			}
		}
		// Si el exponente es menor que 0, calcula la potencia en negativo
		if (exponente < 0) {
			for (int i = 0; i < -exponente; i++) {
				potencia *= base;
			}

			potencia = 1 / potencia;
		}

		System.out.println(base + "^" + exponente + " = " + potencia);
	}
}
