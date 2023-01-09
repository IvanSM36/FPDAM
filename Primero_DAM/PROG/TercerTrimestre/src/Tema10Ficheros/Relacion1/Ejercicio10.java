package Tema10Ficheros.Relacion1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Agenda miAgenda = new Agenda();

		try {

			String nombre = args[0];
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			String linea;

			// Mientras el buffer esta preparado
			while (br.ready()) {
				linea = br.readLine(); // leo una linea del buffer
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(nombre));

			bw.close();

		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}

		int opcion = 0;

		do {
			System.out.println("┌─────────────────────────────────────────┐");
			System.out.println("│  1º Añadir contacto. (nombre, telefono) |");
			System.out.println("│  2º Eliminar contacto.                  │");
			System.out.println("│  3º Mostrar todos los contactos.        │");
			System.out.println("│  0º Salir.                              │");
			System.out.println("└─────────────────────────────────────────┘");

			System.out.print("Introduzca una opcion: ");
			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Introduzca nombre del contacto: ");
				String nombre = scan.next();
				System.out.print("Introduzca numero de telefono: ");
				int numero = scan.nextInt();
				miAgenda.agregarContacto(new Contacto(nombre, numero));
				break;
			case 2:
				System.out.print("Introduzca el nombre a borrar: ");
				nombre = scan.next();
				miAgenda.eliminarContacto(nombre);
				break;
			case 3:
				miAgenda.mostrarContactos();
				break;

			default:
				System.out.println("Has cerrado la agenda.");
				break;
			}

		} while (opcion != 0);

	}

}
