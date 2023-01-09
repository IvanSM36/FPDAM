/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej14Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Este programa pide 10 numeros e indica cuantos negativos hay.");
		
		int contador = 0;
		int num = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.println("Introduzca un numero: ");
			num = scan.nextInt();
			if(num < 0)
				contador ++; 
		}
	
		System.out.println("Se ha introducido " + contador + " numeros negativos.");
	}

}
