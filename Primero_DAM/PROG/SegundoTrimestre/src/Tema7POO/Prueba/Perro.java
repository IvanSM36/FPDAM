package Tema7POO.Prueba;

public class Perro {

	String nombre;
	String raza;
	int edad;
	int nivelHambre;

	public Perro() {
		// TODO Auto-generated constructor stub
		this.nombre = "";
		this.raza =	"indeterminada";
		this.edad = 0;
		this.nivelHambre = 0;
	}
	
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNivelHambre() {
		return nivelHambre;
	}

	public void setNivelHambre(int nivelHambre) {
		this.nivelHambre = nivelHambre;
	}

	public void ladrar() {
		System.out.println("guau guau");
	}

	public void comer (String comida) {
		if(comida.toLowerCase().equals("jamon")) {
			System.out.println(comida + ", mmmm que bueno");
		}else {
			System.out.println(comida + ", Ahgg, no gracias");
		}
	}
}
