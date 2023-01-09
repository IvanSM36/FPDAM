/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej04Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int contador = 0;
		System.out.println("Este programa muestra cuantos numeros se ha introducido.");
		System.out.println("Para salir introduzca un numero negativo.");
		System.out.println("-----------------------------------------");
		
		do {
			System.out.println("Introduzca un numero: ");
			num = scan.nextInt();			
			
			if(num > 0) {
				contador ++;
			}else {
				System.out.println("Fin del programa");
			}
			
		} while (num > 0);
		System.out.println("Se ha introducido " + contador  + " numeros.");
	}

}
