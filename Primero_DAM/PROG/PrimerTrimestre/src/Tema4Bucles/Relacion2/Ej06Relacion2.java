/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej06Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int suma = 0;
		System.out.println("Este programa suma todos los numeros introducidos.");
		System.out.println("Para salir introduzca 0.");
		System.out.println("------------------------");

		do {
			System.out.print("Introduzca un numero: ");
			num = scan.nextInt();		
			suma += num ;

		} while (num != 0);
		
		System.out.println("-------------------------------------------");
		System.out.println("La suma de los numeros introducidos es: " + suma);
		System.out.println("-------------------------------------------");

	}

}
