package Tema9.ArrayList.Pruebas;
import java.util.Collections;
import java.util.ArrayList;

public class Prueba05 {

	public static void main(String[] args) {

		ArrayList<Gato> g = new ArrayList<Gato>();
		
		g.add(new Gato("Garfield", "Naranja", "Mestizo"));
		g.add(new Gato("Pepe", "gris", "Angora"));
		g.add(new Gato("Mauri", "Blanco", "Manx"));
		g.add(new Gato("Ulises", "Marron", "Persa"));
		
		System.out.println("Nombre de los gatos");	
		for (Gato gatoAux: g) {
			System.out.println(gatoAux.nombre);
		}	
		System.out.println();
		
		Collections.sort(g);
		
		System.out.println("Nombre de los gatos ordenados por Nombres");	
		for (Gato gatoAux: g) {
			System.out.println(gatoAux.nombre);
		}
	}

}
