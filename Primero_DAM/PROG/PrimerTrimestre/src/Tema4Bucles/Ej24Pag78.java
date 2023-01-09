/**
 * 
 */
package Tema4Bucles;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej24Pag78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca la altura de la piramide: ");
		int altura = scan.nextInt();
		
		int base = 1;
		int longitudDeLinea = 1;
		int espacios = altura - 1; // espacios (Horizontal)

		while (base <= altura) {

			// inserta espacios en blanco para enderezar la piramide.
			for (int i = 1; i <= espacios; i++) {
				System.out.print(" ");
			}

			// pinta la fila del caracter introducido
			for (int i = 1; i <= longitudDeLinea; i++) {
				System.out.print(i);
			}

			System.out.println();

			base++;
			espacios--;
			longitudDeLinea += 1;
		}
		
		
	}

}
