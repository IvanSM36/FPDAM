package Tema10Ficheros.Relacion1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		if (args.length != 2) {
		      System.out.println("Uso del programa: FICHERO1 FICHERO2 MEZCLA");
		      System.exit(-1); // sale del programa
		    }
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(args[0]));	
			String nombre = args[0];
			 
			BufferedWriter bw = new BufferedWriter(new FileWriter(args[0].replace(".txt", "_sort.txt")));
			
			//Declaro el arrayList
			ArrayList<String> animales = new ArrayList<String>();

			String linea = "";
			// Mientras el buffer esta preparado
			while (br.ready()) {
				// leo una linea del buffer
				linea = br.readLine();
				// Añadimos la primera palabra del fichero en el arrayList
				animales.add(linea);
				// System.out.println(linea);	
			}
			br.close();

			// Ordenamos el arrayList por orden alfabetico
			Collections.sort(animales);
			
			//Recorro el arrayList para escribir en el fichero.
			for (String s: animales) {
		        bw.write(s + "\n");
		      }
			bw.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}

	}

}
