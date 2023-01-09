package Tema6Funciones.Math;

/* 
*@author 
**************************************************
				Ejercicio 1
			Programa que lea un double del teclado 
			y redondea a enteros de 3 formas:
			• Entero más cercano.
			• Entero más cercano por arriba.
			• Entero más cercano por abajo
			ceil Entero más cercano en dirección a infinito
			floor Entero más cercano en dirección a -infinito		
			round Entero más cercano al argumento
***************************************************
*/
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		double numero = 0;
		int redondeo1 = 0;
		int redondeo2 = 0;
		int redondeo3 = 0;

		Scanner consola = new Scanner(System.in);

		System.out.println("**************************************************");
		System.out.println("Introduce un double para redondear  ");
		System.out.println("**************************************************");
		numero = consola.nextDouble();
		System.out.println(numero);
		redondeo1 = (int) Math.ceil(numero);
		redondeo2 = (int) Math.floor(numero);
		redondeo3 = (int) Math.round(numero);

		System.out.println("Entero por arriba " + redondeo1);
		System.out.println("Entero por abajo " + redondeo2);
		System.out.println("Entero mas cercano " + redondeo3);

	}
}