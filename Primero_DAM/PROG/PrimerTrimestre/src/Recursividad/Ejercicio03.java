/**
 * 
 */
package Recursividad;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ejercicio03 {
	/*
	 * 
	 */
	static int buscarArrayRecursivo(int arr[], int indice, int buscar) {
		if (arr[indice] == buscar) {
			return indice;
		}else if(arr[indice] == arr.length -1) {
			return -1;
		}
		else {
			return buscarArrayRecursivo(arr, indice +1, buscar);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Que numero quieres buscar: ");
		int buscar = scan.nextInt();
		int[] array = new int[3];
		array[0] = 5;
		array[1] = 2;
		array[2] = 7;

		System.out.println("Se encuentra en la posicion " + buscarArrayRecursivo(array, 0 ,buscar) + " del array.");

	}

}
