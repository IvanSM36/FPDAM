/**
 * 
 */
package Tema6Funciones.Clases;

/**
 * @author IvanSM
 *
 */
public class EuclidesRecursivo {

	static int obtenerMcd(int a, int b) {
		if(b == 0)
			return a;
		else
			return obtenerMcd(b, a % b);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("¿Cual es el mcd de 4 y 12?: " + obtenerMcd(4,12));
		System.out.println("¿Cual es el mcd de 8 y 12?: " + obtenerMcd(8,12));
		System.out.println("¿Cual es el mcd de 4 y 17?: " + obtenerMcd(4,17));
		System.out.println("¿Cual es el mcd de 96 y 36?: " + obtenerMcd(96,36));
		
	}

}
