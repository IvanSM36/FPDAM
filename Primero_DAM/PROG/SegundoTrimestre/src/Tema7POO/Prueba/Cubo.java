/**
 * 
 */
package Tema7POO.Prueba;

/**
 * @author IvanSM
 *
 */
public class Cubo {

	// Atributos
	String material;
	boolean asa;
	String color;
	int capacidadMax;
	int capacidadActual;

	// Sin parametros
	public Cubo() {

	}

	// Por defecto
	public Cubo(String material, boolean asa, String color, int capacidadMax, int capacidadActual) {
		this.material = "plastico";
		this.asa = false;
		this.color = "negro";
		this.capacidadMax = 10;
		this.capacidadActual = 0;
	}

	// Con 1 parametro capacidadActual
	public Cubo(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	// Get and Set
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isAsa() {
		return asa;
	}

	public void setAsa(boolean asa) {
		this.asa = asa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	// Metodos
	public void llenarCubo() {
		this.capacidadActual = this.capacidadMax;
	}

	public void vaciarCubo() {
		this.capacidadActual = 0;
	}

	public void pintarCubo() {

		for (int nivel = this.capacidadMax; nivel > 0; nivel--) {
			if (this.capacidadActual >= nivel) {
				System.out.println("#~~~~#");
			} else {
				System.out.println("#    #");
			}
		}
		System.out.println("######");
	}
		
		// Palos verticales de la U
		/*System.out.println();
		for (int i = this.capacidadActual; i < 10; i++) {
			System.out.print("* ");
			for (int j = 2; j < this.capacidadActual; j++) {
				System.out.print(" * ");
			}
			System.out.println(" * ");
		}

		// Base de la U
		System.out.print("  ");
		for (int i = 2; i < 10; i++) {
			System.out.print(" * ");
		}*/
	
}
