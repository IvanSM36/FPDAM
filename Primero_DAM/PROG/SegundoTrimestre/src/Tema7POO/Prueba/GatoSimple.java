package Tema7POO.Prueba;

public class GatoSimple {

	String color;
	String sexo;
	int peso;
	int edad;
	String raza;

	GatoSimple() {

	}

	// constructor
	GatoSimple(String s) {
		this.sexo = s;
	}

	// Getter y Setters
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Constructor sexo del gato
	public void sexo(String sexo) {
		this.sexo = sexo;
	}

	// Metodos
	public void maulla() {
		System.out.println("Miauuu");
	}

	public void ronronear() {
		System.out.println("mmrrrrr");
	}

	public void comer(String comida) {
		if (comida.toLowerCase().equals("pescado")) {
			System.out.println(comida + ", mmmm gracias");
		} else {
			System.out.println(comida + ", Lo siento, solo como pescado");
		}
	}

	public void peleaCon(GatoSimple contrincante) {

		if (this.sexo.equals("hembra")) {
			System.out.println("No me gusta pelear");
		} else {
			if (contrincante.getSexo().equals("hembra")) {
				System.out.println("No peleo con gatitas");
			} else {
				System.out.println("Te muerdo la cola.");
			}
		}
	}

}
