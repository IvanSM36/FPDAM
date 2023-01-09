/**
 * 
 */
package Tema7POO.Relacion2;

/**
 * @author IvanSM
 *
 */
public class AlbumMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creo el album
		Album caribe2003 = new Album(3);
		//Creo los objetos
		Cancion cancion1 = new Cancion("Do it to it", "Acraze");
		Cancion cancion2 = new Cancion("A guiro", "Rafa Pabon");
		Cancion cancion3 = new Cancion("Mil Amores", "Moncho Chavea");
	
		// Agregamos canciones al album
		caribe2003.agregar(cancion1);
		caribe2003.agregar(cancion2);
		caribe2003.agregar(cancion3);
		
		//caribe2003.grabaCancion(2, cancion3);
		
		caribe2003.dameCancion(1);
		caribe2003.dameCancion(2);
		caribe2003.dameCancion(3);
		
		System.out.println();
		System.out.println("El numero de canciones grabadas del album es "+caribe2003.numeroCanciones());
		caribe2003.muestraAlbum();
	}

}
