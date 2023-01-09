/**
 * 
 */
package Recursividad;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ejercicio05 {

	/*
	 * 
	 */
	public static String invertirPalabra(String palabra, int longitud) {

		if (longitud == 0) {
			return palabra.charAt(longitud) + "";
		} else {
			return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud - 1));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca una palabra: ");
		String palabra =scan.nextLine();

		System.out.println(invertirPalabra(palabra, palabra.length() - 1));
	}

}
