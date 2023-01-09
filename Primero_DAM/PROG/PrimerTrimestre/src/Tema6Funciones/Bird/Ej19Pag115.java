/**
 * 
 */
package Tema6Funciones.Bird;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej19Pag115 {

	/**
	 * @param args
	 */
////////////Funciones ////////////////
	/**
	 * Calcular la potencia 
	 * @param int
	 * @return int
	 */
	public static int potencia(int base, int expo) {
		int potencia = 1;
		
		for(int i = 0; i < expo; i++) {
			potencia = potencia * base;
		}
		
		return potencia;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		int num = scan.nextInt();
		System.out.print("Introduzca el exponente: ");
		int exponente = scan.nextInt();
		
		System.out.println("La potencia de " + num + "^" + exponente + " es: " + potencia(num, exponente));
	}

}
