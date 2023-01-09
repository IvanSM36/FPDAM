/**
 * 
 */
package Tema5.Pajarito.Bi;

/**
 * @author IvanSM
 *
 */
public class Ej01Pag102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] matriz = new int[5][5];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = i + j;
			}
		}

		System.out.println("Tabla ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}

}
