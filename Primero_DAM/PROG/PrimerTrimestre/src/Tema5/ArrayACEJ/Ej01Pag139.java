/**
 * 
 */
package Tema5.ArrayACEJ;

/**
 * @author IvanSM
 *
 */
public class Ej01Pag139 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arrayNum[] = new int[12];

		arrayNum[0] = 39;
		arrayNum[1] = -2;
		arrayNum[4] = 0;
		arrayNum[6] = 14;
		arrayNum[8] = 5;
		arrayNum[9] = 120;

		// Mostramos el contenido
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.printf("%6s", i);
		}
		System.out.println();
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.printf("%6s", arrayNum[i]);
		}
		//Los demas se inicializan a 0 automaticamente.
	}

}
