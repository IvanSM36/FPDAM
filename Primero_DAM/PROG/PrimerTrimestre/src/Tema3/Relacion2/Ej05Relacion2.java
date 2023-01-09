/**
 * 
 */
package Tema3.Relacion2;

/**
 * @author IvanSM
 *
 */
public class Ej05Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int fah = 86;
 		int celsius = 32;
 		
 		int pasarCelsius = (((fah -32)/9)*5);
 		int pasarFah = (((celsius *9)/5)+32);
 		
 		System.out.println(fah + " Grados Fahrenheit son: " + pasarCelsius + " Grados Celsius.");
 		System.out.println(celsius + " Grados Celsius son: " + pasarFah + " Grados Fahrenheit.");
		
	}

}
