package Tema6Funciones.Math;

/* 
*@author 
**************************************************
				Ejercicio 7
	
			Implemente la siguiente función en Java 
			para valor de x = 0
			El resultado correcto de la función para x = 0 es 0.1157073988501937
				
*/
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x = 0.0;
		System.out.println("Vamos a mostrar los valores de una funcion f(x)= para x= 0 ");
		double funcionx;
		double potencia1 = Math.pow(x, 3);
		double exp = Math.pow(Math.E, potencia1);
		double a = potencia1 + ((2 * x) / 9);
		double b = ((Math.PI * 6) + Math.tan(Math.pow(Math.E, potencia1)));
		funcionx = Math.sqrt((Math.sin(a) + Math.cos(b)));

		System.out.println(funcionx);

	}
}