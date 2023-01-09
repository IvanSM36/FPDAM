/**
 * 
 */
package Tema4Bucles.EnClase;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Prueba03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int contador = 0;
		int num ;
		
		do {
			System.out.print("Introduzca un numero: ");
			num = scan.nextInt();
			contador ++;
		}
		while(num > 0);		
		
		System.out.println("Has introducido " + contador + " numeros.");
		scan.close();
	}

}
