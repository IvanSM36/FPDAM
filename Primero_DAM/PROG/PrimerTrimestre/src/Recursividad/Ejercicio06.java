/**
 * 
 */
package Recursividad;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ejercicio06 {

	/*
	 * 
	 * 
	 */
	public static int potencia(int base, int exponente) {

		if (exponente == 0) { // Caso base base^0 = 1
			return 1;
		} else if (exponente == 1) { // Caso base = base^1 = base
			return base;
		} else if (exponente < 0) {
			return potencia(base, exponente + 1) / base;
		} else {
			return base * potencia(base, exponente - 1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca la base: ");
		int base = scan.nextInt();
		System.out.print("Introduzca el exponente: ");
		int expo = scan.nextInt();

		System.out.println("La potencia de " + base + "^" + expo + " es: " + potencia(base, expo));
	}

}
