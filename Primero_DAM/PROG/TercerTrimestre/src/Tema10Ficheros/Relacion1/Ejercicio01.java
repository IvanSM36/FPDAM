package Tema10Ficheros.Relacion1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		boolean esPrimo = true;
		String ficheroEscribir = "src/Tema11Ficheros/Ficheros/NumerosPrimos.txt";
		
		try {BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroEscribir,true));
			 
			for (int num = 2; num <= 500; num++) {
				// comprueba si num es primo
				esPrimo = true;
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						esPrimo = false;
					}
				}
				// si num es primo lo guardamos en el fichero
				if (esPrimo) {
					//Escribo en el ficheroEscribir
					bw.write(num + "\n");
				}
							
			}
				
			bw.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}

	}

}
