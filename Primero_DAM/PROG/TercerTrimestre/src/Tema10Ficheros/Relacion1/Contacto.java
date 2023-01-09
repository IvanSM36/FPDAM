package Tema10Ficheros.Relacion1;

public class Contacto {
	// Atributos
	private String nombre;
	private int numero;
	
	// Constructores
	
	public Contacto() {
		
	}
	
	public Contacto(String nombre, int numero) {
		this.nombre = nombre;
		this.numero = numero;
	}

	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Contacto [Nombre: " + nombre + " Numero: " + numero + "]";
	}
	
	
}
