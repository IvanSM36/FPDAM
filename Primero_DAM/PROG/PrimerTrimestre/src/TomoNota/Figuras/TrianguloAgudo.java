/**
 * 
 */
package TomoNota.Figuras;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class TrianguloAgudo {

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
