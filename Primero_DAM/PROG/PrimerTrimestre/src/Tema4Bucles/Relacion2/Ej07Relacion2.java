/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej07Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int suma = 0;
		int media = 0;
		int contador = 0;
		
		System.out.println("Este programa hace la media de los numeros introducidos.");
		System.out.println("Para salar introduzca un numero negativo.");
		System.out.println("-----------------------------------------");
		
		do {
			System.out.println("Introduzca un numero: ");
			num = scan.nextInt();
			if(num > 0) {
				contador ++;
				suma += num;
				media = suma / contador;
			}else {
				System.out.println("Fin del programa.");
			}
			
		}while(num > 0);
		
		System.out.println("La media de los numeros introducidos es: " + media);
		
	}

}
