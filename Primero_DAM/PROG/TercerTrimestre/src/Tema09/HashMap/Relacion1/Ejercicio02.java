package Tema09.HashMap.Relacion1;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio02 {

	public static void main(String[] args) {		
		
		// Variables
		int poscionRandom = 0;
		int monedaRandom = 0;
		
		// Declaro el HashMap para las posiciones
		HashMap<Integer, String> posicion = new HashMap<Integer, String>();
		
		posicion.put(0, "Cara");
		posicion.put(1, "Cruz");
	
		// Declaro el hashMap monedas
		HashMap<Integer, String> moneda = new HashMap<Integer, String>();	

		moneda.put(0, "1, centimo");
		moneda.put(1, "2, centimos");
		moneda.put(2, "5, centimos");
		moneda.put(3, "10, centimos");
		moneda.put(4, "20, centimos");
		moneda.put(5, "50, centimos");
		moneda.put(6, "1, euro");
		moneda.put(7, "2, euros");
		
		System.out.println("Muestro las monedas randoms");
		System.out.println("---------------------------");
		
		for (int i = 0; i < 6 ; i++) {
			poscionRandom = (int)(Math.random()*2);
			monedaRandom = (int)(Math.random()*8);
			System.out.println(moneda.get(monedaRandom) + " - " + posicion.get(poscionRandom));
		}
		
	}

}
