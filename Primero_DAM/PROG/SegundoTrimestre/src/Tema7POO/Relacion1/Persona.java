package Tema7POO.Relacion1;

public class Persona {
	// Atributos
	private String nombre;
	private String apellido;
	private int edad;
	private char sexo;
	
	// Constructores
	public Persona() {
		//Sin parametros
	}

	public Persona(String n ,String a, int e,char s){
		this.nombre = n;
		this.apellido = a;
		this.edad = e;
		this.sexo = s;
	}
	
	// Get and set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelllido() {
		return apellido;
	}

	public void setApellido(String apelllido) {
		this.apellido = apelllido;
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
	
	// Metodos
	
	// Metodo toString
	public String toString() {
		String datos;
		datos = "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nSexo: " + sexo;
		return datos;
	}
	
	// Saluda a otra persona
	public void saludar(Persona p) {
		System.out.println("Hola " + p.getNombre() + " ¿Qué tal estás?" + " soy " + this.getNombre() );
	}
}
