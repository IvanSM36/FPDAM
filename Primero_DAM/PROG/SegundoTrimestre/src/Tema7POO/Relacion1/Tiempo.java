/**
 * 
 */
package Tema7POO.Relacion1;

/**
 * @author IvanSM
 *
 */
public class Tiempo {

	/**
	 * 
	 */
	private int segundos;
	
	// Constructores
	public Tiempo(int horas, int minutos, int segundos) {
		this.segundos = (horas * 3600) + (minutos * 60) + (segundos);
	}
	
	public Tiempo (int seg) {
		this.segundos = seg;
	}
	
	//Guetter and Setters
	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	// Metodos
	public String toString() {
		int segundos = this.segundos;
		int horas = segundos / 3600;
		segundos -= horas * 3600;
		int minutos = segundos / 60;
		segundos -= minutos * 60;
		if (this.segundos < 0) {
		return "-(" + (-horas) + "h " + (-minutos) + "m " + (-segundos) + "s)";
		} else {
		return horas + "h " + minutos + "m " + segundos + "s";
		}
	}
	//Suma
	public Tiempo suma (Tiempo t) {
		return new Tiempo(this.segundos + t.getSegundos());
	}
	
	// Resta
	public Tiempo resta (Tiempo t) {
		return new Tiempo(this.segundos - t.getSegundos());
	}
}
