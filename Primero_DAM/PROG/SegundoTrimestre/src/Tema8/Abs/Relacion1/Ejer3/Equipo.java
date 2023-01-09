/**
 * 
 */
package Tema8.Abs.Relacion1.Ejer3;

/**
 * @author IvanSM
 *
 */
public class Equipo extends Ciclista {

	private String nombre;
	private static double tiempoTotal;
	private String pais;

	// Constructores
	public Equipo() {

	}

	public Equipo(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTiempoTotal() {
		return tiempoTotal;
	}

	public void setTiempoTotal(double tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	// Metodos
	public void añadirCiclista(Ciclista ciclista) {

	}

	public void listarEquipo() {

	}

	public void buscarCiclista() {

	}
	
	public void calcularTotalTiempo() {
		
	}
	
	public void imprimir() {
		
	}

	@Override
	public void imprimirTipo() {
		// TODO Auto-generated method stub
		
	}
	
}
