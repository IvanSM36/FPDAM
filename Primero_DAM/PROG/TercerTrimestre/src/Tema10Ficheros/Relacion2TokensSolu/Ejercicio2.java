package Tema10Ficheros.Relacion2TokensSolu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) throws FileNotFoundException {

		String line = "";
		final String delimiter = ";";
		String[] token = null;
		String directivo = null;
		String sueldo = null;

		try {
			String filePath = "csv/empresaSamar.csv";
			FileReader fileReader = new FileReader(filePath);

			BufferedReader reader = new BufferedReader(fileReader);

			while (reader.ready()) {
				line = reader.readLine();// Leo línea a línea
				// System.out.println("***********" + line);
				token = line.split(delimiter);
				if (token[2].equals("INFORMATICA")) {
					if (token[3].equals("DIRECTIVO")) {
						System.out.println("El sueldo de " + token[0] + "es: " + token[4]);
						directivo = token[0];
						sueldo = token[4];
					}
				}
			}

			/// Escribimos en el fichero
			BufferedWriter bw = new BufferedWriter(new FileWriter("nuevoToken.txt", false));
			bw.write("El sueldo del directivo " + directivo + "es:" + sueldo);
			reader.close();
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
