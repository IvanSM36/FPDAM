/**
 * 
 */
package Tema6Funciones.Bird;

import java.util.Scanner;

import Tema6Funciones.AJCE.FuncionesAzul;
import Tema6Funciones.Bird.Funciones.Funciones;

/**
 * @author IvanSM
 *
 */
public class Ej27Pag115 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int[] arr2 = new int[5];
		int[] resultado = new int[5];

		System.out.println("┌────────────────────────────────────────────────────────────────┐");
		System.out.println("│ Introduzca 's' para realizar la suma de los 2 arryas           │");
		System.out.println("│ Introduzca 'r' para realizar la resta de los 2 arrays          │");
		System.out.println("│ Introduzca 'm' para realizar la multiplicacion de los 2 arrays │");
		System.out.println("│ Introduzca 'd' para realizar la division de los 2 arrays.      │");
		System.out.println("└────────────────────────────────────────────────────────────────┘");
		System.out.print("Introduce una opcion: ");
		char opcion = scan.nextLine().charAt(0);
		Funciones.arrayRandom(arr);
		Funciones.arrayRandom(arr2);
		switch (opcion) {
		case 's':
			for (int i = 0; i < resultado.length; i++) {
				resultado[i] = arr[i] + arr2[i];		
			}
			Funciones.mostrarArray(resultado);
			break;
		case 'r':
			for (int i = 0; i < resultado.length; i++) {
				resultado[i] = arr[i] - arr2[i];
			}
			Funciones.mostrarArray(resultado);
			break;
		case 'm':
			for(int i = 0; i < resultado.length; i++) {
				resultado[i] = arr[i] * arr2[i];
			}
			Funciones.mostrarArray(resultado);
		break;
		case 'd':
			for(int i = 0; i < resultado.length; i++) {
				resultado[i] = arr[i] / arr2[i];
			}
			Funciones.mostrarArray(resultado);
		break;
		default:
			System.out.println("Introduzca una opcion");
			break;
		}

	}

}
