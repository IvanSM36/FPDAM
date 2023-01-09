/**
 * 
 */
package Tema7POO.Relacion1;

/**
 * @author IvanSM
 *
 */
public class Persona2 {

	/**
	 * 
	 */
	// Constantes
	public final static char sexo_def = 'H';
	public final int infrapeso = -1;
	public final int peso_ideal = 0;
	public final int sobrepeso = 1;

	// atributos
	private String nombre;
	private int edad;
	private char sexo;
	private double peso;
	private double altura;

	// Constructor por defecto
	public Persona2() {

	}

	// Constructor 3 parametros
	public Persona2(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.altura = altura;
	}

	// Constructor con 5 parametros
	public Persona2(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	// Getters and Sertters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Metodo
	// calculara si la persona está en su peso ideal
	public int calcularIMC() {
		double imc = (peso /(altura * altura));
		if (imc >= 20 && imc <= 25) {
			return peso_ideal;
		} else if (imc < 20) {
			return infrapeso;
		} else {
			return sobrepeso;
		}
	}

	// indica si es mayor de edad, devuelve un booleano.
	public boolean esMayorDeEdad(int edad) {
		boolean mayorEdad = false;
		if (edad >= 18) {
			mayorEdad = true;
		} else {
			mayorEdad = false;
		}
		return mayorEdad;
	}
	//Metodos Privados
	// comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior
	private void comprobarSexo(char sexo) {
		if (sexo != 'H' || sexo != 'M' ) {
			this.sexo = 'H';
		} else {
			this.sexo = sexo;
		}
	}

	// Metodo to String
	@Override
	public String toString() {
		return "Datos de " + this.nombre + "\nNombre = " + nombre + "\nEdad = " + edad + "\nSexo = " + sexo + "\nPeso="
				+ peso + "\nAltura=" + altura;
	}

}
