/**
 * 
 */
package Tema7POO.Relacion1;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class CuentaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Cuenta cuenta1 = new Cuenta ("Ivan", 1000);
		Cuenta cuenta2 = new Cuenta ("Adrian");
				
		
		System.out.println(cuenta1);
		System.out.println();
		
		// ingresar dinero en las cuentas
		System.out.println("¿Cuanto saldo quieres ingresar?");
		int ingreso = scan.nextInt();
		cuenta1.ingresar(ingreso);
		
		System.out.println();
		
		// Retiro dinero
		System.out.println("¿Cuanto saldo vas a retirar?");
		int retiro = scan.nextInt();
		cuenta1.retirar(retiro);
		
		System.out.println();
		System.out.println(cuenta2);
	}

}
