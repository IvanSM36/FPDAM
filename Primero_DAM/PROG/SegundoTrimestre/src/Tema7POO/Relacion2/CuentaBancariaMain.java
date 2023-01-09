/**
 * 
 */
package Tema7POO.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class CuentaBancariaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 // Pido los valores.
		 System.out.print("Introduzca DNI: ");
		 String dni = scan.next();
		 
		 System.out.print("Introduzca interes anual: ");
		 int interesAnual = scan.nextInt();
		 
		 // Creo el objeto cuenta y le doy valores		 
		 CuentaBancaria cliente1 = new CuentaBancaria(dni, 0, interesAnual);
		
		 // Ingresamos dinero
		 System.out.print("¿Cuanto vas a ingresar?: ");
		 double ingreso = scan.nextDouble();
		 cliente1.ingresar(ingreso);
		 System.out.println("Saldo actual: " + cliente1.getSaldoActual());

		 // Actualizamos el saldo 	 
		 System.out.println("Cuenta actualizada.");
		 cliente1.actualizarSaldo(interesAnual);
		 System.out.println("Saldo actual: " + cliente1.getSaldoActual());
		
		 // Retiramos dinero
		 System.out.print("¿Cuanto vas a retirar?");
		 double retirada =scan.nextDouble();
		 cliente1.retirar(retirada);
		 System.out.println("Saldo actual: " + cliente1.getSaldoActual());

		 // Mostramos los datos de la cuenta
		 cliente1.muestraInfo();
	}

}
