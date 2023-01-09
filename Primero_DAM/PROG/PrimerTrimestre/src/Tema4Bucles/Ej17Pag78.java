/**
 * 
 */
package Tema4Bucles;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej17Pag78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int suma = 0;
		
		do {
			System.out.print("Introduzca un numero positivo: ");
			num = scan.nextInt();

			if (num < 0) {
				System.out.println("Numero no valido, debes introducir un numero positivo.");
			}
		} while (num < 0);

		for(int i = num; i < num + 100; i++){ //El comienzo seria el numero introducido, hasta numero introducido + 100 que seria los 100 siguientes
			suma += i; 
		}
		
		System.out.println("La suma de los 100 numeros siguientes a " + num + " es: " + suma);
	}

}
