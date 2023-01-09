/**
 * 
 */
package Tema8.Abs.Relacion2.Ejer1;

/**
 * @author IvanSM
 *
 */
public abstract class Figura {

	protected double area;
	
	public Figura() {
		// TODO Auto-generated constructor stub
	}

	//Constructores
	public Figura(double area) {
		super();
		this.area = area;
	}
	
	//Getters and Setters

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	//Metodos
	
	public abstract double calcularArea();
		
}
