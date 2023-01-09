/**
 * 
 */
package Tema4Bucles;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej15Pag78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca una base: ");
		int base = scan.nextInt();
		System.out.print("Introduzca un exponente: ");
		int expo = scan.nextInt();
		
		for(int i=1; i <= expo; i++) {
			System.out.println(base + "^" + i);
		}
	}

}
