package Tema6Funciones.Math;

/* 
*@author 
**************************************************
				Ejercicio 6
				Escribir un programa que muestre en pantalla 
				una lista de valores para la función f para
				valores enteros de x en el intervalo [-100, 100]. 
				Considerar que x está en grados
				para el cálculo del seno y coseno.
					f(x)=sen (4·x) + cos (2·x)
*/
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Vamos a mostrar los valores de una funcion f(x)= sen(4x)+ cos(2x):");
		double funcionx;
		for (double i = -100; i <= 100; i++) {

			funcionx = Math.sin(4 * Math.toRadians(i)) + Math.cos(2 * Math.toRadians(i));
			System.out.println(funcionx);
		}

	}
}