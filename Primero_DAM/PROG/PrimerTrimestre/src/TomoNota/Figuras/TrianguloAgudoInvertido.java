/**
 * 
 */
package TomoNota.Figuras;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class TrianguloAgudoInvertido {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduzca la altura de la figura: ");
		int altura = scan.nextInt();

		int espacios = 0;

		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < espacios; j++) {
				System.out.print(" ");// Pinta los espacios de la parte izquierda
			}

			for (int j = 0; j < altura - i; j++) {
				System.out.print("*");// Pinta el triangulo
			}

			System.out.println();

			espacios++; // invierte el triangulo de lado
		}

	}

}
