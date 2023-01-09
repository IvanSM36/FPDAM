/**
 * 
 */
package Tema3;

/**
 * @author IvanSM
 *
 */
public class Ej08Pag42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char letra1 = 'a';
		char letra2 = 'b';
		char letra3 = 'c';
		char letra4 = 'd';
		char letra5 = 'e';
		// La siguiente línea da error porque el resultado de sumar variables
	    // de tipo carácter es un número entero.
	    // String palabra = letra1 + letra2 + letra3 + letra4 + letra5;
		//Para solucionarlo se introduce dos comillas al principio.
		
		String todo = "" + letra1 + letra2 + letra3 + letra4 + letra5;
		
		System.out.println(todo);
		
	}

}
