package Tema5.EnClases;

import java.util.Scanner;

public class Prueba03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduzca el nombre: ");
		String nombre = scan.next();
		
		int contador = 0;
		
		String alumnos[] = new String[10];
		alumnos[0] = "Juan";
		alumnos[1] = "Maria";
		alumnos[2] = "Antonio";
		alumnos[3] = "Jose";
		alumnos[4] = "Juan";
		alumnos[5] = "Diego";
		alumnos[6] = "Juan";
		alumnos[7] = "Jose";
		alumnos[8] = "Manolo";
		alumnos[9] = "Carlos";
		
		for(int i = 0; i < alumnos.length; i++) {		
			if(alumnos[i].equals(nombre))
				contador ++;			
		}
		
		System.out.print("Hay " + contador + " que se llaman " + nombre);
	}

}