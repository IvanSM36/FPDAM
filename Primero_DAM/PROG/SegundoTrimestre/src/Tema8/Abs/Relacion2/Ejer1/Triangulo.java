/**
 * 
 */
package Tema8.Abs.Relacion2.Ejer1;

/**
 * @author IvanSM
 *
 */
public class Triangulo extends Figura {
	//Atributos
	private double base;
	private double altura;
	
	//Constructores
	public Triangulo() {
		// TODO Auto-generated constructor stub
	}

	public Triangulo(double base, double altura) {
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
		double area = (base * altura) / 2; 
		return area;
	}

	
}
