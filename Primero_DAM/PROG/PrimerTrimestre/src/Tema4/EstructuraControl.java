/**
 * 
 */
package Tema4;


import java.util.Scanner;
/**
 * @author Ang
 *
 */
public class EstructuraControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero =0;
		Scanner consola = new Scanner(System.in);
		do {
			
			System.out.println("Introduce un número de 0 a 100");
			
			numero=consola.nextInt();
			
		}while(numero<0 || numero>100);
		
		System.out.println("El número introducido es:" +numero);
		

	}

}