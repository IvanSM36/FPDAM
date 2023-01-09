/**
 * 
 */
package Tema3.Relacion4;
import java.util.Scanner;
/**
 * @author IvanSM
 *
 */
public class Ej01Relacion4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Como te llamas?");
		String nombre = scan.nextLine();
		String saludo = "Hola";
		
		System.out.println(saludo + " " +  nombre);
		
		
	}

}
