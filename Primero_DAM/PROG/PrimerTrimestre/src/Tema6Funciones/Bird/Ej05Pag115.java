/**
 * 
 */
package Tema6Funciones.Bird;

import java.util.Scanner;

import Tema6Funciones.Bird.Funciones.Funciones;
/**
 * @author IvanSM
 *
 */
public class Ej05Pag115 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		int num = scan.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		int num2 = scan.nextInt();

		System.out.println("Los numeros comprendidos entre " + num + " y " + num2 + " son:");
		Funciones.entre(num, num2);
	}

}
