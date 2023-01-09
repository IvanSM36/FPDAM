package Tema10Ficheros.PruebaCaracteres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Prueba07 {

	public static void main(String[] args) {
		
		String ficheroLeer = "src/Tema11Ficheros/Ficheros/PruebaTokenizer.txt";
		String ficheroWriter = "src/Tema11Ficheros/Ficheros/PruebaTokenizer2.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ficheroLeer));
			BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroWriter,true));
			String linea = null;

			// Mientras el buffer esta preparado
			while (br.ready()) {
				linea = br.readLine(); // leo una linea del buffer
			}

			// indico que separe por tokens.
			StringTokenizer tokens = new StringTokenizer(linea,"-");

			
			// imprimo los tokens
			while(tokens.hasMoreTokens()) {
				String token = tokens.nextToken();
				bw.write(token + " ");
				System.out.println("- " + token);
			}
			bw.close();
			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}

	}

}
