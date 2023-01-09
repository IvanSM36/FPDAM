/**
 * 
 */
package Recursividad;

/**
 * @author IvanSM
 *
 */
public class Ejercicio02 {
	/*
	 * 
	 */
	static void arrayRecursivo(int arr[], int indice) {
		if (indice == (arr.length - 1)) {
			System.out.print(arr[indice] + " ");
		} else {
			System.out.print(arr[indice] + " ");
			arrayRecursivo(arr, indice + 1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[3];
		array[0] = 5;
		array[1] = 2;
		array[2] = 7;
		
		arrayRecursivo(array, 0);
	}

}
