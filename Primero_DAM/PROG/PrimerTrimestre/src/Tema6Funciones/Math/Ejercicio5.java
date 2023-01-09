package Tema6Funciones.Math;

/* 
*@author 
**************************************************
				Ejercicio 5
			
	Programa lea la longitud de los catetos
	de un triángulo rectángulo y calcule la longitud 
	de la hipotenusa según el teorema de Pitágoras
	*/
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double cateto1 = 0;
		double cateto2 = 0;
		double sumacatetos = 0;
		double hipotenusa = 0;

		System.out.println("**************************************************");
		System.out.println("Introduzca la longitud de los catetos ");
		System.out.println("**************************************************");

		System.out.println("Introduzca el valor del cateto contiguo ");
		System.out.println("**************************************************");
		cateto1 = s.nextDouble();
		System.out.println("**************************************************");
		System.out.println("Introduzca el valor del cateto opuesto ");
		System.out.println("**************************************************");
		cateto1 = s.nextDouble();
		cateto1 = Math.pow(cateto1, 2);
		cateto2 = Math.pow(cateto2, 2);
		sumacatetos = cateto1 + cateto2;
		hipotenusa = Math.sqrt(sumacatetos);
		System.out.println("la hipotenusa " + hipotenusa);

	}
}
