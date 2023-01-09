/**
 * 
 */
package Tema4Bucles;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej33Pag78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int altura = 0;
		int base = 1;
		int longitudLinea = 1;
		int espacios = 1;
		String pintar = "*";
		
		do {
			System.out.println("Introduzca altura de la U: ");
			altura = scan.nextInt();

		} while (altura < 0);

		// pinta la fila del caracter introducido
		for (int i = 1; i <= altura - 2; i++) {
			System.out.print(" ");
		}

		for (int i = 1; i <= altura; i++) {
			System.out.println(pintar);
		}

		// pinta la fila del caracter introducido
		for (int i = 1; i <= altura - 2; i++) {
			System.out.print(" " + pintar);
		}

		System.out.println();

		base++;
		longitudLinea += 1;

	}

}
