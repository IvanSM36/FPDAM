package Tema10Ficheros.Relacion2TokensSolu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio4 {

	public static void main(String[] args) throws FileNotFoundException {

		String line = "";
		int count = 0;
		int count2 = 0;
		try {
			String filePath = "catalogo.txt";
			FileReader fileReader = new FileReader(filePath);

			BufferedReader reader = new BufferedReader(fileReader);
			BufferedWriter bw = new BufferedWriter(new FileWriter("uno.txt", false));

			// Imprimimos las 20 primeras líneas del archivo
			while (reader.ready() && count < 20) {
				line = reader.readLine();
				count++;
				System.out.println("********** Líneas: " + line);
				System.out.println("********** Número: " + count);

			}

			// Volcamos las 5 primeras líneas en un archivo cuatro.txt
			while (reader.ready() && count2 < 5) {
				line = reader.readLine();
				bw.write(line + "\n");
				count2++;

			}
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
