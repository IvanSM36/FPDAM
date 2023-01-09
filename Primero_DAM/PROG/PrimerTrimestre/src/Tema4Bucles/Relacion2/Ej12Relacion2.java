/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej12Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sumaEdad = 0;
		int sumaAltura = 0;
		int mediaEdad = 0;
		int mediaAltura = 0;
		int mayores = 0;
		int altura = 0;
		int contador = 0;
		
		System.out.println("Este programa pide y muestra datos de alumnos.");
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Introduzca edad del alumno" + i + ": ");
			int edad = scan.nextInt();
			System.out.print("Introduzca estatura del alumno " + i + ": ");		
			double estatura = scan.nextDouble();
			
			contador++;
			
			sumaEdad += edad;
			mediaEdad = edad / contador;
			sumaAltura += altura;
			mediaAltura= altura / contador;
			
			if (edad >= 18) 
				mayores ++;
			if (estatura >= 1.75) {
				altura ++;
			}
		}
		
		System.out.println("La media de edades es: " + mediaEdad);
		System.out.println("La media de la altura es: " + mediaAltura);
		System.out.println("Alumnos mayores de 18: " + mayores);
		System.out.println("Alumnos con altura mayor a 1.75" + altura);
	}

}
