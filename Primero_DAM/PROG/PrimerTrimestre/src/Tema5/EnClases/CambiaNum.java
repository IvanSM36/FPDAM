/**
 * 
 */
package Tema5.EnClases;
import java.util.Scanner;
/**
 * @author IvanSM
 *
 */
public class CambiaNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int [5];
		int posicion;
		int nuevoNum;
		 
		//Rellenamos el array con numeros randoms
		for (int i = 0; i < num.length; i++ ) {
			num[i] = (int)(Math.random()*101);		
		}
		//Mostramos el array
		System.out.println("Array original");
		System.out.println("---------------------------------");
		System.out.print ("Indice ");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%5s", i);
		}
		System.out.println();
		System.out.print("Valor  ");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%5s", num[i]);
		}
		System.out.println();
		System.out.println("---------------------------------");
		//Filtramos que la posicion sea de 0 al 4
		do {
			System.out.print("¿Que posicion quieres cambiar?: ");
			posicion = scan.nextInt();
			if (posicion < 0 || posicion > 4) {
				System.out.println("Arfavo mete una posicion del 0 al 4");
			}
		} while(posicion < 0 || posicion > 4);
		
		do {
			System.out.print("¿Que numero entre 0 y 100 quieres introducir?: ");
			nuevoNum = scan.nextInt();
			if (nuevoNum < 0 || nuevoNum > 100) {
				System.out.println("Arfavo mete un numero del 0 al 100");
			}
		} while (nuevoNum < 0 || nuevoNum > 100);
		
		for (int i = 0; i < num.length; i++) {
			if (posicion == i) {
				num[i] = nuevoNum;
			}			
		}
		System.out.println();
		//Mostramos el cambio
		System.out.println("Array cambiado");
		System.out.println("---------------------------------");
		System.out.print ("Indice ");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%5s", i);
		}
		System.out.println();
		System.out.print("Valor  ");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%5s", num[i]);
		}
		System.out.println();
		System.out.println("---------------------------------");
	}

}
