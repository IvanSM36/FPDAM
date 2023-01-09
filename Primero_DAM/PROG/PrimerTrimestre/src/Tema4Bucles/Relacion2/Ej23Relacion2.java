/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej23Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduzca la altura de la figura: ");
		int altura = scan.nextInt();

		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
