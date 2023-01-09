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
public class Ej08Pag115 {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double radio,alt;
        double resultado[]; //esta tabla no necesita new, ya que apunta a
                            // la tabla creada dentro de la función
        System.out.print("Introduzca radio: ");
        radio=scan.nextDouble();
        System.out.print("Introduzca altura: ");
        alt=scan.nextDouble();
        
        resultado = Funciones.areaVolCilindro(radio,alt); // resultado hace referencia a la tabla devuelta
                                                       // por la función.
        System.out.println("El volumen es de: " + resultado[0]);
        System.out.println("El área es de: " + resultado[1]);
		    
	}

}
