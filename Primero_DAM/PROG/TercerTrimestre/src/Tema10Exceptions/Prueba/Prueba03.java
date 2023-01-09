package Tema10Exceptions.Prueba;

import java.util.Scanner;

public class Prueba03 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("Introduzca numero de manzanas: ");
		int m = scan.nextInt();
		System.out.print("Introduzca numero de personas: ");
		int p = scan.nextInt();
		
		try {
			System.out.println("A cada persona le corresponden " + reparteManzanas(m, p) + " manzanas.");
		} catch (Exception e) {
			System.out.println("Los datos introducidos no son correctos.");
		}
		
	}
	
	//Metodo
	
	public static int reparteManzanas(int manzanas, int personas) throws ArithmeticException{
		try {
			return manzanas / personas;
		}catch (ArithmeticException ae) {
			System.out.println("El numero de personas vale 0.");
			throw ae;
		} 
		catch (NumberFormatException nfe) {
			System.out.println("No puede introducir numeros decimales.");
			throw nfe;
		}
	}

}
