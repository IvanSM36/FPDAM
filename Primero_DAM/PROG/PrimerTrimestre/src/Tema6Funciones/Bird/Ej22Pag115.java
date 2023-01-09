/**
 * 
 */
package Tema6Funciones.Bird;

import java.util.Scanner;

import Tema6Funciones.Bird.Funciones.Funciones;

/**
 * @author IvanSM
 *
 */
public class Ej22Pag115 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca un angulo: ");
		int angulo = scan.nextInt();
		
		Funciones.infoAngulos(angulo);
	}

}
