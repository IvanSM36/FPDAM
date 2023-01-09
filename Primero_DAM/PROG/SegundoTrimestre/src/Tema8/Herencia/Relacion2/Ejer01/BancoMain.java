package Tema8.Herencia.Relacion2.Ejer01;
import java.util.Scanner;

public class BancoMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cuenta de ahorros");
		System.out.println("Ingrese saldo inicial:");
		float saldoInicialAhorros = scan.nextFloat();
		System.out.print("Ingrese tasa de interés: ");
		float tasaAhorros = scan.nextFloat();
		CuentaAhorros cuenta1 = new //De
		CuentaAhorros(saldoInicialAhorros, tasaAhorros);
		System.out.print("Ingresar cantidad a consignar: ");
		float cantidadDepositar = scan.nextFloat();
		cuenta1.consignar(cantidadDepositar);
		System.out.print("Ingresar cantidad a retirar: ");
		float cantidadRetirar = scan.nextFloat();
		cuenta1.retirar(cantidadRetirar);
		cuenta1.extractoMensual();
		cuenta1.imprimir();
	}

}
