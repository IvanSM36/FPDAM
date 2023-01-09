package ExamenT7POO2.Ejercicio02;

public class Tablets {

	// Atributos
	private String marca;
	private int cantMemoria;
	private String so;
	private double precio;
	private int unidades;

	// Constructores
	public Tablets(String marca, int cantMemoria, String so, double precio, int unidades) {
		if (unidades > 2) {
			System.out.println("Solo se puede comprar maximo 2 unidades");
			this.marca = marca;
			this.cantMemoria = cantMemoria;
			this.so = so;
			this.precio = precio;
			this.unidades = unidades;
		} else {
			this.marca = marca;
			this.cantMemoria = cantMemoria;
			this.so = so;
			this.precio = precio;
			this.unidades = unidades;
		}

	}

	// Getters and Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantMemoria() {
		return cantMemoria;
	}

	public void setCantMemoria(int cantMemoria) {
		this.cantMemoria = cantMemoria;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	// Metodos
	public void promocionTablets(String marca) {
		double precioOferta = 0;
		double descuento = 0;
		if (marca.equals("Samsung")) {
			descuento = this.precio * 0.1;
			precioOferta = this.precio - descuento;
			System.out.println("Oferta de 10% " + "\n-------------" + "\nPrecio Actual: " + this.precio
					+ "\nDescuento: " + descuento + "\nPrecio final: " + precioOferta + "€");
		}
	}

}
