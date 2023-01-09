package Tema9.ArrayList.Pruebas;
import java.util.ArrayList;
import java.util.Iterator;

public class Prueba03 {

	public static void main(String[] args) {

		ArrayList<Gato> g = new ArrayList<Gato>();
		
		g.add(new Gato("Garfield", "Naranja", "Mestizo"));
		g.add(new Gato("Pepe", "gris", "Angora"));
		g.add(new Gato("Mauri", "Blanco", "Manx"));
		g.add(new Gato("Ulises", "Marron", "Persa"));
		
		System.out.println("Nombre de los gatos con Iterator: ");
		Iterator<Gato> it = g.iterator();
		while(it.hasNext()) {
			Gato nombre = it.next();
			System.out.println(nombre.getNombre());
		}
		
		System.out.println();
		System.out.println("Nombre de los gatos con For each: ");
		
		for(Gato gatoAux: g) {		
			System.out.println(gatoAux.getNombre());
		}
	}

}
