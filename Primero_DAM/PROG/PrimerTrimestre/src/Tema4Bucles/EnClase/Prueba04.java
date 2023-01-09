/**
 * 
 */
package Tema4Bucles.EnClase;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Prueba04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		String respuesta;
		
		do {
			System.out.print("Introduzca un numero par: ");
			num = scan.nextInt();

			if (num % 2 == 0) {
				System.out.println("Que bonito es el numero " + num);
				System.out.print("�Quieres introducir otro numero? s/n: ");
				respuesta = scan.next();
				if(respuesta.equals('s')) {
					
				}
			} else {
				System.out.println("No me gustan los numeros impares, adi�s");
			}
		} while (num % 2 == 0);

	}

}
