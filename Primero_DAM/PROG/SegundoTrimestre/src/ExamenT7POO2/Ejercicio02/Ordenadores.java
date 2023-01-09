package ExamenT7POO2.Ejercicio02;
public class Ordenadores {

	// Atributos
	private String marca;
	private int cantMemoria;
	private String datosProcesador;
	private String so;
	private double precio;
	private int unidades;

	// Constructores
	public Ordenadores(String marca, int cantMemoria, String datosProcesador, String so, double precio, int unidades) {
		if (unidades > 4) {
			System.out.println("Solo se puede comprar maximo 4 unidades");
			this.marca = "Desconocida";
			this.cantMemoria = 0;
			this.datosProcesador = "Desconocido";
			this.so = "Desconocido";
			this.precio = 0;
			this.unidades = 0;
		} else {
			this.marca = marca;
			this.cantMemoria = cantMemoria;
			this.datosProcesador = datosProcesador;
			this.so = so;
			this.precio = precio;
			this.unidades = unidades;
		}
	}
	
	//Getters and Setters
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

	public String getDatosProcesador() {
		return datosProcesador;
	}

	public void setDatosProcesador(String datosProcesador) {
		this.datosProcesador = datosProcesador;
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
	public void promocionPC(String marca) {
		double precioOferta = 0;
		double descuento = 0;
		if (marca.equals("Acer")) {
			descuento = this.precio * 0.15;
			precioOferta = this.precio - descuento;
			System.out.println("Oferta de 15% " + "\n-------------" + "\nPrecio Actual: " + this.precio
					+ "\nDescuento: " + descuento + "\nPrecio final: " + precioOferta + "€");
		}
	}

}