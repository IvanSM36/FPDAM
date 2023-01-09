package Tema8.Herencia.Relacion2.Ejer02;

public class Libro {
	//Atributos
	protected String titulo;
	protected String autor;
	protected double precio;
	
	//Constructores
	public Libro() {

	}

	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		
	}

	//Getters and Setters
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Libro \ntitulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	
	// Imprimir en pantalla el título, los autores y el precio del libro.
	/*public void imprimir() {
		System.out.println("Datos del libro " + titulo);
		System.out.println("--------------------------");
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor " + autor);
		System.out.println("Precio: " + precio);
	}*/

}
