/**
 * 
 */
package Tema7POO.Relacion1;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class PersonaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();
		// Datos Persona1
		System.out.println("Rellena datos Persona 1");
		System.out.println("-----------------------");
		System.out.print("Introduzca nombre: ");
		String nombre = scan.next();
		persona1.setNombre(nombre);
		System.out.print("Introduzca apellido: ");
		String apellido = scan.next();
		persona1.setApellido(apellido);
		System.out.print("Introduzca edad: ");
		int edad = scan.nextInt();
		persona1.setEdad(edad);
		System.out.print("Introduzca sexo: ");
		char sexo = scan.next().charAt(0);
		persona1.setSexo(sexo);
				
		System.out.println();
		// Datos Persona2
		System.out.println("Rellena datos Persona 2");
		System.out.println("-----------------------");		
		System.out.print("Introduzca nombre: ");
		nombre = scan.next();	
		System.out.print("Introduzca apellido: ");
		apellido = scan.next();	
		System.out.print("Introduzca edad: ");
		edad = scan.nextInt();	
		System.out.print("Introduzca sexo: ");
		sexo = scan.next().charAt(0);
		// Le doy los datos recogidos al objeto persona2
		Persona persona2 = new Persona(nombre,apellido, edad, sexo);
		System.out.println();
		
		// Aplico el metodo toString
		System.out.println("Datos de persona 1");
		System.out.println("-----------------");
		System.out.println(persona1);
		System.out.println();
		System.out.println("Datos de persona 2");
		System.out.println("-----------------");
		System.out.println(persona2);
		System.out.println();
		
		//Saludar
		persona1.saludar(persona2);	

	}

}
