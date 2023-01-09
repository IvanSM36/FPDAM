/**
 * 
 */
package Tema4;
import java.util.Scanner;
/**
 * @author IvanSM
 *
 */
public class Ej14Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el caracter para pinta: ");
		String pintar = scan.next();
		System.out.println("Hacia donde quieres que apunte la pirámide?");
		System.out.println("1. Hacia arriba.");
		System.out.println("2. Hacia abajo.");
		System.out.print("Respuesta: ");
		int respuesta = scan.nextInt();
		
		if (respuesta == 1) {
			System.out.println(" " + " " + " " + " "+ pintar);
			System.out.println(" " + " " + " " +pintar + pintar + pintar);
			System.out.println(" " + " " + pintar + pintar + pintar + pintar + pintar );
			System.out.println(" " + pintar + pintar + pintar  + pintar  + pintar  + pintar + pintar);	
			System.out.println(pintar + pintar + pintar  + pintar  + pintar + pintar + pintar + pintar + pintar);
		}
		if (respuesta == 2) { 
			System.out.println(pintar + pintar + pintar  + pintar  + pintar + pintar + pintar + pintar + pintar);
			System.out.println(" " + pintar + pintar + pintar  + pintar  + pintar  + pintar + pintar);	
			System.out.println(" " + " " + pintar + pintar + pintar + pintar + pintar );
			System.out.println(" " + " " + " " +pintar + pintar + pintar);
			System.out.println(" " + " " + " " + " "+ pintar);
		}
	}

}
