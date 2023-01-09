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
public class Ej17Pag115 {

	/**
	 * @param args
	 */
////////////Funciones ////////////////
	/**
	 * Numeros primos
	 * @param int
	 * @return boolean
	 */
	public static int sumaDivisoresPropios(int num) { // Se puede usar para numeros amigos.
		int suma = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				suma += i;
			}
		}
		return suma;
	}
	/**
	 * Numeros primos
	 * @param int
	 * @return boolean
	 */
	public static void amigos(int num, int num2) { // Se puede usar para numeros amigos.
		if (sumaDivisoresPropios(num) == num2 && sumaDivisoresPropios(num2) == num) {
			System.out.println("Los numeros " + num + " y " + num2 + " son amigos.");
		} else {
			System.out.println("Los numeros " + num + " y " + num2 + " No son amigos.");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca un numero: ");
		int num = scan.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		int num2 = scan.nextInt();

		amigos(num, num2);

	}

}
