/**
 * 
 */
package Tema4;

import java.util.*;

/**
 * @author IvanSM
 *
 */
public class Ej09Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa indica si un numero es par o no.");
		System.out.print("Introduzca un numero: ");
		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("El numero " + num + " es par");
		} else {
			System.out.println("El numero " + num + " es impar");
		}

	}

}
