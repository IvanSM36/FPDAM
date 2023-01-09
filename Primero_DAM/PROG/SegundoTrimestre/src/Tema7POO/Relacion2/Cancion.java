/**
 * 
 */
package Tema7POO.Relacion2;

/**
 * @author IvanSM
 *
 */
public class Cancion {

	/**
	 * Atributos
	 */
	private String titulo;
	private String autor;
	
	///// Constructores /////
	//Constructor por defecto
	public Cancion() {
		titulo = "";
		autor = "";
	}

	public Cancion(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	///// Getters and Setters /////
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
