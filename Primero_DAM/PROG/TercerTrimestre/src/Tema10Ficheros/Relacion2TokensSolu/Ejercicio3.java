package Tema10Ficheros.Relacion2TokensSolu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ejercicio3 {

	public static void main(String[] args) throws FileNotFoundException {

		String line = "";
		try {
			String filePath = "csv/catalogo.csv";
			FileReader fileReader = new FileReader(filePath);

			BufferedReader reader = new BufferedReader(fileReader);
			BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/series.txt", false));

			while (reader.ready()) {
				line = reader.readLine();

				StringTokenizer tokens = new StringTokenizer(line, ",");

				while (tokens.hasMoreTokens()) {

					String nomSerie = tokens.nextToken();
					String numSecuencial = tokens.nextToken();
					String alias = tokens.nextToken();
					String archivo = tokens.nextToken();
					String descripcion = tokens.nextToken();

					System.out.println("NombreSerie " + nomSerie);
					System.out.println("numSecuencial " + numSecuencial);
					System.out.println("Alias " + alias);
					System.out.println("Archivo " + archivo);
					System.out.println("Descripcion " + descripcion);

					/// Escribimos en el fichero

					bw.write("El nombre de la serie es " + nomSerie + "\n");

				}

			}

			reader.close();
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
