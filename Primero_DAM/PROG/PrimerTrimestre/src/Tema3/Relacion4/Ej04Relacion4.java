/**
 * 
 */
package Tema3.Relacion4;
import java.util.Scanner;
/**
 * @author IvanSM
 *
 */
public class Ej04Relacion4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca el valor de tu primer examen: ");
		int nota = scan.nextInt();
		System.out.print("Introduzca el valor de tu segundo examen: ");
		int nota2 = scan.nextInt();
		System.out.print("Introduzca el valor de tu tercer examen: ");
		int nota3 = scan.nextInt();
		
		int media = (nota + nota2 + nota3) /3;
		System.out.println("La nota media es: " + media);
	}

}