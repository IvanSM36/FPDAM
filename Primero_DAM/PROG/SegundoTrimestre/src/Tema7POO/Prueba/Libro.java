package Tema7POO.Prueba;

public class Libro {
	// atributos
	String isbn;
	String titulo;
	String autor;
	int numeroPag;
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
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

	public int getNumeroPag() {
		return numeroPag;
	}

	public void setNumeroPag(int numeroPag) {
		this.numeroPag = numeroPag;
	}

	/*
	 * Constructor
	 */
	public Libro(){
		this.isbn = "1222222344354AS5";
		this.titulo = "El titulo del libro";
		this.autor = "El autor del Libro";
		this.numeroPag = 234;
	}
	
	public Libro(String isbn, String titulo, String autor, int numeroPag){
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPag = numeroPag;
	}
}

