package PracticaHashTable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PruebaHashMapSincro {

	public static void main(String[] args) {
		
		// Declaramos el HashMap normal
        Map<String, String> hMap = new HashMap<String, String>();
        
        // Agregamos elementos en el HashMap
        hMap.put("1", "");
        hMap.put("2", "To");
        hMap.put("3", "Geeks");
        hMap.put("4", "For");
        hMap.put("5", "Geeks");
        
        // Imprimimos contenido normal
        System.out.println("Map : " + hMap);
        
        // Sincronizamos el contenido del hash
        Map<String, String> sMap = Collections.synchronizedMap(hMap);

        // Imprimimos sincronizado
        System.out.println("Synchronized map is : " + sMap);

	}

}
