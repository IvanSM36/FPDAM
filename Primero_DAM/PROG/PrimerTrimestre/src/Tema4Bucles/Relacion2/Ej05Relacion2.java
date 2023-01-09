/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej05Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int clave = 36;
		int num = 0;
		System.out.println("Intenta adivinar el numero.");
		System.out.println("Introduzca un numero negativo para salir.");

		do {
			System.out.println("Introduzca un numero: ");
			num = scan.nextInt();
			
			if(num == clave) {
				System.out.println("-----------------------");
				System.out.println("Enorabuena, acertaste.");
			} else if (num < clave) {
				System.out.println("El numero introducido es menor que la clave");
			} else if (num > clave) {
				System.out.println("El numero introducido es mayor que la clave");
			}
			
			System.out.println("-----------------------");

		}while(num != clave);
	}

}
