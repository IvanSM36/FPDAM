/**
 * 
 */
package Tema5.Pajarito.Bi;

/**
 * @author IvanSM
 *
 */
public class Ej05Pag102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] matriz = new int[7][7];

		// Rellenamos el array
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}

		// Mostramos el array matriz
		System.out.println("Tabla matriz:");
		System.out.print("-----------------");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[0].length; j++)
				System.out.printf("%2s", matriz[i][j], " ");
		}
	}

}
