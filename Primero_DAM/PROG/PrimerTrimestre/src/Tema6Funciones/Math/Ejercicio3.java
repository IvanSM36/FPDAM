package Tema6Funciones.Math;

/* 
*@author 
**************************************************
				
**************************************************
				Ejercicio 3
				Programa que lea por pantalla 4 números positivos 
				y de como salida el mayor y el menor de los números introducidos.
			
***************************************************
*/
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int minimo1 = 0;
		int minimo2 = 0;
		int minimo = 0;
		int maximo1 = 0;
		int maximo2 = 0;
		int maximo = 0;
		System.out.println("**************************************************");
		System.out.println("Introduce cuatro numeros positivos ");
		System.out.println("**************************************************");

		System.out.println("Introduce el primer numero");
		num1 = s.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = s.nextInt();
		System.out.println("Introduce el tercer numero");
		num3 = s.nextInt();
		System.out.println("Introduce el cuarto numero");
		num4 = s.nextInt();

		minimo1 = Math.min(num1, num2);
		minimo2 = Math.min(num3, num4);
		minimo = Math.min(minimo1, minimo2);
		System.out.println("El menor de los numeros introducidos :" + minimo);

		maximo1 = Math.max(num1, num2);

		maximo2 = Math.max(num3, num4);
		maximo = Math.max(maximo1, maximo2);
		System.out.println("El mayor  de los numeros introducidos :" + maximo);

	}

}
