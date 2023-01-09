package Tema6Funciones.Math;
/* 
*@author 
**************************************************
				Ejercicio 8
	Programa que pida por pantalla 2 números reales negativos,
    pasarlos a positivo con el valor absoluto, 
    redondear hacia arriba esos números, hacer
	la conversión de grados a radianes, y decir cuál de los dos en mayor.
*******************************************************
*/

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x = 0.0;
		double mayor = 0;
		System.out.println("Introduce un  numero1 real negativo ");
		double num1 = s.nextInt();
		System.out.println("Introduce un  numero2 real negativo ");
		double num2 = s.nextInt();

		System.out.println("valor absoluto del numero 1 " + Math.abs(num1));

		System.out.println("valor absoluto del numero 2 " + Math.abs(num2));

		System.out.println("valor redondeo por arriba del numero 1" + Math.ceil(num1));
		System.out.println("valor redondeo por arriba del numero 2" + Math.ceil(num2));
		System.out.println("valor conversion a radianes  del numero 1" + Math.toRadians(num1));
		System.out.println("valor conversion a radianes  del numero 2" + Math.toRadians(num2));

		if (num1 > num2) {
			mayor = num1;
		} else {
			mayor = num2;

		}

		System.out.println("el valor " + mayor);

	}
}