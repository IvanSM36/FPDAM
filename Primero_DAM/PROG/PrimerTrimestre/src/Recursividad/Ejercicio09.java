/**
 * 
 */
package Recursividad;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ejercicio09 {
	static String country[] = new String[10];

	/*
	 * 
	 */
	public static void outputCountry(int LENGTH) {

		if (LENGTH == 0) { // Termina cuando country[] llegue a la posicion 0

			System.out.printf("Ciudad #%d : %s  \n", (LENGTH + 1), country[LENGTH].toUpperCase());

		} else {

			System.out.printf("Ciudad #%d : %s \t*\n", (LENGTH + 1), country[LENGTH].toUpperCase());
			outputCountry(LENGTH - 1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < country.length; i++) {

			System.out.printf("Ingrese el nombre de la ciudad #%d: ", (i + 1));
			country[i] = scan.nextLine();

		}

		// Llamada al metodo recursivo
		System.out.println("\n");
		outputCountry(country.length - 1);
		scan.close();
	}
}
