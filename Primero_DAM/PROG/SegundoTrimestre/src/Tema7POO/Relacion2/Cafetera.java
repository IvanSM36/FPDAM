/**
 * 
 */
package Tema7POO.Relacion2;

/**
 * @author IvanSM
 *
 */
public class Cafetera {

	/**
	 * Atributos
	 */
	
	private int capacidadMaxima;
	private int cantidadActual;
	
	///// Constructores /////
	// Por defecto
	public Cafetera() {
		this.cantidadActual = 0;
		this.capacidadMaxima = 1000;
	}
	
	// Capacidad maxima
	public Cafetera(int num) {
		this.capacidadMaxima = num;
		this.cantidadActual = num;
	}
	
	// Si la cantidad actual es mayor al maximo se iguala al maximo.
	public Cafetera (int actu, int maximo) {	
		this.capacidadMaxima = maximo;
		if (actu > maximo) {
			this.cantidadActual = this.capacidadMaxima;
		}
	}
	
	///// Getter and Setters /////
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	///// Metodos/////
	// Hace que la cantidad actual sea igual a la capacidad
	public int llenarCafe() {
		return this.cantidadActual = this.capacidadMaxima;
	}
	
	// Simula la acción de servir una taza con la capacidad indicada. Si la cantidad actual de café no alcanza para llenar la taza, se sirve lo que quede. Devolverá la cantidad de café servida.
	public void servirTaza(int servir) {
		if (this.cantidadActual> servir) { //Cantidad actual de la cafetera 
			this.capacidadMaxima = this.capacidadMaxima - servir;
			this.cantidadActual = servir; //Se sirve
		} else {
			servir = this.cantidadActual; // Se sirve la cantidad actuañ
			this.cantidadActual = 0; //La cafetera se queda cero.
		}
		System.out.println(toString() + " y el cafe servido es: " + servir);	
	}
	
	// Pone la cantidad de café actual en cero.
	public int vaciarCafetera () {
		return this.cantidadActual = 0;
	}
	
	// Añade a la cafetera la cantidad de café indicada
	public int agregarCafe (int cantidad) {
		return this.cantidadActual = this.cantidadActual + cantidad;
	}
	// metodo toString

	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}
	
	
}
