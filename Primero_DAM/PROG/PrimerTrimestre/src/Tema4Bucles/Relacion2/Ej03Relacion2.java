/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej03Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa indica si un numero es negativo o positivo.");
		System.out.println("Para salir introduzca un 0.");
		System.out.println("-----------------------------");

		int num = 0;

		do {
			System.out.print("Introduzca un numero: ");
			num = scan.nextInt();

			if (num == 0) { //Se evalua 0 aqui para que salga del programa, si no muestra que 0 es par.
				System.out.println("Fin del programa.");
			} else if (num % 2 == 0) {
				System.out.println("El numero " + num + " es par.");
			} else {
				System.out.println("El numero " + num + " es impar.");
			}

		} while (num != 0);

	}

}
