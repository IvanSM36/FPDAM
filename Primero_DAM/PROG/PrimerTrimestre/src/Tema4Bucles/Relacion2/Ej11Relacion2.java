/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej11Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int contador = 0;
		int suma = 0;
		
		System.out.println("Este programa pide 10 sueldo y muestra la suma total y cuantos mayores de 1000");
		
		for (int i = 0; i <10; i++) {
			
			System.out.println("Introduzca un numero: ");
			int num =scan.nextInt();
			suma += num;
			if(num >= 1000) {
				contador ++;
			}
		}
		System.out.println("La suma total es de: " + suma);
		System.out.println("Sueldos mas de 1000: " + contador);
	}

}
