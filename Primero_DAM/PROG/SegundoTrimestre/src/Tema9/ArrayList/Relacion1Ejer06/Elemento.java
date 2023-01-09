package Tema9.ArrayList.Relacion1Ejer06;

public class Elemento {

	// Atributos
	protected String producto;
	protected double precio;
	protected int cantidad;

	// Constructores
	public Elemento() {

	}

	public Elemento(String producto, double precio, int cantidad) {
		this.producto = producto;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	// Getters and Setters

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	// Metodos
	@Override
	public String toString() {
		return this.producto + " PVP: " + String.format("%.2f", this.precio) + " Unidades: " + this.cantidad
				+ " Subtotal: " + String.format("%.2f", this.precio * this.cantidad);
	}

}
