/**
 * 
 */
package Tema3.Relacion4;
import java.util.Scanner;
/**
 * @author IvanSM
 *
 */
public class Ej03Relacion4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca cantidad de pesetas: ");
		double pesetas = scan.nextInt();
		
		double euros = pesetas / 166.386;
		
		System.out.printf( pesetas + " pesetas son: " + euros + " euros.");
		
	}

}
