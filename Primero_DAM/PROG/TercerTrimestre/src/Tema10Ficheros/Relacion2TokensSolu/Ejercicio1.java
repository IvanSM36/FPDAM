package Tema10Ficheros.Relacion2TokensSolu;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) throws FileNotFoundException {

		String linea = "";
		final String delimitador = ";";
		String edad = null;
		String trabajo = null;
		String[] token = null;

		try {
			String filePath = "csv/Empleados.csv";
			FileReader fileReader = new FileReader(filePath);

			BufferedReader reader = new BufferedReader(fileReader);

			while (reader.ready()) {
				linea = reader.readLine();
				token = linea.split(delimitador); // separate every token by comma
				System.out.println(token[0] + token[1] + token[2] + token[3]);

				if (token[1].equals("Alex Johnson")) {

					edad = token[2];
					trabajo = token[3];
				}
			}

			System.out.println("************ La edad de Alex Johnson es: " + edad + " \n Y su trabajo es: " + trabajo);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
