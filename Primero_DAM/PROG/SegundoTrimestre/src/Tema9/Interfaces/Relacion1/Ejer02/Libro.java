package Tema9.Interfaces.Relacion1.Ejer02;

public class Libro extends Publicacion implements Prestable {
	// Atributos
	protected boolean prestado;

	// Constructores
	public Libro(int isbn, String titulo, String anioPublic) {
		super(isbn, titulo, anioPublic);
		this.prestado = false;
	}

	// Guetters and Setters

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	// Metodos
	@Override
	public String toString() {
		return "Libro [prestado=" + prestado + ", isbn=" + isbn + ", titulo=" + titulo + ", anioPublicacion="
				+ anioPublicacion + "]";
	}

	// Metodo que presta el libro
	@Override
	public void presta() {
		if(estaPrestado()) {
			this.prestado = true;
			System.out.println("El libro se va a prestar.");
		}			
	}

	@Override
	public void devuelve() {
		if(estaPrestado()) {
			this.prestado = false;
		}	
	}

	@Override
	public boolean estaPrestado() {
		if(prestado = true) 	{
			return true;
		}
		return false;
	}

}
