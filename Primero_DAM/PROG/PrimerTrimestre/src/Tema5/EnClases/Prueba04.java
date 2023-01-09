/**
 * 
 */
package Tema5.EnClases;

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
		
		double arrayNum[] = new double [5];
		
		//Rellenamos el array
		for(int i = 0; i < arrayNum.length; i++) {
			System.out.println("Introduzca un numero: ");
			arrayNum[i] = scan.nextDouble();
		}	
		
		//Mostramos el contenido
		for(int i = 0; i < arrayNum.length; i++) {		
			System.out.printf("%6s", i);
		}	
		System.out.println();
		for(int i = 0; i < arrayNum.length; i++) {
			System.out.printf("%6s", arrayNum[i]);
		}	
		
		//Comparamos
		for(int i = 0; i < arrayNum.length; i++) {
			if(arrayNum[i] == arrayNum[i]) {		
				System.out.println("Esta repetido " + arrayNum[i] + " con" + arrayNum[i] );
				
			}
			
		}
		
	}

}


//Pedir por teclado valores con decimales, en array de 10, comparar si hay elementos repetidos.