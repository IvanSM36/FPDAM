package Tema10Ficheros.PruebaBinario;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Prueba01 {

	public static void main(String[] args) {
		
		String ficheroBin = "src/Tema11Ficheros/Ficheros/nota.dat";

		try {
			DataOutputStream ficheroNotas = new DataOutputStream(new FileOutputStream(ficheroBin));
			// Esribo la cadena
			ficheroNotas.writeUTF("Ivan");
			// Escribo el valor
			ficheroNotas.writeDouble(6.9);
			
			ficheroNotas.close();
			
		}catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}
		
	}

}
