/**
 * 
 */
package Tema7POO.Relacion1;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Persona2Main {

	/**
	 * @param args
	 */
	
	// Funciones
	public static void mensajePeso(Persona2 p) {
		System.out.println("Informacion sobre el peso de " + p);
		System.out.println("--------------------------");
		int imc = p.calcularIMC();
		if (imc == p.peso_ideal)
			System.out.println("Estas en el peso ideal.");
		if (imc == p.infrapeso)
			System.out.println("Tu peso está por debajo de tu peso ideal.");
		if (imc == p.sobrepeso)
			System.out.println("Tu peso está por encima de tu peso ideal.");

	}
	
	public static void compruebaEdad(Persona2 p) {
		System.out.println("Edades");
		System.out.println("------");		
		if (p.esMayorDeEdad(0)) {
			System.out.println(p + "Es mayor de edad");
		} else {
			System.out.println(p + "No es mayor de edad");
		}	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduzca tu nombre: ");
		String nombre = scan.nextLine();
		System.out.print("Introduzca la edad: ");
		int edad = scan.nextInt();
		System.out.print("¿Eres Hombre o Mujer? (H/M): ");
		char sexo = scan.next().toLowerCase().charAt(0);
		System.out.print("Introduzca tu peso: ");
		double peso = scan.nextDouble();
		System.out.print("Introduzca tu altura: ");
		double altura = scan.nextDouble();

		// Creo los objetos
		Persona2 personal = new Persona2(nombre, edad, sexo, peso, altura);
		Persona2 personal2 = new Persona2(nombre, edad, sexo);
		Persona2 personal3 = new Persona2();
		System.out.println();

		// Doy datos a personal3 con setters.
		personal3.setNombre("Rodrigo");
		personal3.setEdad(26);
		personal3.setSexo('h');
		personal3.setPeso(75);
		personal3.setAltura(1.77);

		// Muestros los IMC de los objetos
		mensajePeso(personal);
		mensajePeso(personal2);
		mensajePeso(personal3);

		// Indico si son mayores de edad o no
		compruebaEdad(personal);
		compruebaEdad(personal2);
		compruebaEdad(personal3);
		
		// Llamada al metodo toString
		System.out.println(personal);
		System.out.println();
		System.out.println(personal2);
		System.out.println();
		System.out.println(personal3);
	}

}