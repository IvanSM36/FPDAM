package Tema10Ficheros.PruebaCaracteres;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prueba01 {

	public static void main(String[] args) {

		Leer_Fichero accediendo = new Leer_Fichero();
		
		accediendo.lee();
		
	}

}

class Leer_Fichero {

	public void lee() {
		try {
			FileReader entrada = new FileReader("ejemplo.txt");
			int c = entrada.read();
			while(c != -1) {
				c = entrada.read();
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("No se puede abrir el archivo");
		}
	}

}