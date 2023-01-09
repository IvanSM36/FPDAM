/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej15Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int suma = 0;
		int media = 0;
		
		System.out.println("Este programa pide 5 calificaciones e indica si esta suspenso.");
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Introduzca nota del examen " + i + ": ");
			num =scan.nextInt();
			
			suma += num;
			media = suma / 5;	
		}		
		if(media < 5) {
			System.out.println("Estas suspenso, tienes un " + media);
		}else {
			System.out.println("Estas Aprobado, tienes un " + media);
		}		
	}

}
