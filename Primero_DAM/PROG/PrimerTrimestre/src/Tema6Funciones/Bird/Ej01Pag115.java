/**
 * 
 */
package Tema6Funciones.Bird;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej01Pag115 {

	/**
	 * @param args
	 */
	
	//Funciones
	
	public static void mostrar(int num) {
		for(int i = 0 ; i < num; i++) {
			System.out.println("Modulo ejecutandose");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un numero:");
		int num = scan.nextInt();
		System.out.println("---------------------------");
		mostrar(num);
		System.out.println("---------------------------");

 		
	}

}
