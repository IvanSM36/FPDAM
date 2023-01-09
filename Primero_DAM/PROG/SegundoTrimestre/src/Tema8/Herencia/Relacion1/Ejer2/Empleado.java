/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer2;

/**
 * @author IvanSM
 *
 */
public class Empleado {

	/**
	 * Atributos
	 */
	protected String nombre;
	protected String apellido1;
	protected int edad;
	protected int salario;
	
	///// Constructores /////
	public Empleado() {

	}
	
	public Empleado(String nombre, String apellido1, int edad, int salario) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.edad = edad;
		this.salario = salario;
	}

	///// Getters and Setters /////
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	///// Metodos /////	
	
	//Si tienes (>40 años) mas de 300
	public void plus (double sueldoPlus) {
		if(this.edad > 40) {
			salario += sueldoPlus;
		}
		
	}

}
