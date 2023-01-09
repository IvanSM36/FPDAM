/**
 * 
 */
package Tema8.Abs.Relacion1.Ejer3;

/**
 * @author IvanSM
 *
 */
public abstract class Ciclista {

	//Atributos
	private int identificador;
	private String nombre;
	private int TiemporAcumulado;
	
	//Constructores	
	public Ciclista() {

	}

	public Ciclista(int identificador, String nombre) {
		this.identificador = identificador;
		this.nombre = nombre;
	}

	//Getters and Setters
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTiemporAcumulado() {
		return TiemporAcumulado;
	}

	public void setTiemporAcumulado(int tiemporAcumulado) {
		TiemporAcumulado = tiemporAcumulado;
	}
	
	//Metodos
	public abstract void imprimirTipo();
	

}
