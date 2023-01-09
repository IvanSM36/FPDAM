package Tema8.Abs.Relacion1.Ejer3;

public class Velocista extends Ciclista {

	// Atributos
	private double potenciaPromedio;
	private double velocidadPromedio;

	// Constructores
	public Velocista() {
		// TODO Auto-generated constructor stub
	}

	public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
		super(identificador, nombre);
		this.potenciaPromedio = potenciaPromedio;
		this.velocidadPromedio = velocidadPromedio;
	}

	// Getters and Setters

	public double getPotenciaPromedio() {
		return potenciaPromedio;
	}

	public void setPotenciaPromedio(double potenciaPromedio) {
		this.potenciaPromedio = potenciaPromedio;
	}

	public double getVelocidadPromedio() {
		return velocidadPromedio;
	}

	public void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}

	// Metodos
	
	public void imprimir() {
		
	}
	
	@Override
	public void imprimirTipo() {
		// TODO Auto-generated method stub

	}

}
