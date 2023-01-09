/**
 * 
 */
package TomoNota.Figuras;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class PintaUnaX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa dibuja una x.");
		System.out.println("Introduzca el lado del cuadrado");
		int lado = scan.nextInt();

		for (int i = 0; i < lado; i++) {
			System.out.println();
			for (int j = 0; j < lado; j++) {
				if (i == j) {
					System.out.print("* ");
				} else if (i + j == lado - 1 && i != j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
		}
	}

}
