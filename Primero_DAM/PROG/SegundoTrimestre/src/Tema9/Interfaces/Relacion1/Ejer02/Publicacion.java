package Tema9.Interfaces.Relacion1.Ejer02;

public class Publicacion {
	//Atributos
	protected int isbn;
	protected String titulo;
	protected String anioPublicacion;
	
	//Constructores
	//Por defecto 
	public Publicacion() {
		this.isbn = 0;
		this.titulo = "Desconocido";
		this.anioPublicacion = "Desconocida";
	}

	public Publicacion(int isbn, String titulo, String anioPublicacion) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}

	//Getters and Setters

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

	public String getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(String anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Publicacion [isbn=" + isbn + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + "]";
	}
	
	
	
}
