package Tema9.ArrayList.Pruebas;

public class Gato implements Comparable<Gato> {

	//Atributos
	protected String nombre;
	protected String color;
	protected String raza;
	
	public Gato(String nombre, String color, String raza) {
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	//Metodo
	@Override
	public int compareTo(Gato g) {
		return (this.nombre).compareTo(g.getNombre());
	}

}
