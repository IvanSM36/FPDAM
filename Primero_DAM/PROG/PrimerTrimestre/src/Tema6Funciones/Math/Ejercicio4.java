package Tema6Funciones.Math;

/* 
*@author 
		
**************************************************
				Ejercicio 4
			
	Programa que lee por teclado el valor del radio de una circunferencia
	y calcula y muestra por pantalla la longitud y el área de la circunferencia. 
	
			Longitud de la circunferencia = 2*PI*Radio;
			area de la circunferencia = PI*Radio^;
			
***************************************************
*/
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double radio = 0;

		double longitud = 0;

		double area = 0;

		System.out.println("**************************************************");
		System.out.println("Introduzca el radio de una circunferencia ");
		System.out.println("**************************************************");
		radio = s.nextDouble();
		longitud = 2 * Math.PI * radio;
		area = Math.PI * radio;
		System.out.println("Longitud de la circunferencia " + longitud);
		System.out.println("Area de la circunferencia " + area);

	}
}
