/**
 * 
 */
package Tema6Funciones.Bird;

import Tema6Funciones.Bird.Funciones.Funciones;

/**
 * @author IvanSM
 *
 */
public class Ej24Pag115 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		int[] array = new int[5];
		int impares = Funciones.rellenaArrayPares(array);
		
		System.out.println();
		System.out.println("Contenido de array pares");
		System.out.println("------------------------");
		System.out.print("Indice ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Valor  ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Se ha introducido " + impares + " numeros impares.");
	}

}
