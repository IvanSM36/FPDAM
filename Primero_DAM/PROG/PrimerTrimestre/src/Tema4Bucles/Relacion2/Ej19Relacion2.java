/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej19Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa dibuja un cuadrado.");	
		System.out.println("Introduzca el lado del cuadrado");
		int lado = scan.nextInt();
		
		for (int i = 0; i < lado; i ++) {
			System.out.println(); //Salto de linea
			for(int j = 1; j <= lado; j++) {//Pinta las estrellas
				System.out.print("* ");
			}
		}
				
	}

}
