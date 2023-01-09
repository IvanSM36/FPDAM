/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej10Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int suma = 0;
		System.out.println("Este programa pide 15 numero y muestra la suma de todos");
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Introduzca un numero: ");
			int num = scan.nextInt();
			suma += num;
		}
		
		System.out.println("La suma total es: " + suma);
	}

}
