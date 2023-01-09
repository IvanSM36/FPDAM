package Tema10Ficheros.PruebaBinario;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Prueba03 {

	public static void main(String[] args) {
		String datosFichero = "src/Tema11Ficheros/Ficheros/nota.dat";
		String mediaNotas = "src/Tema11Ficheros/Ficheros/MediaNotas.txt";

		try {
			DataOutputStream ficheroBinEscribir= new DataOutputStream(new FileOutputStream(datosFichero));
			DataInputStream ficheroBinLeer = new DataInputStream(new FileInputStream(datosFichero));
			BufferedWriter bw = new BufferedWriter(new FileWriter(mediaNotas));

			// Esribo la cadena
			ficheroBinEscribir.writeUTF("Ivan");
			// Escribo el valor
			ficheroBinEscribir.writeDouble(6.9);
			ficheroBinEscribir.writeUTF("Mario");
			ficheroBinEscribir.writeDouble(8.9);
			ficheroBinEscribir.writeUTF("Antonio");
			ficheroBinEscribir.writeDouble(7.9);
			
			ficheroBinEscribir.close();
			
			// Lee una cadena en formato UTF
			String nombre = ficheroBinLeer.readUTF();
			//Leo un double
			double nota = ficheroBinLeer.readDouble();
			String nombre2 = ficheroBinLeer.readUTF();
			double nota2 = ficheroBinLeer.readDouble();
			String nombre3 = ficheroBinLeer.readUTF();
			double nota3 = ficheroBinLeer.readDouble();
			
			System.out.println("Nombre: " + nombre + "\nNota: " + nota);
			System.out.println("Nombre: " + nombre2+ "\nNota: " + nota2);
			System.out.println("Nombre: " + nombre3 + "\nNota: " + nota3);
			
			
			double suma = 0;
			
			for (int i = 0; i < 3; i++) {
				@SuppressWarnings("unused")
				String name = ficheroBinLeer.readUTF(); 
				double calificacion =ficheroBinLeer.readDouble();
				suma += nota;
			}
			
			bw.write("Nota media: " + String.format("%.2f", suma/3));
			
			bw.close();
			ficheroBinEscribir.close();

			
		}catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}
	}

}
