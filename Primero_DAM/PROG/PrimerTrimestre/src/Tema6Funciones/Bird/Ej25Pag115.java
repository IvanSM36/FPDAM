/**
 * 
 */
package Tema6Funciones.Bird;

import java.util.Scanner;

import Tema6Funciones.AJCE.FuncionesAzul;
import Tema6Funciones.Bird.Funciones.Funciones;

/**
 * @author IvanSM
 *
 */
public class Ej25Pag115 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5]; 
				
		Funciones.arrayRandom(array);
		System.out.print("¿Que numero quieres buscar?: ");
		int num = scan.nextInt();

		if(Funciones.buscaNum(num, array)) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No se ha encontrado");
		}
	}

}
