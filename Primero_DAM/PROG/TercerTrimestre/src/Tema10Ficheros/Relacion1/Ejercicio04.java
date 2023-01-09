package Tema10Ficheros.Relacion1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio04 {

	public static void main(String[] args) {

		String ficheroLeer = "src/Tema11Ficheros/Ficheros/Deportistas.txt";
		String ficheroLeer2 = "src/Tema11Ficheros/Ficheros/malaga.txt";
		String newFichero = "src/Tema11Ficheros/Ficheros/DosEnUno.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ficheroLeer));
			BufferedReader br2 = new BufferedReader(new FileReader(ficheroLeer2));
			BufferedWriter bw = new BufferedWriter(new FileWriter(newFichero,true));
		
			String linea;
			
			bw.write("NOMBRE" + ";" + "RANGO" + ";" + "SUELDO" + "\n");
			// Mientras el buffer esta preparado
			while (br.ready() && br2.ready()) {
				linea = br.readLine(); // leo una linea del buffer
				bw.write(linea + ", ");
				bw.write("\n");
				linea = br2.readLine();
				bw.write(linea + ", ");
				bw.write("\n");
				System.out.print(linea); // Muestro la linea leida
				
			}

			br.close();
			br2.close();
			bw.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}

	}

}
