/**
 * 
 */
package Tema4Bucles;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej19Pag78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduzca la altura de la piramide: ");
		int altura = scan.nextInt();
		System.out.print("Introduzca el caracter para pintar la piramide: ");
		String pinta = scan.next();				
		int espacios = 0; 
		int caracter = 0;
		
		
		for(int i = 1; i <= altura; i++) {
			espacios = altura -i;
			caracter = 2*(i-1) + 1;
			for(int j = 0; j<espacios; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < caracter; j++ ) {
				System.out.print(pinta);
			}
			System.out.print("\n");
		}

	}

}





		