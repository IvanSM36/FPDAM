package Tema7POO.Relacion1;

public class Caballo {

	private String nombre;
	private String raza;
	private String color;
	private int edad;
	private int carrerasGanadas;
	
	// Constructor por defecto
	public Caballo(String nombre, String raza, String color, int edad, int carrerasGanadas) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.edad = edad;
		this.carrerasGanadas = carrerasGanadas;
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCarrerasGanadas() {
		return carrerasGanadas;
	}

	public void setCarrerasGanadas(int carrerasGanadas) {
		this.carrerasGanadas = carrerasGanadas;
	}
	
	// Metodos
	
	public void cabalga(){
		System.out.println("El caballo " + this.getNombre() + " está cabalgando");
	}
	public void rumia() {
		System.out.println("El caballo " + this.getNombre() + " está rumiendo");
	}
	public void relincha() {
		System.out.println("El caballo " + this.getNombre() + " está relinchando");
	}
	public void trota() {
		System.out.println("El caballo " + this.getNombre() + " está trotando");
	}
}
