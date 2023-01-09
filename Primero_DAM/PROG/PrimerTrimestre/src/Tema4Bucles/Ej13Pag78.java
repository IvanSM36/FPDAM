/**
 * 
 */
package Tema4Bucles;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej13Pag78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int contaPos = 0;
		int contaNeg = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca diez numeros: ");
			int num = scan.nextInt();
			
			if (num < 0) {
				contaNeg++;
			} else {
				contaPos++;
			}
		}
		System.out.println("Se ha introducido " + contaPos + " numeros positivos y " + contaNeg + " numeros negativos.");

	}

}
