package Tema7POO.Relacion2;

public class Album {

	///// Atributos /////
	private Cancion[] albumCanciones;
	private int contadorCanciones = 0;

	///// Constructores /////
	
	// Por defecto
	public Album() {
		this.albumCanciones = new Cancion[10];
	}

	// Pedir tamaño del album
	public Album(int tamanno) {
		this.albumCanciones = new Cancion[tamanno];
	}

	///// Getters and Setters /////
	public Cancion[] getAlbumCanciones() {
		return albumCanciones;
	}

	public void setAlbumCanciones(Cancion[] albumCanciones) {
		this.albumCanciones = albumCanciones;
	}

	public int getContador() {
		return contadorCanciones;
	}

	public void setContador(int contador) {
		this.contadorCanciones = contador;
	}

	///// Metodos /////

	/**
	 * @author RAYMA metodo que devuelve el numero de canciones guardados en el
	 *         album a traves del atributo contadorcanciones.
	 * @return int contadorcanciones.
	 */
	public int numeroCanciones() {
		return contadorCanciones;
	}
	
	public void dameCancion(int posicion) {
		posicion = posicion-1;
		if(posicion< albumCanciones.length && albumCanciones[posicion] != null) {
			System.out.println ("La cancion de la posicion indicada es " + albumCanciones[posicion].getTitulo());
		}else {
			System.out.println ("Esa pista esta vacia o no existe");	
		}
	}
	
	/**
	 * @author RAYMA metodo que graba en la posicion indicada la nueva cancion si
	 *         estaba vacio lo asigna y si estaba llena la cambia por la nueva.
	 * @param int posicionCancion, objeto cancion con parametros, titulo y autor
	 *            (String,String)
	 */
	public void grabaCancion(int posicionCancion, Cancion x) {
		posicionCancion = posicionCancion-1;
		if (posicionCancion < albumCanciones.length && albumCanciones[posicionCancion] != null) {
			albumCanciones[posicionCancion] = x;
			System.out.println("Cancion " + albumCanciones[posicionCancion].getTitulo()
					+ " ha sustituido a la cancion actual de la pista " + posicionCancion);
		}
		if (posicionCancion < albumCanciones.length && albumCanciones[posicionCancion] == null) {
			System.out.println("La pista aún no tiene ninguna canción grabada. La voy a añadir.");
			albumCanciones[posicionCancion] = x;
			contadorCanciones++;
		} else {
			System.out.println("El album solo tiene " + albumCanciones.length + " pistas. Indique una pista valida.");
		}
	}
	public void agregar(Cancion cancion) {
		boolean vacio = false;

		if (contadorCanciones < albumCanciones.length) {
			for (int i = 0; i < albumCanciones.length && !vacio; i++) {
				if (albumCanciones[i] == null) { // controlo los nulos
					albumCanciones[i] = cancion;// Inserto la cancion
					contadorCanciones++;// sumo al contador una cancion
					vacio = true; // Indico que lo he encontrado
				}
			}

			if (vacio) {
				System.out.println("Se ha añadido la cancion");
			}
		} else {
			System.out.println("El album esta completo. Pruebe con grabaCancion para modificar una por otra.");
		}

	}
	/**
	 * @author 
	 * metodo para eliminar una cancion del album siempre que haya una 
	 * grabada en la pista indicada.
	 * @param int posicionCancion
	 */
	public void eliminaCancion(int posicionCancion) {

		if (posicionCancion < albumCanciones.length && albumCanciones[posicionCancion] != null) {
					albumCanciones[posicionCancion] = null;// Borro la cancion
					contadorCanciones--;// resto al contador una cancion
				
		} else {
			System.out.println("Pista inexistente o vacia.");
		}
	}
	
	/**
	 * 
	 * metodo que muestra titulo y autor de todas las canciones grabadas.
	 * @return String
	 */
	public void muestraAlbum() {
	
		for (int i = 0 ; i < albumCanciones.length ; i++) {
			if(albumCanciones[i] == null) {
				System.out.println( "Pista "+(i+1)+" vacia." );
			}if (albumCanciones [i] != null) {
			
				System.out.println ( "Cancion pista "+(i+1)+" Titulo - "+albumCanciones[i].getTitulo()+" ** Autor - "+albumCanciones[i].getAutor());
			}
		}System.out.println("Fin del disco.");
	}

}
