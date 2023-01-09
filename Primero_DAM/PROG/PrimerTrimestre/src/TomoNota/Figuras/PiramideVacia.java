/**
 * 
 */
package TomoNota.Figuras;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class PiramideVacia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca la altura de la piramide: ");
		int altura = scan.nextInt();
		int base = altura +2 -1;
		//Va aplicando los saltos de linea 
		for (int i = 0; i < altura; i++) {
			System.out.println();
			//Pinta los espacios de la izquierda
			for (int j = 0; j <  altura -i -1 ; j++ ) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*i +1; k++) {
				//i==0 es el pico // i==altura-1 es la base // k==0 es el lado izquierdo // k2*i es el lado derecho
				if((i==0)||(i==altura-1)||(k==0)||(k==2*i)) {
					System.out.print("*");
				} else { // Pinta espacios internos
					System.out.print(" ");
				}
			}
		}

	}

}
