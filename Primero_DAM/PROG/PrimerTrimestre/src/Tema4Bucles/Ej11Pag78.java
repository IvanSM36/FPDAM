/**
 * 
 */
package Tema4Bucles;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej11Pag78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		int num = scan.nextInt();
		int cuadrado = 0;
		int cubo = 0;
		
		
		System.out.printf("%-10s %-12s %-5s \n", " Nombre", "Cuadrado", "Cubo");
		System.out.println("-----------------------------");
		for(int i = 0; i < 5; i++) {
			
			cuadrado = num * num;
			cubo = cuadrado * num;		
			System.out.printf("%2s %-4s %-5s %-6s %-2s %-5s \n", " ", num, "|", cuadrado,"|", cubo);
			num++;
		}
	}

}
