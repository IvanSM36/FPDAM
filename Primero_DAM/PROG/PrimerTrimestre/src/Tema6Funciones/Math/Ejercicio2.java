package Tema6Funciones.Math;

/* 
*@author 
**************************************************
				Ejercicio 2
				
Escribir un programa que lea del teclado un ángulo en grados
 y muestre en pantalla su seno, coseno y tangente. 
 Ojo que hay que hacer una conversión de grados a radianes, porque los metodos solo aceptan radianes
			
***************************************************
*/
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		double valor = 0;
		double angulo = 0;
		double anguloradianes = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un angulo en grados y le calcularemos el seno, coseno y tangente");

		angulo = s.nextDouble();
		anguloradianes = Math.toRadians(angulo);// convertimo a radianes
		valor = Math.sin(anguloradianes); // valor del seno
		System.out.println("Seno de " + angulo + "  = " + valor);
		valor = Math.cos(anguloradianes); // valor del coseno
		System.out.println("Coseno de " + angulo + "  = " + valor);
		valor = Math.tan(anguloradianes); // valor de la tangente
		System.out.println("Tangente de " + angulo + "  = " + valor);

	}

}
