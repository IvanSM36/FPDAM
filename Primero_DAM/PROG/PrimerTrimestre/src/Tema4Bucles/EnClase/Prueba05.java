/**
 * 
 */
package Tema4Bucles.EnClase;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Prueba05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		System.out.println("Para salir introduzca 0.");

		do {
			System.out.println("Introduzca un numero: ");
			num = scan.nextInt();

			if (num > 0) {
				System.out.println("El numero " + num + " es positivo.");
			} else if (num < 0) {
				System.out.println("El numero " + num + " es negativo.");
			} else {
				System.out.println("Has salido del programa.");
			}
		} while (num != 0);
	}

}
