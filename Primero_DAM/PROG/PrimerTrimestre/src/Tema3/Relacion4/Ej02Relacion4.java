/**
 * 
 */
package Tema3.Relacion4;
import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej02Relacion4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca su nombre: ");
		int edad = scan.nextInt();
		System.out.print("Introduzca su DNI sin letra: ");
		int dni = scan.nextInt();
		System.out.print("Introduzca la letra de su DNI:");
		String letra = scan.next();
		
		System.out.println("DNI: " + dni + letra);
		System.out.println(dni + edad);
	}

}
