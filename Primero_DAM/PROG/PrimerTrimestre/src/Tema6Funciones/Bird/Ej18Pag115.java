/**
 * 
 */
package Tema6Funciones.Bird;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej18Pag115 {

	/**
	 * @param args
	 */
////////////Funciones ////////////////
	/**
	 * Numeros primos 
	 * @param int
	 * @return boolean
	 */
	public static boolean esPrimo(int num) {
		boolean primo = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0 && primo == true)
				primo = false;
		}
		return primo;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		int num = scan.nextInt();

		if (esPrimo(num))
			System.out.println("El numero " + num + " es primo");
		else
			System.out.println("El numero " + num + " no es primo");
	}

}
