/**
 * 
 */
package Funciones;

/**
 * @author IvanSM
 *
 */
public class Funciones {

	/*
	 * Comprueba si el numero introducido es primo o no.
	 * @param boolea 
	 * @return boolean
	 */
	public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;
	}
	/*
	 * Devuelve la suma de dos parametros.
	 * @param int, int
	 * @return int
	 * 
	 */
	public static int suma(int a, int b) {
		int suma = a + b;
		return suma;
	}

	/* Devuelve la resta de dos parametros.
	 * @param int, int
	 * @return int
	 */
	public static int resta(int a, int b) {
		int resta = a - b;
		return resta;
	}
	/* Devuelve la multiplicacion de dos parametros.
	 * @param int, int
	 * @return int
	 */
	public static int multi(int a, int b) {
		int multi = a * b;
		return multi;
	}
	/* Muestra el array
	 * @param int
	 * @return 
	 */
	public static void muestraArray(int x[]) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	/* Incremetador
	 * @param int
	 * @return 
	 */
	public static void incrementa(int x[]) {
		for (int i = 0; i < x.length; i++) {
		x[i]++;
		}
	}
}
