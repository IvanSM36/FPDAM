/**
 * 
 */
package Tema7POO.Relacion1;

/**
 * @author IvanSM
 *
 */
public class Libro {

	/**
	 * Atributos
	 */
	private int isbn;
	private String titulo;
	private String autor;
	private int numPag;
	
	// Constructor
	public Libro(int isbn, String titulo, String autor, int numPag) {		
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}

	// Getters and Setters
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

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

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	@Override
	public String toString() {
		return "Datos del Libro " + this.titulo + "\n----------------------"+ "\nISBN = " + isbn + "\nTitulo = " + titulo + "\nAutor = " + autor + "\nNumPag = " + numPag;
	}
	
	// Metodos
	public void masPaginas(Libro l) {
		if (this.numPag > l.getNumPag()) {
			System.out.println("El libro " + this.titulo + " tiene más paginas");
		} else {
			System.out.println("El libro " + l.getTitulo() + " tiene más paginas");
		}
	}
	

	

}
