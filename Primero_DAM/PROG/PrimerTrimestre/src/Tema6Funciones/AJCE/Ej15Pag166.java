/**
 * 
 */
package Tema6Funciones.AJCE;

/**
 * @author IvanSM
 *
 */
public class Ej15Pag166 {

	// Funciones
	public static boolean primosMil(int num) {
		boolean primo = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0 && primo == true)
				primo = false;
		}
		return primo;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			if (primosMil(i))
				System.out.println(i);
		}

	}

}
