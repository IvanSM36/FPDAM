/**
 * 
 */
package Tema4Bucles;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej07Pag78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int clave = 7777 ; 
		int pin;
		do {
			System.out.println("Introduzca la clave de la caja fuerte: ");
			pin = scan.nextInt();
			
			if(pin == clave) {
				System.out.println("Caja fuerte abierta.");
			}else {
				System.out.println("Clave incorrecta.");
			}
		}
		while (pin != clave);
		
	}

}
