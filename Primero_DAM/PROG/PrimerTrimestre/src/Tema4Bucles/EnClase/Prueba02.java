/**
 * 
 */
package Tema4Bucles.EnClase;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Prueba02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//int num;

		/*
		 * do { System.out.print("Introduzca un numero del 0-100: "); num =
		 * scan.nextInt();
		 * 
		 * } while (num > 0 && num < 100);
		 * System.out.println("El numero introducido es: " + num);
		 */

		System.out.print("Introduzca un numero del 0-100: ");
		int num = scan.nextInt();
		while (num > 0 && num < 100) {
			System.out.print("Introduzca un numero del 0-100: ");
			num = scan.nextInt();
		}
		System.out.println("El numero introducido es: " + num);
	}

}
