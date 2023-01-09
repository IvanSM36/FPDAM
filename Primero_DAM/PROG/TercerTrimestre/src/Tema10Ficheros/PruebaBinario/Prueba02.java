package Tema10Ficheros.PruebaBinario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Prueba02 {

	public static void main(String[] args) {
		
	
		String ficheroBin = "src/Tema11Ficheros/Ficheros/nota.dat";

		try {
			DataInputStream ficheroNotas = new DataInputStream(new FileInputStream(ficheroBin));
			// Lee una cadena en formato UTF
			String nombre = ficheroNotas.readUTF();
			//Leo un double
			double nota = ficheroNotas.readDouble();
			
			System.out.println("Nombre: " + nombre + "\nNota: " + nota);
			
			ficheroNotas.close();
			
		}catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}
	}

}
