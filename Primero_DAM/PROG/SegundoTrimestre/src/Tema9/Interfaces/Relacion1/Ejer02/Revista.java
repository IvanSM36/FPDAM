package Tema9.Interfaces.Relacion1.Ejer02;

public class Revista extends Publicacion{
	//Atributos
	protected int numero;

	//Constructores
	//Por defecto
	public Revista() {
		
	}

	public Revista(int isbn, String titulo, String anioPublicacion, int numero) {
		super(isbn, titulo, anioPublicacion);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Revista [numero=" + numero + ", isbn=" + isbn + ", titulo=" + titulo + ", anioPublicacion="
				+ anioPublicacion + "]";
	}

  	
	
	
}
