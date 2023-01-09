/**
 * 
 */
package Tema8.Abs.Relacion2.Ejer1;

/**
 * @author IvanSM
 *
 */
public class Rectangulo extends Figura {

	//Atributos
	protected double base;
	protected double altura;

	//Constructores
	public Rectangulo() {

	}
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	//Getters and Setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	//Metodos
	@Override
	public double calcularArea() {
		double area = base * altura;
		return area;
	}

}
