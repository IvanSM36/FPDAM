/**
 * 
 */
package Tema5.ArrayACEJ;

/**
 * @author IvanSM
 *
 */
public class Ej02Pag139 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char simbolo[] = new char[10];

		simbolo[0] = 'a';
		simbolo[1] = 'x';
		simbolo[4] = '@';
		simbolo[6] = ' ';
		simbolo[7] = '+';
		simbolo[8] = 'Q';

		// Mostramos el contenido
		for (int i = 0; i < simbolo.length; i++) {
			System.out.printf("%6s", i);
		}
		System.out.println();
		for (int i = 0; i < simbolo.length; i++) {
			System.out.printf("%6s", simbolo[i]);
		}
		// Los demas se inIcializan con espacios.

	}

}
