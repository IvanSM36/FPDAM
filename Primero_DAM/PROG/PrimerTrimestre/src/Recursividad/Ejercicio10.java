/**
 * 
 */
package Recursividad;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ejercicio10 {
	static char[] charName = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reading = new Scanner(System.in);

		System.out.print("Ingrese su nombre: ");
		String name = reading.nextLine();
		charName = name.toCharArray();

		System.out.println("\n[ NOMBRE AL REVES ]");
		nameReverse(charName.length - 1);
		reading.close();
	}

	public static void nameReverse(int LENGTH) {

		if (LENGTH == 0) {

			System.out.print(charName[LENGTH] + ".");

		} else {

			System.out.print(charName[LENGTH]);
			nameReverse(LENGTH - 1);
		}

	}
}
