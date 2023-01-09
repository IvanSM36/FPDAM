/**
 * 
 */
package Tema4;

import java.util.*;

/**
 * @author IvanSM
 *
 */
public class Prueba01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca nota de examen: ");
		int nota = scan.nextInt();

		if (nota >= 5 && nota <=6) { 
			System.out.println("Suficiente");
		} else if (nota >= 7 && nota <=8) {
			System.out.println("Notable");
		} else if (nota >= 9 && nota <=10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Insuficiente");
		}

	}

}
