/**
 * 
 */
package Tema8.Abs.Relacion1.Ejer3;

/**
 * @author IvanSM
 *
 */
public class Escalador extends Ciclista {

	// Atributos
	private double aceleracionPromedio;
	private double gradoRampa;

	// Constructores
	public Escalador() {

	}

	public Escalador(int identificador, String nombre, double aceleracionPromedio, double gradoRampa) {
		super(identificador, nombre);
		this.aceleracionPromedio = aceleracionPromedio;
		this.gradoRampa = gradoRampa;
		// TODO Auto-generated constructor stub
	}

	// Getters and Setters
	public double getAceleracionPromedio() {
		return aceleracionPromedio;
	}

	public void setAceleracionPromedio(double aceleracionPromedio) {
		this.aceleracionPromedio = aceleracionPromedio;
	}

	public double getGradoRampa() {
		return gradoRampa;
	}

	public void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}

	// Metodos

	public void imprimir() {

	}

	@Override
	public void imprimirTipo() {
		// TODO Auto-generated method stub

	}

}
