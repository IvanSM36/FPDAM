package Tema10Ficheros.PruebaCaracteres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Prueba05 {

	public static void main(String[] args) {
		String ficheroLeer = "N4_Escribir.txt";
		String ficheroEscribir = "N5_Escribir.txt";

		FileWriter fichero = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(ficheroLeer));
			BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroEscribir,true));
			 
			String leerLinea;
			
			while (br.ready()) {
				//leo una linea del buffer
				leerLinea = br.readLine(); 
				
				//Escribo en el ficheroEscribir
				bw.write(leerLinea + ", ");
			}
		
			br.close();
			bw.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}
	}

}
