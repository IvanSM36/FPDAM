package ExamenFicheros.ejercicio03;

/**
 * 
 * @author alejm
 *
 */

public class Empleado {

	// Atributos
	private String DNI;
	private String cargo;
	private int salario;
	private int productividad;

	// Constructor
	public Empleado(String DNI, String cargo, int salario, int productividad) {
		this.DNI = DNI;
		this.cargo = cargo;
		this.salario = salario;
		this.productividad = productividad;
	}

	// Getters
	public String getDNI() {
		return DNI;
	}

	public String getCargo() {
		return cargo;
	}

	public int getSalario() {
		return salario;
	}

	public int getProductividad() {
		return productividad;
	}
}
