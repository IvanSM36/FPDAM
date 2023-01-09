/**
 * 
 */
package Tema8.Abs.Relacion2.Ejer1;

/**
 * @author IvanSM
 *
 */
public class Circulo extends Figura{
	
	//Atributos
	protected double pi = 3.1416;
	protected double radio;
	
	//Constructores
	public Circulo() {
		// TODO Auto-generated constructor stub
	}

	public Circulo(double radio) {
		super();	
		this.radio = radio;
	}

	//Getters and Setters
	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//Metodos

	@Override
	public double calcularArea() {
		double area = pi * (radio * radio);
		return area;
	}

}
