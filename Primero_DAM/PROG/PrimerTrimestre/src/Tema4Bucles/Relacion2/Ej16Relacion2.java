/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej16Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int contador = 0;
		int suma = 0;
		int media = 0;
		int num = 0;

		do {
			System.out.println("Introduzca numeros: ");
			num = scan.nextInt();
			suma += num;
			contador++;
			media = suma / contador;

		} while (suma <= 10000); // Si la suma es mayir a 10000 se termina y muestra.

		System.out.println("Numeros introducidos: " + contador);
		System.out.println("Total acumulado: " + suma);
		System.out.println("Media de los numeros introducidos: " + media);
	}

}
