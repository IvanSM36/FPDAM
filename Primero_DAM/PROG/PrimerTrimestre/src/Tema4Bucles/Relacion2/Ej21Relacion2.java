/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej21Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int altura = 0;
		int anchura = 0;

		System.out.println("Este programa dibuja un rectangulo.");
		//Con el while filtro para indicar si anchura o altura es menor o igual a 2
		do {
			System.out.print("Introduzca la anchura del rectangulo: ");
			anchura = scan.nextInt();
			System.out.print("Introduzca la altura del rectangulo: ");
			altura = scan.nextInt();

			if (altura <= 2 || anchura <= 2)
				System.out.println("Error, los datos introducidos no son correctos");
		} while (altura <= 2 || anchura <= 2);
				
		for (int i = 0; i < altura; i ++) {
			System.out.println(); //Salto de lineas
			for(int j = 1; j <= anchura; j++) {
				if( i == 0 || i == altura -1 ) {// pinta techo y suelo.
					System.out.print("* ");					
				}else {	//Cuando no se cumple techo y suelo	 
					if( j == 1 || j == anchura) { //Pintamos los lados 
						System.out.print("* ");
					}else {
						System.out.print("  "); //Rellenamos con espacios
					}
				}
				
			}
		}
	}
}
