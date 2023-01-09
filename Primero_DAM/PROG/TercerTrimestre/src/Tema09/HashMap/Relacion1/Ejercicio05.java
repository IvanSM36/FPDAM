package Tema09.HashMap.Relacion1;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio05 {

	public static void main(String[] args) {
		ArrayList<Ejercicio05Carta> c = new ArrayList<Ejercicio05Carta>();
	    HashMap<String, Integer> h = new HashMap<String, Integer>();
	    int puntos = 0;
	    
	    h.put("as", 11);
	    h.put("dos", 0);
	    h.put("tres", 10);
	    h.put("cuatro", 0);
	    h.put("cinco", 0);
	    h.put("seis", 0);
	    h.put("siete", 0);
	    h.put("sota", 2);
	    h.put("caballo", 3);
	    h.put("rey", 4);
	      
	    Ejercicio05Carta Ejercicio05CartaAux = new Ejercicio05Carta();
	    c.add(Ejercicio05CartaAux);
	    
	    for (int i = 0; i < 5; i++) {
	      do {
	        Ejercicio05CartaAux = new Ejercicio05Carta();      
	      } while (c.contains(Ejercicio05CartaAux));
	      
	      c.add(Ejercicio05CartaAux);
	    }
	    
	    
	    for (Ejercicio05Carta miEjercicio05Carta: c) {
	      System.out.println(miEjercicio05Carta);
	      System.out.println("***********"+miEjercicio05Carta.getFigura());
	      System.out.println("***********"+h.get(miEjercicio05Carta.getFigura()));
	      puntos += h.get(miEjercicio05Carta.getFigura());
	    }
	    
	    System.out.println("Tienes " + puntos + " puntos.");
	}

}
