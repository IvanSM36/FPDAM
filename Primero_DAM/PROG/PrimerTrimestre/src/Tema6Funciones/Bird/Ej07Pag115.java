/**
 * 
 */
package Tema6Funciones.Bird;

import java.util.Scanner;

import Tema6Funciones.Bird.Funciones.Funciones;
/**
 * @author IvanSM
 *
 */
public class Ej07Pag115 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double radio,alt;
        char tipo_calculo;
        System.out.print("Introduzca radio: ");
        radio= scan.nextDouble();
        System.out.print("Introduzca altura: ");
        alt= scan.nextDouble();
        System.out.print("Que desea calcular (a/v): ");
        tipo_calculo = scan.next().charAt(0);
        System.out.println("");
        
       Funciones.areaOvolCilindro(radio,alt,tipo_calculo);
	}

}
